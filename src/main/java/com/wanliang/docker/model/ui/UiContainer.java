package com.wanliang.docker.model.ui;

import javax.validation.constraints.NotNull;

/**
 * UI representation for Container
 */
public class UiContainer implements Comparable<UiContainer> {
    @NotNull
    private final String id;
    @NotNull
    private final String name;
    @NotNull
    private final String node;
    @NotNull
    private final String image;
    @NotNull
    private final Boolean readOnly;
    private final String command;
    private final String ports;
    private final String status;
    private final long created;

    private final boolean run;

    private UiContainer(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.node = builder.node;
        this.image = builder.image;
        this.readOnly = builder.readOnly;
        this.command = builder.command;
        this.ports = builder.ports;
        this.status = builder.status;
        this.run = builder.run;
        this.created = builder.created;
    }

    public static Builder newUiContainer() {
        return new Builder();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNode() {
        return node;
    }

    public String getImage() {
        return image;
    }

    public String getCommand() {
        return command;
    }

    public String getPorts() {
        return ports;
    }

    public String getStatus() {
        return status;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public long getCreated() {
        return created;
    }

    public boolean isRun() {
        return run;
    }

    @Override
    public int compareTo(UiContainer o) {
        int comp = name == null ? 0 : name.compareTo(o.name);
        if (comp == 0 && image != null) {
            comp = image.compareTo(o.image);
        }
        if (comp == 0 && id != null) {
            comp = id.compareTo(o.id);
        }
        return comp;
    }


    @Override
    public String toString() {
        return "UiContainer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", node='" + node + '\'' +
                ", image='" + image + '\'' +
                ", readOnly=" + readOnly +
                ", command='" + command + '\'' +
                ", ports='" + ports + '\'' +
                ", status='" + status + '\'' +
                ", run=" + run +
                '}';
    }

    public static final class Builder {
        private String id;
        private String name;
        private String node;
        private String image;
        private Boolean readOnly;
        private String command;
        private String ports;
        private String status;
        private boolean run;
        private long created;

        private Builder() {
        }

        public UiContainer build() {
            return new UiContainer(this);
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder node(String node) {
            this.node = node;
            return this;
        }

        public Builder image(String image) {
            this.image = image;
            return this;
        }

        public Builder readOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder command(String command) {
            this.command = command;
            return this;
        }

        public Builder ports(String ports) {
            this.ports = ports;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Builder run(boolean run) {
            this.run = run;
            return this;
        }


        public Builder created(long created) {
            this.created = created;
            return this;
        }
    }
}
