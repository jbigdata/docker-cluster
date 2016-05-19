package com.wanliang.docker.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

/**
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HostConfig {

    @JsonProperty("Binds")
    private Binds binds;

    @JsonProperty("BlkioWeight")
    private Integer blkioWeight;

    @JsonProperty("CapAdd")
    private Capability[] capAdd;

    @JsonProperty("CapDrop")
    private Capability[] capDrop;

    @JsonProperty("ContainerIDFile")
    private String containerIDFile;

    @JsonProperty("CpuPeriod")
    private Integer cpuPeriod;

    @JsonProperty("CpuShares")
    private Integer cpuShares;

    @JsonProperty("CpusetCpus")
    private String cpusetCpus;

    @JsonProperty("CpusetMems")
    private String cpusetMems;

    @JsonProperty("CpuQuota")
    private Integer cpuQuota;

    @JsonProperty("Dns")
    private String[] dns;

    @JsonProperty("DnsSearch")
    private String[] dnsSearch;

    @JsonProperty("ExtraHosts")
    private String[] extraHosts;

    @JsonProperty("LogConfig")
    private LogConfig logConfig;

    @JsonProperty("Memory")
    private Long memory;

    @JsonProperty("MemorySwap")
    private Long memorySwap;

    @JsonProperty("NetworkMode")
    private String networkMode;

    @JsonProperty("OomKillDisable")
    private Boolean oomKillDisable;

    @JsonProperty("PortBindings")
    private Ports portBindings;

    @JsonProperty("Privileged")
    private Boolean privileged;

    @JsonProperty("PublishAllPorts")
    private Boolean publishAllPorts;

    @JsonProperty("ReadonlyRootfs")
    private Boolean readonlyRootfs;

    @JsonProperty("RestartPolicy")
    private RestartPolicy restartPolicy;

    @JsonProperty("PidMode")
    private String pidMode;

    @JsonProperty("Ulimits")
    private Ulimit[] ulimits;
    @JsonProperty("VolumesFrom")
    private VolumesFrom[] volumesFrom;

    public HostConfig() {
    }

    private HostConfig(Builder builder) {
        this.binds = builder.binds;
        this.blkioWeight = builder.blkioWeight;
        this.capAdd = builder.capAdd;
        this.capDrop = builder.capDrop;
        this.containerIDFile = builder.containerIDFile;
        this.cpuPeriod = builder.cpuPeriod;
        this.cpuShares = builder.cpuShares;
        this.cpusetCpus = builder.cpusetCpus;
        this.cpusetMems = builder.cpusetMems;
        this.dns = builder.dns;
        this.dnsSearch = builder.dnsSearch;
        this.extraHosts = builder.extraHosts;
        this.logConfig = builder.logConfig;
        this.memory = builder.memory;
        this.memorySwap = builder.memorySwap;
        this.networkMode = builder.networkMode;
        this.oomKillDisable = builder.oomKillDisable;
        this.portBindings = builder.portBindings;
        this.privileged = builder.privileged;
        this.publishAllPorts = builder.publishAllPorts;
        this.readonlyRootfs = builder.readonlyRootfs;
        this.restartPolicy = builder.restartPolicy;
        this.pidMode = builder.pidMode;
        this.cpuQuota = builder.cpuQuota;
    }

    public static Builder newHostConfig() {
        return new Builder();
    }

    @JsonIgnore
    public Bind[] getBinds() {
        return (binds == null) ? new Bind[0] : binds.getBinds();
    }

    public Integer getBlkioWeight() {
        return blkioWeight;
    }

    public Capability[] getCapAdd() {
        return capAdd;
    }

    public Capability[] getCapDrop() {
        return capDrop;
    }

    public String getContainerIDFile() {
        return containerIDFile;
    }

    public Integer getCpuPeriod() {
        return cpuPeriod;
    }

    public Integer getCpuShares() {
        return cpuShares;
    }

    public String getCpusetCpus() {
        return cpusetCpus;
    }

    public String getCpusetMems() {
        return cpusetMems;
    }

    public String[] getDns() {
        return dns;
    }

    public String[] getDnsSearch() {
        return dnsSearch;
    }

    public String[] getExtraHosts() {
        return extraHosts;
    }

    @JsonIgnore
    public LogConfig getLogConfig() {
        return (logConfig == null) ? new LogConfig() : logConfig;
    }

    public Long getMemory() {
        return memory;
    }

    public Long getMemorySwap() {
        return memorySwap;
    }

    public String getNetworkMode() {
        return networkMode;
    }

    public Ports getPortBindings() {
        return portBindings;
    }

    public RestartPolicy getRestartPolicy() {
        return restartPolicy;
    }

    public Boolean isOomKillDisable() {
        return oomKillDisable;
    }

    public Boolean isPrivileged() {
        return privileged;
    }

    public Boolean isPublishAllPorts() {
        return publishAllPorts;
    }

    public Boolean isReadonlyRootfs() {
        return readonlyRootfs;
    }

    public String getPidMode() {
        return pidMode;
    }

    @JsonIgnore
    public void setBinds(Bind... binds) {
        this.binds = new Binds(binds);
    }

    public void setBlkioWeight(Integer blkioWeight) {
        this.blkioWeight = blkioWeight;
    }

    public void setCpuPeriod(Integer cpuPeriod) {
        this.cpuPeriod = cpuPeriod;
    }

    public void setCpuShares(Integer cpuShares) {
        this.cpuShares = cpuShares;
    }

    public void setCpusetCpus(String cpusetCpus) {
        this.cpusetCpus = cpusetCpus;
    }

    public void setCpusetMems(String cpusetMems) {
        this.cpusetMems = cpusetMems;
    }

    public void setCapAdd(Capability[] capAdd) {
        this.capAdd = capAdd;
    }

    public void setCapDrop(Capability[] capDrop) {
        this.capDrop = capDrop;
    }

    public void setContainerIDFile(String containerIDFile) {
        this.containerIDFile = containerIDFile;
    }

    public void setDns(String[] dns) {
        this.dns = dns;
    }

    public void setDnsSearch(String[] dnsSearch) {
        this.dnsSearch = dnsSearch;
    }

    public void setExtraHosts(String[] extraHosts) {
        this.extraHosts = extraHosts;
    }

    @JsonIgnore
    public void setLogConfig(LogConfig logConfig) {
        this.logConfig = logConfig;
    }

    public void setMemory(Long memory) {
        this.memory = memory;
    }

    public void setMemorySwap(Long memorySwap) {
        this.memorySwap = memorySwap;
    }

    public void setNetworkMode(String networkMode) {
        this.networkMode = networkMode;
    }

    public void setOomKillDisable(Boolean oomKillDisable) {
        this.oomKillDisable = oomKillDisable;
    }

    public void setPortBindings(Ports portBindings) {
        this.portBindings = portBindings;
    }

    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    public void setPublishAllPorts(Boolean publishAllPorts) {
        this.publishAllPorts = publishAllPorts;
    }

    public void setReadonlyRootfs(Boolean readonlyRootfs) {
        this.readonlyRootfs = readonlyRootfs;
    }

    public void setRestartPolicy(RestartPolicy restartPolicy) {
        this.restartPolicy = restartPolicy;
    }

    public void setPidMode(String pidMode) {
        this.pidMode = pidMode;
    }

    public void setCpuQuota(Integer cpuQuota) {
        this.cpuQuota = cpuQuota;
    }

    public Integer getCpuQuota() {
        return cpuQuota;
    }

    public void setBinds(Binds binds) {
        this.binds = binds;
    }

    public Boolean getOomKillDisable() {
        return oomKillDisable;
    }

    public Boolean getPrivileged() {
        return privileged;
    }

    public Boolean getPublishAllPorts() {
        return publishAllPorts;
    }

    public Boolean getReadonlyRootfs() {
        return readonlyRootfs;
    }

    public Ulimit[] getUlimits() {
        return ulimits;
    }

    public void setUlimits(Ulimit[] ulimits) {
        this.ulimits = ulimits;
    }

    public VolumesFrom[] getVolumesFrom() {
        return volumesFrom;
    }

    public void setVolumesFrom(VolumesFrom[] volumesFrom) {
        this.volumesFrom = volumesFrom;
    }

    public static final class Builder {
        private Binds binds;
        private Integer blkioWeight;
        private Capability[] capAdd;
        private Capability[] capDrop;
        private String containerIDFile;
        private Integer cpuPeriod;
        private Integer cpuShares;
        private String cpusetCpus;
        private String cpusetMems;
        private String[] dns;
        private String[] dnsSearch;
        private String[] extraHosts;
        private LogConfig logConfig;
        private Long memory;
        private Long memorySwap;
        private String networkMode;
        private Boolean oomKillDisable;
        private Ports portBindings;
        private Boolean privileged;
        private Boolean publishAllPorts;
        private Boolean readonlyRootfs;
        private RestartPolicy restartPolicy;
        private String pidMode;
        private Integer cpuQuota;

        private Builder() {
        }

        public HostConfig build() {
            return new HostConfig(this);
        }

        public Builder binds(Binds binds) {
            this.binds = binds;
            return this;
        }

        public Builder blkioWeight(Integer blkioWeight) {
            this.blkioWeight = blkioWeight;
            return this;
        }

        public Builder capAdd(Capability[] capAdd) {
            this.capAdd = capAdd;
            return this;
        }

        public Builder capDrop(Capability[] capDrop) {
            this.capDrop = capDrop;
            return this;
        }

        public Builder containerIDFile(String containerIDFile) {
            this.containerIDFile = containerIDFile;
            return this;
        }

        public Builder cpuPeriod(Integer cpuPeriod) {
            this.cpuPeriod = cpuPeriod;
            return this;
        }

        public Builder cpuQuota(Integer cpuQuota) {
            this.cpuQuota = cpuQuota;
            return this;
        }

        public Builder cpuShares(Integer cpuShares) {
            this.cpuShares = cpuShares;
            return this;
        }

        public Builder cpusetCpus(String cpusetCpus) {
            this.cpusetCpus = cpusetCpus;
            return this;
        }

        public Builder cpusetMems(String cpusetMems) {
            this.cpusetMems = cpusetMems;
            return this;
        }

        public Builder dns(String[] dns) {
            this.dns = dns;
            return this;
        }

        public Builder dnsSearch(String[] dnsSearch) {
            this.dnsSearch = dnsSearch;
            return this;
        }

        public Builder extraHosts(String[] extraHosts) {
            this.extraHosts = extraHosts;
            return this;
        }

        public Builder logConfig(LogConfig logConfig) {
            this.logConfig = logConfig;
            return this;
        }

        public Builder memory(Long memory) {
            this.memory = memory;
            return this;
        }

        public Builder memorySwap(Long memorySwap) {
            this.memorySwap = memorySwap;
            return this;
        }

        public Builder networkMode(String networkMode) {
            this.networkMode = networkMode;
            return this;
        }

        public Builder oomKillDisable(Boolean oomKillDisable) {
            this.oomKillDisable = oomKillDisable;
            return this;
        }

        public Builder portBindings(Ports portBindings) {
            this.portBindings = portBindings;
            return this;
        }

        public Builder privileged(Boolean privileged) {
            this.privileged = privileged;
            return this;
        }

        public Builder publishAllPorts(Boolean publishAllPorts) {
            this.publishAllPorts = publishAllPorts;
            return this;
        }

        public Builder readonlyRootfs(Boolean readonlyRootfs) {
            this.readonlyRootfs = readonlyRootfs;
            return this;
        }

        public Builder restartPolicy(RestartPolicy restartPolicy) {
            this.restartPolicy = restartPolicy;
            return this;
        }

        public Builder pidMode(String pidMode) {
            this.pidMode = pidMode;
            return this;
        }
    }

    @Override
    public String toString() {
        return "HostConfig{" +
                "binds=" + binds +
                ", blkioWeight=" + blkioWeight +
                ", containerIDFile='" + containerIDFile + '\'' +
                ", cpuPeriod=" + cpuPeriod +
                ", cpuShares=" + cpuShares +
                ", cpusetCpus='" + cpusetCpus + '\'' +
                ", cpusetMems='" + cpusetMems + '\'' +
                ", dns=" + Arrays.toString(dns) +
                ", dnsSearch=" + Arrays.toString(dnsSearch) +
                ", logConfig=" + logConfig +
                ", memory=" + memory +
                ", networkMode='" + networkMode + '\'' +
                ", oomKillDisable=" + oomKillDisable +
                ", portBindings=" + portBindings +
                ", restartPolicy=" + restartPolicy +
                ", pidMode='" + pidMode + '\'' +
                '}';
    }
}
