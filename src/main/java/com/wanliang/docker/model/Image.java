package com.wanliang.docker.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Represent Image inside Manifest DTO
 */
public class Image {

    private static final String CREATED = "Created";
    private static final String ID = "Id";
    private static final String PARENT = "Parent";
    private static final String CONTAINER_CONFIG = "ContainerConfig";

    private final Date created;
    private final String id;
    private final String parent;
    private final ContainerConfig containerConfig;

    public Image(@JsonProperty(CONTAINER_CONFIG) ContainerConfig containerConfig,
                 @JsonProperty(PARENT) String parent,
                 @JsonProperty(ID) String id,
                 @JsonProperty(CREATED) Date created) {
        this.containerConfig = containerConfig;
        this.parent = parent;
        this.id = id;
        this.created = created;
    }

    @JsonProperty(CREATED)
    public Date getCreated() {
        return created;
    }

    @JsonProperty(ID)
    public String getId() {
        return id;
    }

    @JsonProperty(PARENT)
    public String getParent() {
        return parent;
    }

    @JsonProperty(CONTAINER_CONFIG)
    public ContainerConfig getContainerConfig() {
        return containerConfig;
    }

    @Override
    public String toString() {
        return "Image{" +
                "created=" + created +
                ", id='" + id + '\'' +
                ", parent='" + parent + '\'' +
                ", containerConfig=" + containerConfig +
                '}';
    }
}
