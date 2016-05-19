package com.wanliang.docker.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;
import java.util.Map;

/**
 * CreateContainer Rest model
 */
public class CreateContainerCmd {

    private String name;

    @JsonProperty("Hostname")
    private String hostName;

    @JsonProperty("Domainname")
    private String domainName;

    @JsonProperty("User")
    private String user;

    @JsonProperty("AttachStdin")
    private Boolean attachStdin;

    @JsonProperty("AttachStdout")
    private Boolean attachStdout;

    @JsonProperty("AttachStderr")
    private Boolean attachStderr;

    @JsonProperty("PortSpecs")
    private String[] portSpecs;

    @JsonProperty("Tty")
    private Boolean tty;

    @JsonProperty("OpenStdin")
    private Boolean stdinOpen;

    @JsonProperty("StdinOnce")
    private Boolean stdInOnce;

    @JsonProperty("Env")
    private String[] env;

    @JsonProperty("Cmd")
    private String[] cmd;

    @JsonProperty("Entrypoint")
    private String[] entrypoint;

    @JsonProperty("Image")
    private String image;

    @JsonProperty("Volumes")
    private Volumes volumes = new Volumes();

    @JsonProperty("WorkingDir")
    private String workingDir;

    @JsonProperty("MacAddress")
    private String macAddress;

    @JsonProperty("NetworkDisabled")
    private Boolean networkDisabled;

    @JsonProperty("ExposedPorts")
    private ExposedPorts exposedPorts;

    @JsonProperty("HostConfig")
    private HostConfig hostConfig;

    @JsonProperty("Labels")
    private Map<String, String> labels;

    private CreateContainerCmd(Builder builder) {
        this.name = builder.name;
        this.hostName = builder.hostName;
        this.domainName = builder.domainName;
        this.user = builder.user;
        this.attachStdin = builder.attachStdin;
        this.attachStdout = builder.attachStdout;
        this.attachStderr = builder.attachStderr;
        this.portSpecs = builder.portSpecs;
        this.tty = builder.tty;
        this.stdinOpen = builder.stdinOpen;
        this.stdInOnce = builder.stdInOnce;
        this.env = builder.env;
        this.cmd = builder.cmd;
        this.entrypoint = builder.entrypoint;
        this.image = builder.image;
        this.volumes = builder.volumes;
        this.workingDir = builder.workingDir;
        this.macAddress = builder.macAddress;
        this.networkDisabled = builder.networkDisabled;
        this.exposedPorts = builder.exposedPorts;
        this.hostConfig = builder.hostConfig;
        this.labels = builder.labels;
    }

    public String getName() {
        return name;
    }

    public String getHostName() {
        return hostName;
    }

    public String getDomainName() {
        return domainName;
    }

    public String getUser() {
        return user;
    }

    public Boolean getAttachStdin() {
        return attachStdin;
    }

    public Boolean getAttachStdout() {
        return attachStdout;
    }

    public Boolean getAttachStderr() {
        return attachStderr;
    }

    public String[] getPortSpecs() {
        return portSpecs;
    }

    public Boolean getTty() {
        return tty;
    }

    public Boolean getStdinOpen() {
        return stdinOpen;
    }

    public Boolean getStdInOnce() {
        return stdInOnce;
    }

    public String[] getEnv() {
        return env;
    }

    public String[] getCmd() {
        return cmd;
    }

    public String[] getEntrypoint() {
        return entrypoint;
    }

    public String getImage() {
        return image;
    }

    public Volumes getVolumes() {
        return volumes;
    }

    public String getWorkingDir() {
        return workingDir;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public Boolean getNetworkDisabled() {
        return networkDisabled;
    }

    public ExposedPorts getExposedPorts() {
        return exposedPorts;
    }

    public HostConfig getHostConfig() {
        return hostConfig;
    }

    public Map<String, String> getLabels() {
        return labels;
    }

    public static Builder newCreateContainerCmd() {
        return new Builder();
    }

    public static final class Builder {
        private String name;
        private String hostName;
        private String domainName;
        private String user;
        private Boolean attachStdin;
        private Boolean attachStdout;
        private Boolean attachStderr;
        private String[] portSpecs;
        private Boolean tty;
        private Boolean stdinOpen;
        private Boolean stdInOnce;
        private String[] env;
        private String[] cmd;
        private String[] entrypoint;
        private String image;
        private Volumes volumes;
        private String workingDir;
        private String macAddress;
        private Boolean networkDisabled;
        private ExposedPorts exposedPorts = new ExposedPorts();
        private HostConfig hostConfig = new HostConfig();
        private Map<String, String> labels;

        private Builder() {
        }

        public CreateContainerCmd build() {
            return new CreateContainerCmd(this);
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder hostName(String hostName) {
            this.hostName = hostName;
            return this;
        }

        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        public Builder user(String user) {
            this.user = user;
            return this;
        }

        public Builder attachStdin(Boolean attachStdin) {
            this.attachStdin = attachStdin;
            return this;
        }

        public Builder attachStdout(Boolean attachStdout) {
            this.attachStdout = attachStdout;
            return this;
        }

        public Builder attachStderr(Boolean attachStderr) {
            this.attachStderr = attachStderr;
            return this;
        }

        public Builder portSpecs(String[] portSpecs) {
            this.portSpecs = portSpecs;
            return this;
        }

        public Builder tty(Boolean tty) {
            this.tty = tty;
            return this;
        }

        public Builder stdinOpen(Boolean stdinOpen) {
            this.stdinOpen = stdinOpen;
            return this;
        }

        public Builder stdInOnce(Boolean stdInOnce) {
            this.stdInOnce = stdInOnce;
            return this;
        }

        public Builder env(String... env) {
            this.env = env;
            return this;
        }

        public Builder cmd(String[] cmd) {
            this.cmd = cmd;
            return this;
        }

        public Builder entrypoint(String[] entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }

        public Builder image(String image) {
            this.image = image;
            return this;
        }

        public Builder volumes(Volumes volumes) {
            this.volumes = volumes;
            return this;
        }

        public Builder workingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }

        public Builder macAddress(String macAddress) {
            this.macAddress = macAddress;
            return this;
        }

        public Builder networkDisabled(Boolean networkDisabled) {
            this.networkDisabled = networkDisabled;
            return this;
        }

        public Builder exposedPorts(ExposedPorts exposedPorts) {
            this.exposedPorts = exposedPorts;
            return this;
        }

        public Builder hostConfig(HostConfig hostConfig) {
            this.hostConfig = hostConfig;
            return this;
        }

        public Builder labels(Map<String, String> labels) {
            this.labels = labels;
            return this;
        }
    }

    @Override
    public String toString() {
        return "CreateContainerCmd{" +
                "name='" + name + '\'' +
                ", hostName='" + hostName + '\'' +
                ", domainName='" + domainName + '\'' +
                ", user='" + user + '\'' +
                ", portSpecs=" + Arrays.toString(portSpecs) +
                ", env=" + Arrays.toString(env) +
                ", cmd=" + Arrays.toString(cmd) +
                ", entrypoint=" + Arrays.toString(entrypoint) +
                ", image='" + image + '\'' +
                ", volumes=" + volumes +
                ", workingDir='" + workingDir + '\'' +
                ", exposedPorts=" + exposedPorts +
                ", hostConfig=" + hostConfig +
                ", labels=" + labels +
                '}';
    }
}
