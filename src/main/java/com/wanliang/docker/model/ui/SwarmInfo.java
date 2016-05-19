package com.wanliang.docker.model.ui;

import java.util.ArrayList;
import java.util.List;

public class SwarmInfo {

    private final String id;
    private final String name;
    private final Integer containers;
    private final Integer images;
    private final Integer ncpu;
    private final Double memory;
    private final Integer nodeCount;

    private final List<UINode> nodeList;

    private SwarmInfo(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.containers = builder.containers;
        this.images = builder.images;
        this.ncpu = builder.ncpu;
        this.memory = builder.memory;
        this.nodeCount = builder.nodeCount;
        this.nodeList = builder.nodeList;
    }

    public static Builder newUIInfo() {
        return new Builder();
    }

    public String getId() {
        return id;
    }

    public Integer getContainers() {
        return containers;
    }

    public Integer getImages() {
        return images;
    }

    public Integer getNcpu() {
        return ncpu;
    }

    public List<UINode> getNodeList() {
        return nodeList;
    }

    public Integer getNodeCount() {
        return nodeCount;
    }

    public Double getMemory() {
        return memory;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "SwarmInfo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", containers=" + containers +
                ", images=" + images +
                ", ncpu=" + ncpu +
                ", memory=" + memory +
                ", nodeCount=" + nodeCount +
                ", nodeList=" + nodeList +
                '}';
    }

    public static final class Builder {
        private String id;
        private String name;
        private Integer containers;
        private Integer images;
        private Integer ncpu;
        private Double memory;
        private Integer nodeCount;
        private List<UINode> nodeList = new ArrayList<>();

        private Builder() {
        }

        public SwarmInfo build() {
            return new SwarmInfo(this);
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder containers(Integer containers) {
            this.containers = containers;
            return this;
        }

        public Builder images(Integer images) {
            this.images = images;
            return this;
        }

        public Builder ncpu(Integer ncpu) {
            this.ncpu = ncpu;
            return this;
        }

        public Builder memory(Double memory) {
            this.memory = memory;
            return this;
        }

        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }

        public Builder nodeList(List<UINode> nodeList) {
            this.nodeList = nodeList;
            return this;
        }

        public Integer getNodeCount() {
            return nodeCount;
        }

        public List<UINode> getNodeList() {
            return nodeList;
        }
    }
}
