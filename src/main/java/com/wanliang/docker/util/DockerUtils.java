package com.wanliang.docker.util;

import com.google.common.base.Strings;
import com.wanliang.docker.model.ContainerConfig;
import com.wanliang.docker.model.Info;
import com.wanliang.docker.model.ui.SwarmInfo;
import com.wanliang.docker.model.ui.UINode;
import com.wanliang.docker.result.ResultCode;
import com.wanliang.docker.result.ServiceCallResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;


/**
 * Some utils
 */
public final class DockerUtils {

    public static final String SERVICE_TYPE = "service-type";
    public static final String JAVA_OPTS = "JAVA_OPTS=";
    public static final String PORT_MAPPING = "portMapping";
    public static final String RESTART = "restart";
    public static final String LOG_DIR = "logDir";
    public static final String SCALABLE = "scalable";
    public static final String MEMORY = "memory";

    static ServiceCallResult getServiceCallResult(ResponseEntity<String> res) {
        ServiceCallResult callResult = new ServiceCallResult();
        callResult.setMessage(res.getBody());
        HttpStatus httpCode = res.getStatusCode();
        ResultCode code;
        switch (httpCode.value()) {
            case 204:
                code = ResultCode.OK;
                break;
            case 304:
                code = ResultCode.NOT_MODIFIED;
                break;
            case 404:
                code = ResultCode.NOT_FOUND;
                break;
            default:
                //due doc 500 - is error, but any other than above codes is undefined we interpret this cases as error also.
                code = ResultCode.ERROR;
        }
        callResult.setCode(code);
        return callResult;
    }

    /**
     * Return full host name
     * @param config
     * @return
     */
    public static String getFullHostName(ContainerConfig config) {
        String domainname = config.getDomainname();
        String hostname = config.getHostname();
        if(Strings.isNullOrEmpty(hostname)) {
            return null;
        }
        if(Strings.isNullOrEmpty(domainname)) {
            return hostname;
        }
        return hostname + "." + domainname;
    }


    /**
     * Hack for using swarm API
     * @param info
     * @return
     */
    public static SwarmInfo getSwarmInfo(Info info) {
        SwarmInfo.Builder uiInfo = SwarmInfo.newUIInfo();
        uiInfo.id(info.getId())
                .name(info.getName())
                .containers(info.getContainers())
                .images(info.getImages())
                .ncpu(info.getNcpu())
                //Convert to GB
                .memory(UiUtils.convertToGB(info.getMemory()));
        List<List<String>> driverStatus = info.getDriverStatus();
        for (int i = 0; i < driverStatus.size(); i++) {
            List<String> list = driverStatus.get(i);
            boolean nodes = list.get(0).contains("Nodes");
            if (nodes || (uiInfo.getNodeCount() != null && uiInfo.getNodeList().size() != uiInfo.getNodeCount())) {

                if (nodes) {
                    uiInfo.nodeCount(Integer.parseInt(list.get(1)));
                    i++;
                }
                UINode.Builder uiNode = UINode.newUINode()
                        .name(getKey(driverStatus, i))
                        .path(getValue(driverStatus, i++))
                        .healthy(getValue(driverStatus, i++))
                        .containers(getValue(driverStatus, i++))
                        .reservedCPUs(getValue(driverStatus, i++))
                        .reservedMemory(getValue(driverStatus, i++))
                        .labels(getValue(driverStatus, i));
                uiInfo.getNodeList().add(uiNode.build());
                if (i == (driverStatus.size() - 1)) {
                    break;
                }
            }
        }
        return uiInfo.build();
    }

    public static List<String> listNodes(Info info) {

        SwarmInfo swarmInfo = getSwarmInfo(info);
        List<String> list = new ArrayList<>();
        List<UINode> nodeList = swarmInfo.getNodeList();
        for (UINode uiNode : nodeList) {
            list.add(uiNode.getName());
        }
        return list;
    }

    private static String getKey(List<List<String>> driverStatus, int i) {
        return driverStatus.get(i).get(0);
    }

    private static String getValue(List<List<String>> driverStatus, int i) {
        return driverStatus.get(i).get(1);
    }

}
