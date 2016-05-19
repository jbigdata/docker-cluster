package com.wanliang.docker.model.ui;

public class UINode {

    public final static String CONTAINERS = "└ Containers";
    public final static String CPUS = "└ Reserved CPUs";
    public final static String MEMORY = "└ Reserved Memory";
    public final static String LABELS = "LABELS";

    private final String name;
    private final String path;
    private final String healthy;

    private final String containers;
    private final String reservedCPUs;
    private final String reservedMemory;
    private final String labels;

    private UINode(Builder builder) {
        this.name = builder.name;
        this.path = builder.path;
        this.healthy = builder.healthy;
        this.containers = builder.containers;
        this.reservedCPUs = builder.reservedCPUs;
        this.reservedMemory = builder.reservedMemory;
        this.labels = builder.labels;
    }

    public static Builder newUINode() {
        return new Builder();
    }

    public String getLabels() {
        return labels;
    }

    public String getReservedMemory() {
        return reservedMemory;
    }

    public String getReservedCPUs() {
        return reservedCPUs;
    }

    public String getContainers() {
        return containers;
    }

    public String getHealthy() {
        return healthy;
    }

    public String getPath() {
        return path;
    }

    public String getName() {
        return name;
    }

    public static final class Builder {
        private String name;
        private String path;
        private String healthy;
        private String containers;
        private String reservedCPUs;
        private String reservedMemory;
        private String labels;

        private Builder() {
        }

        public UINode build() {
            return new UINode(this);
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder path(String path) {
            this.path = path;
            return this;
        }

        public Builder healthy(String healthy) {
            this.healthy = healthy;
            return this;
        }

        public Builder containers(String containers) {
            this.containers = containers;
            return this;
        }

        public Builder reservedCPUs(String reservedCPUs) {
            this.reservedCPUs = reservedCPUs;
            return this;
        }

        public Builder reservedMemory(String reservedMemory) {
            this.reservedMemory = reservedMemory;
            return this;
        }

        public Builder labels(String labels) {
            this.labels = labels;
            return this;
        }
    }

    @Override
    public String toString() {
        return "UINode{" +
                "name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", healthy='" + healthy + '\'' +
                ", containers='" + containers + '\'' +
                ", reservedCPUs='" + reservedCPUs + '\'' +
                ", reservedMemory='" + reservedMemory + '\'' +
                ", labels='" + labels + '\'' +
                '}';
    }

}
