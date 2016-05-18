package com.wanliang.docker.model;

/**
 * Created by Administrator on 2016/5/18.
 */
public class SwarmInfo {

    private int containersRunning;
    private int containersStopped;
    private int images;

    private String operatingSystem;

    public int getContainersRunning() {
        return containersRunning;
    }

    public void setContainersRunning(int containersRunning) {
        this.containersRunning = containersRunning;
    }

    public int getContainersStopped() {
        return containersStopped;
    }

    public void setContainersStopped(int containersStopped) {
        this.containersStopped = containersStopped;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

}
