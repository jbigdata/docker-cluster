package com.wanliang.docker.controller;

import com.sun.org.apache.xml.internal.resolver.Catalog;
import com.wanliang.docker.model.Container;
import com.wanliang.docker.model.ClusterInfo;
import com.wanliang.docker.model.VersionInfo;
import com.wanliang.docker.model.ui.UiContainer;
import com.wanliang.docker.service.DockerService;
import com.wanliang.docker.util.ContainerUtils;
import com.wanliang.docker.util.UiUtils;
import javafx.util.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/5/18.
 */
@RestController
@RequestMapping("/api/v1/")
public class DockerController {

    @Autowired
    private DockerService dockerService;
    @Value("${docker.system.containers:swarm,weave}")
    private String[] systemContainers;
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public ClusterInfo info(HttpServletResponse response) throws Exception {
        ClusterInfo info = new ClusterInfo();
        info.setContainersRunning(dockerService.getContainers().size());
        info.setImages(dockerService.getImages().size());
        info.setContainersStopped(20);
        info.setOperatingSystem("Linux CentOS");
        return info;
    }

    @RequestMapping(value = "/version", method = RequestMethod.GET)
    public VersionInfo version(HttpServletResponse response) throws Exception {
        VersionInfo versionInfo=new VersionInfo();
        versionInfo.setApiVersion("1.2.2");
        versionInfo.setOs("Centos 7.0");
        versionInfo.setVersion("1.2.2");
        return versionInfo;
    }

    @RequestMapping(value = "/images")
    @Cacheable("listImages")
    @DefineCache(expireAfterWrite = 120_000)
    public List<String> listImages() {
        Catalog catalog = registryService.getCatalog();
        List<String> repositories = catalog.getRepositories();
        return filter(repositories);
    }

    @RequestMapping(value = "/containers", method = RequestMethod.GET)
    public List<UiContainer> containers(HttpServletResponse response) throws Exception {

//        return dockerService.getContainers();
        List<UiContainer> list = new ArrayList<>();
       // GetContainersArg arg = new GetContainersArg();
       // arg.setAll(true);
        List<Container> containers = dockerService.getContainers();
        for(Container container: containers) {
            if (filterContainers(container)) continue;
            Pair<String, String> containerNameAndNodeName = ContainerUtils.getContainerNameAndNodeName(container.getNames());
            String status = container.getStatus();
            UiContainer uic = UiContainer.newUiContainer()
                    .id(container.getId())
                    .name(containerNameAndNodeName.getKey())
                    .node(containerNameAndNodeName.getValue())
                    .ports(container.getPorts().toString())
                    .status(status)
                    .run(UiUtils.calculateIsRun(status))
                    .image(container.getImage())
                    .created(container.getCreated())
                    .command(container.getCommand())
                    .readOnly(calculateReadOnly(container))
                    .build();
            list.add(uic);
        }
        Collections.sort(list);
        return list;
    }

    private boolean filterContainers(Container container) {
        for (int i = 0; i < systemContainers.length; i++) {
            String systemContainer = systemContainers[i];
            if (container.getImage().contains(systemContainer)) {  return true; }
        }
        return false;
    }

    private Boolean calculateReadOnly(Container container) {
        Map<String, String> labels = container.getLabels();
//        String type = labels.get(SERVICE_TYPE);
//        if ("customer".equals(type)) {
//            return false;
//        }
        return true;
    }
}
