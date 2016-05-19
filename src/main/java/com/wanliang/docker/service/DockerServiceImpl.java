package com.wanliang.docker.service;

import com.wanliang.docker.config.DockerServiceConfig;
import com.wanliang.docker.model.Container;
import com.wanliang.docker.model.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import static java.util.Arrays.asList;
import static org.springframework.web.util.UriComponentsBuilder.newInstance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2016/5/19.
 */
@Component
public class DockerServiceImpl implements DockerService {

    private static final Logger LOG = LoggerFactory.getLogger(DockerServiceImpl.class);
    @Autowired
    private RestTemplate restTemplate;
    public static final String SUFF_JSON = "/json";

    @Autowired
    public DockerServiceConfig dockerServiceConfig;

    @Override
    public List<Container> getContainers() {
      //  Assert.notNull(arg, "arg is null");
        UriComponentsBuilder builder = makeUrl("containers/" + SUFF_JSON);
      //  builder.queryParam("all", arg.isAll() ? "1" : "0");
        ResponseEntity<Container[]> containers = restTemplate.getForEntity(builder.toUriString(), Container[].class);
        return Collections.unmodifiableList(asList(containers.getBody()));
    }
    @Override
    public List<Image> getImages() {
        //  Assert.notNull(arg, "arg is null");
        UriComponentsBuilder builder = makeUrl("images/" + SUFF_JSON);
        //  builder.queryParam("all", arg.isAll() ? "1" : "0");
        ResponseEntity<Image[]> images = restTemplate.getForEntity(builder.toUriString(), Image[].class);
        return Collections.unmodifiableList(asList(images.getBody()));
    }
    private UriComponentsBuilder makeUrl(String part) {
        return makeBaseUrl().path("/" + part);
    }

    private UriComponentsBuilder makeBaseUrl() {
        return newInstance().scheme("http").host(dockerServiceConfig.getHost()).port(dockerServiceConfig.getPort());
    }

}
