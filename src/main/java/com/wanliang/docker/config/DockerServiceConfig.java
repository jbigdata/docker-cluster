package com.wanliang.docker.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration for docker service api config
 */
@Configuration
public class DockerServiceConfig {

    @Value("${docker.swarm.port:2375}")
    private int port;
    @Value("${docker.swarm.host:swarm}")
    private String host;
    private String dockerHome;
    private int maxCountOfInstances;
    private String hostLogDir;
    private String dockerLogDir;
    private String dockerRestart;

    /**
     * docker/swarm host
     * @return host
     */
    public String getHost() {
        return host;
    }

    public DockerServiceConfig host(String host) {
        setHost(host);
        return this;
    }

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * docker swarm port
     * @return port
     */
    public int getPort() {
        return port;
    }

    public DockerServiceConfig port(int port) {
        setPort(port);
        return this;
    }

    public void setPort(int port) {
        this.port = port;
    }

    /**
     * Home dir for data
     * @return dockerHome
     */
    public String getDockerHome() {
        return dockerHome;
    }

    public void setDockerHome(String dockerHome) {
        this.dockerHome = dockerHome;
    }

    public DockerServiceConfig dockerHome(String dockerHome) {
        setDockerHome(dockerHome);
        return this;
    }

    public Integer getMaxCountOfInstances() {
        return maxCountOfInstances;
    }

    public void setMaxCountOfInstances(int maxCountOfInstances) {
        this.maxCountOfInstances = maxCountOfInstances;
    }

    public DockerServiceConfig maxCountOfInstances(int maxCountOfInstances) {
        setMaxCountOfInstances(maxCountOfInstances);
        return this;
    }



    public String getHostLogDir() {
        return hostLogDir;
    }

    public void setHostLogDir(String hostLogDir) {
        this.hostLogDir = hostLogDir;
    }

    public DockerServiceConfig hostLogDir(String hostLogDir) {
        setHostLogDir(hostLogDir);
        return this;
    }

    public String getDockerLogDir() {
        return dockerLogDir;
    }

    public void setDockerLogDir(String dockerLogDir) {
        this.dockerLogDir = dockerLogDir;
    }

    public DockerServiceConfig dockerLogDir(String dockerLogDir) {
        setDockerLogDir(dockerLogDir);
        return this;
    }

    public String getDockerRestart() {
        return dockerRestart;
    }

    public void setDockerRestart(String dockerRestart) {
        this.dockerRestart = dockerRestart;
    }

    public DockerServiceConfig dockerRestart(String dockerRestart) {
        setDockerRestart(dockerRestart);
        return this;
    }
}
