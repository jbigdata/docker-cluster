package com.wanliang.docker.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Container with docker image
 */
public class Container {
    private static final String ID = "Id";//
    private static final String NAMES = "Names";//      []string
    private static final String IMAGE = "Image";//      string
    private static final String COMMAND = "Command";//    string
    private static final String CREATED = "Created";//    int
    private static final String PORTS = "Ports";//      []Port
    private static final String SIZE_RW = "SizeRw";//     int `json:",omitempty"`
    private static final String SIZE_ROOT_FS = "SizeRootFs";// int `json:",omitempty"`
    private static final String LABELS = "Labels";//     map[string]string
    private static final String STATUS = "Status";//     string

    public static class Builder {
        private String id;
        private final List<String> names = new ArrayList<>();
        private String image;
        private String command;
        private long created;
        private final List<Port> ports = new ArrayList<>();
        private long sizeRw;
        private long sizeRootFs;
        private final Map<String, String> labels = new HashMap<>();
        private String status;

        public String getId() {
            return id;
        }

        public Builder id(String id) {
            setId(id);
            return this;
        }

        @JsonProperty(ID)
        public void setId(String id) {
            this.id = id;
        }

        public List<String> getNames() {
            return names;
        }

        public Builder names(List<String> names) {
            setNames(names);
            return this;
        }

        @JsonProperty(NAMES)
        public void setNames(List<String> names) {
            this.names.clear();
            if(names != null) {
                this.names.addAll(names);
            }
        }

        public String getImage() {
            return image;
        }

        public Builder image(String image) {
            setImage(image);
            return this;
        }

        @JsonProperty(IMAGE)
        public void setImage(String image) {
            this.image = image;
        }

        public String getCommand() {
            return command;
        }

        public Builder command(String command) {
            setCommand(command);
            return this;
        }

        @JsonProperty(COMMAND)
        public void setCommand(String command) {
            this.command = command;
        }

        public long getCreated() {
            return created;
        }

        public Builder created(long created) {
            setCreated(created);
            return this;
        }

        @JsonProperty(CREATED)
        public void setCreated(long created) {
            this.created = created;
        }

        public List<Port> getPorts() {
            return ports;
        }

        public Builder ports(List<Port> ports) {
            setPorts(ports);
            return this;
        }

        @JsonProperty(PORTS)
        public void setPorts(List<Port> ports) {
            this.ports.clear();
            if(ports != null) {
                this.ports.addAll(ports);
            }
        }

        public long getSizeRw() {
            return sizeRw;
        }

        public Builder sizeRw(long sizeRw) {
            setSizeRw(sizeRw);
            return this;
        }

        @JsonProperty(SIZE_RW)
        public void setSizeRw(long sizeRw) {
            this.sizeRw = sizeRw;
        }

        public long getSizeRootFs() {
            return sizeRootFs;
        }

        public Builder sizeRootFs(long sizeRootFs) {
            setSizeRootFs(sizeRootFs);
            return this;
        }

        @JsonProperty(SIZE_ROOT_FS)
        public void setSizeRootFs(long sizeRootFs) {
            this.sizeRootFs = sizeRootFs;
        }

        public Map<String, String> getLabels() {
            return labels;
        }

        public Builder labels(Map<String, String> labels) {
            setLabels(labels);
            return this;
        }

        @JsonProperty(LABELS)
        public void setLabels(Map<String, String> labels) {
            this.labels.clear();
            if(labels != null) {
                this.labels.putAll(labels);
            }
        }

        public String getStatus() {
            return status;
        }

        public Builder status(String status) {
            setStatus(status);
            return this;
        }

        @JsonProperty(STATUS)
        public void setStatus(String status) {
            this.status = status;
        }

        public Container build() {
            return new Container(this);
        }
    }

    private final String id;
    private final List<String> names;
    private final String image;
    private final String command;
    private final long created;
    private final List<Port> ports;
    private final long sizeRw;
    private final long sizeRootFs;
    private final Map<String, String> labels;
    private final String status;

    @JsonCreator
    public Container(Builder builder) {
        this.id = builder.id;
        this.names = ImmutableList.copyOf(builder.names);
        this.image = builder.image;
        this.command = builder.command;
        this.created = builder.created;
        this.ports = ImmutableList.copyOf(builder.ports);
        this.sizeRw = builder.sizeRw;
        this.sizeRootFs = builder.sizeRootFs;
        this.labels = ImmutableMap.copyOf(builder.labels);
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        Builder b = new Builder();
        b.setId(this.id);
        b.setNames(this.names);
        b.setImage(this.image);
        b.setCommand(this.command);
        b.setCreated(this.created);
        b.setPorts(this.ports);
        b.setSizeRw(this.sizeRw);
        b.setSizeRootFs(this.sizeRootFs);
        b.setLabels(this.labels);
        b.setStatus(this.status);
        return b;
    }

    @JsonProperty(ID)
    public String getId() {
        return id;
    }

    @JsonProperty(NAMES)
    public List<String> getNames() {
        return names;
    }

    @JsonProperty(IMAGE)
    public String getImage() {
        return image;
    }

    @JsonProperty(COMMAND)
    public String getCommand() {
        return command;
    }

    @JsonProperty(CREATED)
    public long getCreated() {
        return created;
    }

    @JsonProperty(PORTS)
    public List<Port> getPorts() {
        return ports;
    }

    @JsonProperty(SIZE_RW)
    public long getSizeRw() {
        return sizeRw;
    }

    @JsonProperty(SIZE_ROOT_FS)
    public long getSizeRootFs() {
        return sizeRootFs;
    }

    @JsonProperty(LABELS)
    public Map<String, String> getLabels() {
        return labels;
    }

    @JsonProperty(STATUS)
    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Container{" +
          "id='" + id + '\'' +
          ", names=" + names +
          ", image='" + image + '\'' +
          ", command='" + command + '\'' +
          ", created=" + created +
          ", ports=" + ports +
          ", sizeRw=" + sizeRw +
          ", sizeRootFs=" + sizeRootFs +
          ", labels=" + labels +
          ", status='" + status + '\'' +
          '}';
    }
}
