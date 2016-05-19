package com.wanliang.docker.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Info {

    private static final String ID = "Id";
    private static final String CONTAINERS = "Containers";
    private static final String IMAGES = "Images";
    private static final String NCPU = "NCPU";
    private static final String MEM_TOTAL = "MemTotal";
    private static final String DRIVER_STATUS = "DriverStatus";
    private static final String NAME = "Name";


    private final String id;
    private final Integer containers;
    private final Integer images;
    private final Integer ncpu;
    private final Long memory;
    private final String name;

    private final List<List<String>> driverStatus;


    public Info(@JsonProperty(ID) String id,
                @JsonProperty(CONTAINERS) Integer containers,
                @JsonProperty(IMAGES) Integer images,
                @JsonProperty(NCPU) Integer ncpu,
                @JsonProperty(MEM_TOTAL) Long memory,
                @JsonProperty(NAME) String name,
                @JsonProperty(DRIVER_STATUS) List<List<String>> driverStatus) {
        this.id = id;
        this.containers = containers;
        this.images = images;
        this.ncpu = ncpu;
        this.memory = memory;
        this.name = name;
        this.driverStatus = driverStatus;
    }

    @JsonProperty(ID)
    public String getId() {
        return id;
    }

    @JsonProperty(CONTAINERS)
    public Integer getContainers() {
        return containers;
    }

    @JsonProperty(IMAGES)
    public Integer getImages() {
        return images;
    }

    @JsonProperty(NCPU)
    public Integer getNcpu() {
        return ncpu;
    }

    @JsonProperty(MEM_TOTAL)
    public Long getMemory() {
        return memory;
    }

    @JsonProperty(DRIVER_STATUS)
    public List<List<String>> getDriverStatus() {
        return driverStatus;
    }

    @JsonProperty(NAME)
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Info{" +
                "id='" + id + '\'' +
                ", containers=" + containers +
                ", images=" + images +
                ", ncpu=" + ncpu +
                ", memory=" + memory +
                ", name='" + name + '\'' +
                ", driverStatus=" + driverStatus +
                '}';
    }
}
