package com.wanliang.docker.model.ui;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Data which uses in creation of new container.
 * see descriptions: com.navinfo.opentsp.gateway.cluster.docker.management.argument.CreateContainerArg
 */
public class UiNewContainer {

    public static final String JAVA_OPTS = "JAVA_OPTS=";
    private @NotNull String tag = "latest";
    private @NotNull String image;
    private String node;
    private List<String> env;
    /**
     * Part of UiNewContainer#env was fetched for more convenient using on clients
     */
    private String javaOpts;
    private String dockerLogDir;
    private String hostLogDir;
    private String containerName;
    private String restartPolicy;
    private String portBinding;
    private Integer cpuShares;
    private Integer cpuQuota;
    private Integer blkio;
    private Double memoryInMb;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * default value is latests
     * @return version
     */
    public String getTag() {
        return tag;
    }

    /**
     * default value is latests
     * @param tag
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public List<String>  getEnv() {
        return env;
    }

    public void setEnv(List<String>  env) {
        this.env = env;
    }

    public String getJavaOpts() {
        return javaOpts;
    }

    public void setJavaOpts(String javaOpts) {
        this.javaOpts = javaOpts;
    }

    public Double getMemoryInMb() {
        return memoryInMb;
    }

    public void setMemoryInMb(Double memoryInMb) {
        this.memoryInMb = memoryInMb;
    }

    public Integer getCpuShares() {
        return cpuShares;
    }

    public void setCpuShares(Integer cpuShares) {
        this.cpuShares = cpuShares;
    }

    public Integer getCpuQuota() {
        return cpuQuota;
    }

    public void setCpuQuota(Integer cpuQuota) {
        this.cpuQuota = cpuQuota;
    }

    public Integer getBlkio() {
        return blkio;
    }

    public void setBlkio(Integer blkio) {
        this.blkio = blkio;
    }

    public String getRestartPolicy() {
        return restartPolicy;
    }

    public void setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
    }

    public String getPortBinding() {
        return portBinding;
    }

    public void setPortBinding(String portBinding) {
        this.portBinding = portBinding;
    }

    public String getDockerLogDir() {
        return dockerLogDir;
    }

    public void setDockerLogDir(String dockerLogDir) {
        this.dockerLogDir = dockerLogDir;
    }

    public void setHostLogDir(String hostLogDir) {
        this.hostLogDir = hostLogDir;
    }

    public String getHostLogDir() {
        return hostLogDir;
    }

    @Override
    public String toString() {
        return "UiNewContainer{" +
                "tag='" + tag + '\'' +
                ", image='" + image + '\'' +
                ", node='" + node + '\'' +
                ", javaOpts='" + javaOpts + '\'' +
                ", containerName='" + containerName + '\'' +
                ", restartPolicy='" + restartPolicy + '\'' +
                ", portBinding='" + portBinding + '\'' +
                ", dockerLogDir='" + dockerLogDir + '\'' +
                ", memoryInMb=" + memoryInMb +
                '}';
    }

}
