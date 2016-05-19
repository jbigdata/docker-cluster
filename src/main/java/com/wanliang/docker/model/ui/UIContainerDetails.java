package com.wanliang.docker.model.ui;


import com.wanliang.docker.model.LogConfig;

import java.util.Arrays;
import java.util.List;

public class UIContainerDetails {
    private String appArmorProfile;
    private List<String> args;
    private String created;
    private String driver;
    private String execDriver;
    private List<String> execIDs;
    private String hostnamePath;
    private String hostsPath;
    private String id;
    private String image;
    private String logPath;
    private String mountLabel;
    private String name;
    private String ipaddress;
    private String node;
    private String path;
    private String processLabel;
    private String resolvConfPath;
    private String restartCount;
    private String ports;

    private List<String> binds;

    private Integer blkioWeight;
    private String containerIDFile;
    private Integer cpuPeriod;
    private Integer cpuShares;
    private String cpusetCpus;
    private String cpusetMems;
    private Integer cpuQuota;
    private String[] dns;
    private String[] dnsSearch;
    private String[] extraHosts;
    private LogConfig logConfig;
    private Long memorySwap;
    private String networkMode;
    private Boolean oomKillDisable;
    private String portBindings;
    private Boolean privileged;
    private Boolean publishAllPorts;
    private Boolean readonlyRootfs;
    private String restartPolicy;
    private String pidMode;
    private Double memoryMB;

    private String ulimits;
    private String volumesFrom;

    public UIContainerDetails() {
    }

    private UIContainerDetails(Builder builder) {
        this.appArmorProfile = builder.appArmorProfile;
        this.args = builder.args;
        this.created = builder.created;
        this.driver = builder.driver;
        this.execDriver = builder.execDriver;
        this.execIDs = builder.execIDs;
        this.hostnamePath = builder.hostnamePath;
        this.hostsPath = builder.hostsPath;
        this.id = builder.id;
        this.image = builder.image;
        this.logPath = builder.logPath;
        this.mountLabel = builder.mountLabel;
        this.name = builder.name;
        this.ipaddress = builder.ipaddress;
        this.node = builder.node;
        this.path = builder.path;
        this.processLabel = builder.processLabel;
        this.resolvConfPath = builder.resolvConfPath;
        this.restartCount = builder.restartCount;
        this.ports = builder.ports;
        this.binds = builder.binds;
        this.blkioWeight = builder.blkioWeight;
        this.containerIDFile = builder.containerIDFile;
        this.cpuPeriod = builder.cpuPeriod;
        this.cpuShares = builder.cpuShares;
        this.cpusetCpus = builder.cpusetCpus;
        this.cpusetMems = builder.cpusetMems;
        this.cpuQuota = builder.cpuQuota;
        this.dns = builder.dns;
        this.dnsSearch = builder.dnsSearch;
        this.extraHosts = builder.extraHosts;
        this.logConfig = builder.logConfig;
        this.memorySwap = builder.memorySwap;
        this.networkMode = builder.networkMode;
        this.oomKillDisable = builder.oomKillDisable;
        this.portBindings = builder.portBindings;
        this.privileged = builder.privileged;
        this.publishAllPorts = builder.publishAllPorts;
        this.readonlyRootfs = builder.readonlyRootfs;
        this.restartPolicy = builder.restartPolicy;
        this.pidMode = builder.pidMode;
        this.memoryMB = builder.memoryMB;
        this.ulimits = builder.ulimits;
        this.volumesFrom = builder.volumesFrom;
    }

    public static Builder newUIContainerDetails() {
        return new Builder();
    }


    public String getAppArmorProfile() {
        return appArmorProfile;
    }

    public void setAppArmorProfile(String appArmorProfile) {
        this.appArmorProfile = appArmorProfile;
    }

    public List<String> getArgs() {
        return args;
    }

    public void setArgs(List<String> args) {
        this.args = args;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getExecDriver() {
        return execDriver;
    }

    public void setExecDriver(String execDriver) {
        this.execDriver = execDriver;
    }

    public List<String> getExecIDs() {
        return execIDs;
    }

    public void setExecIDs(List<String> execIDs) {
        this.execIDs = execIDs;
    }

    public String getHostnamePath() {
        return hostnamePath;
    }

    public void setHostnamePath(String hostnamePath) {
        this.hostnamePath = hostnamePath;
    }

    public String getHostsPath() {
        return hostsPath;
    }

    public void setHostsPath(String hostsPath) {
        this.hostsPath = hostsPath;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLogPath() {
        return logPath;
    }

    public void setLogPath(String logPath) {
        this.logPath = logPath;
    }

    public String getMountLabel() {
        return mountLabel;
    }

    public void setMountLabel(String mountLabel) {
        this.mountLabel = mountLabel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getProcessLabel() {
        return processLabel;
    }

    public void setProcessLabel(String processLabel) {
        this.processLabel = processLabel;
    }

    public String getResolvConfPath() {
        return resolvConfPath;
    }

    public void setResolvConfPath(String resolvConfPath) {
        this.resolvConfPath = resolvConfPath;
    }

    public String getRestartCount() {
        return restartCount;
    }

    public void setRestartCount(String restartCount) {
        this.restartCount = restartCount;
    }

    public String getPorts() {
        return ports;
    }

    public void setPorts(String ports) {
        this.ports = ports;
    }

    public List<String> getBinds() {
        return binds;
    }

    public void setBinds(List<String> binds) {
        this.binds = binds;
    }

    public Integer getBlkioWeight() {
        return blkioWeight;
    }

    public void setBlkioWeight(Integer blkioWeight) {
        this.blkioWeight = blkioWeight;
    }

    public String getContainerIDFile() {
        return containerIDFile;
    }

    public void setContainerIDFile(String containerIDFile) {
        this.containerIDFile = containerIDFile;
    }

    public Integer getCpuPeriod() {
        return cpuPeriod;
    }

    public void setCpuPeriod(Integer cpuPeriod) {
        this.cpuPeriod = cpuPeriod;
    }

    public Integer getCpuShares() {
        return cpuShares;
    }

    public void setCpuShares(Integer cpuShares) {
        this.cpuShares = cpuShares;
    }

    public String getCpusetCpus() {
        return cpusetCpus;
    }

    public void setCpusetCpus(String cpusetCpus) {
        this.cpusetCpus = cpusetCpus;
    }

    public String getCpusetMems() {
        return cpusetMems;
    }

    public void setCpusetMems(String cpusetMems) {
        this.cpusetMems = cpusetMems;
    }

    public Integer getCpuQuota() {
        return cpuQuota;
    }

    public void setCpuQuota(Integer cpuQuota) {
        this.cpuQuota = cpuQuota;
    }

    public String[] getDns() {
        return dns;
    }

    public void setDns(String[] dns) {
        this.dns = dns;
    }

    public String[] getDnsSearch() {
        return dnsSearch;
    }

    public void setDnsSearch(String[] dnsSearch) {
        this.dnsSearch = dnsSearch;
    }

    public String[] getExtraHosts() {
        return extraHosts;
    }

    public void setExtraHosts(String[] extraHosts) {
        this.extraHosts = extraHosts;
    }

    public LogConfig getLogConfig() {
        return logConfig;
    }

    public void setLogConfig(LogConfig logConfig) {
        this.logConfig = logConfig;
    }

    public Long getMemorySwap() {
        return memorySwap;
    }

    public void setMemorySwap(Long memorySwap) {
        this.memorySwap = memorySwap;
    }

    public String getNetworkMode() {
        return networkMode;
    }

    public void setNetworkMode(String networkMode) {
        this.networkMode = networkMode;
    }

    public Boolean getOomKillDisable() {
        return oomKillDisable;
    }

    public void setOomKillDisable(Boolean oomKillDisable) {
        this.oomKillDisable = oomKillDisable;
    }

    public String getPortBindings() {
        return portBindings;
    }

    public void setPortBindings(String portBindings) {
        this.portBindings = portBindings;
    }

    public Boolean getPrivileged() {
        return privileged;
    }

    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    public Boolean getPublishAllPorts() {
        return publishAllPorts;
    }

    public void setPublishAllPorts(Boolean publishAllPorts) {
        this.publishAllPorts = publishAllPorts;
    }

    public Boolean getReadonlyRootfs() {
        return readonlyRootfs;
    }

    public void setReadonlyRootfs(Boolean readonlyRootfs) {
        this.readonlyRootfs = readonlyRootfs;
    }

    public String getRestartPolicy() {
        return restartPolicy;
    }

    public void setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
    }

    public String getPidMode() {
        return pidMode;
    }

    public void setPidMode(String pidMode) {
        this.pidMode = pidMode;
    }

    public Double getMemoryMB() {
        return memoryMB;
    }

    public void setMemoryMB(Double memory) {
        this.memoryMB = memory;
    }

    public String getUlimits() {
        return ulimits;
    }

    public void setUlimits(String ulimits) {
        this.ulimits = ulimits;
    }

    public String getVolumesFrom() {
        return volumesFrom;
    }

    public void setVolumesFrom(String volumesFrom) {
        this.volumesFrom = volumesFrom;
    }

    @Override
    public String toString() {
        return "UIContainerDetails{" +
                "appArmorProfile='" + appArmorProfile + '\'' +
                ", args=" + args +
                ", created='" + created + '\'' +
                ", driver='" + driver + '\'' +
                ", execDriver='" + execDriver + '\'' +
                ", execIDs=" + execIDs +
                ", hostnamePath='" + hostnamePath + '\'' +
                ", hostsPath='" + hostsPath + '\'' +
                ", id='" + id + '\'' +
                ", image='" + image + '\'' +
                ", logPath='" + logPath + '\'' +
                ", mountLabel='" + mountLabel + '\'' +
                ", name='" + name + '\'' +
                ", ipaddress='" + ipaddress + '\'' +
                ", node='" + node + '\'' +
                ", path='" + path + '\'' +
                ", processLabel='" + processLabel + '\'' +
                ", resolvConfPath='" + resolvConfPath + '\'' +
                ", restartCount='" + restartCount + '\'' +
                ", binds=" + binds +
                ", blkioWeight=" + blkioWeight +
                ", containerIDFile='" + containerIDFile + '\'' +
                ", cpuPeriod=" + cpuPeriod +
                ", cpuShares=" + cpuShares +
                ", cpusetCpus='" + cpusetCpus + '\'' +
                ", cpusetMems='" + cpusetMems + '\'' +
                ", cpuQuota=" + cpuQuota +
                ", dns=" + Arrays.toString(dns) +
                ", dnsSearch=" + Arrays.toString(dnsSearch) +
                ", extraHosts=" + Arrays.toString(extraHosts) +
                ", logConfig=" + logConfig +
                ", memorySwap=" + memorySwap +
                ", networkMode='" + networkMode + '\'' +
                ", oomKillDisable=" + oomKillDisable +
                ", portBindings='" + portBindings + '\'' +
                ", privileged=" + privileged +
                ", publishAllPorts=" + publishAllPorts +
                ", readonlyRootfs=" + readonlyRootfs +
                ", restartPolicy=" + restartPolicy +
                ", pidMode='" + pidMode + '\'' +
                '}';
    }

    public static final class Builder {
        private String appArmorProfile;
        private List<String> args;
        private String created;
        private String driver;
        private String execDriver;
        private List<String> execIDs;
        private String hostnamePath;
        private String hostsPath;
        private String id;
        private String image;
        private String logPath;
        private String mountLabel;
        private String name;
        private String ipaddress;
        private String node;
        private String path;
        private String processLabel;
        private String resolvConfPath;
        private String restartCount;
        private String ports;
        private List<String> binds;
        private Integer blkioWeight;
        private String containerIDFile;
        private Integer cpuPeriod;
        private Integer cpuShares;
        private String cpusetCpus;
        private String cpusetMems;
        private Integer cpuQuota;
        private String[] dns;
        private String[] dnsSearch;
        private String[] extraHosts;
        private LogConfig logConfig;
        private Long memorySwap;
        private String networkMode;
        private Boolean oomKillDisable;
        private String portBindings;
        private Boolean privileged;
        private Boolean publishAllPorts;
        private Boolean readonlyRootfs;
        private String restartPolicy;
        private String pidMode;
        private Double memoryMB;
        private String ulimits;
        private String volumesFrom;

        private Builder() {
        }

        public UIContainerDetails build() {
            return new UIContainerDetails(this);
        }

        public Builder appArmorProfile(String appArmorProfile) {
            this.appArmorProfile = appArmorProfile;
            return this;
        }

        public Builder args(List<String> args) {
            this.args = args;
            return this;
        }

        public Builder created(String created) {
            this.created = created;
            return this;
        }

        public Builder driver(String driver) {
            this.driver = driver;
            return this;
        }

        public Builder execDriver(String execDriver) {
            this.execDriver = execDriver;
            return this;
        }

        public Builder execIDs(List<String> execIDs) {
            this.execIDs = execIDs;
            return this;
        }

        public Builder hostnamePath(String hostnamePath) {
            this.hostnamePath = hostnamePath;
            return this;
        }

        public Builder hostsPath(String hostsPath) {
            this.hostsPath = hostsPath;
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder image(String image) {
            this.image = image;
            return this;
        }

        public Builder logPath(String logPath) {
            this.logPath = logPath;
            return this;
        }

        public Builder mountLabel(String mountLabel) {
            this.mountLabel = mountLabel;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder ipaddress(String ipaddress) {
            this.ipaddress = ipaddress;
            return this;
        }

        public Builder node(String node) {
            this.node = node;
            return this;
        }

        public Builder path(String path) {
            this.path = path;
            return this;
        }

        public Builder processLabel(String processLabel) {
            this.processLabel = processLabel;
            return this;
        }

        public Builder resolvConfPath(String resolvConfPath) {
            this.resolvConfPath = resolvConfPath;
            return this;
        }

        public Builder restartCount(String restartCount) {
            this.restartCount = restartCount;
            return this;
        }

        public Builder ports(String ports) {
            this.ports = ports;
            return this;
        }

        public Builder binds(List<String> binds) {
            this.binds = binds;
            return this;
        }

        public Builder blkioWeight(Integer blkioWeight) {
            this.blkioWeight = blkioWeight;
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

        public Builder cpuQuota(Integer cpuQuota) {
            this.cpuQuota = cpuQuota;
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

        public Builder portBindings(String portBindings) {
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

        public Builder restartPolicy(String restartPolicy) {
            this.restartPolicy = restartPolicy;
            return this;
        }

        public Builder pidMode(String pidMode) {
            this.pidMode = pidMode;
            return this;
        }

        public Builder memoryMB(Double memoryMB) {
            this.memoryMB = memoryMB;
            return this;
        }

        public Builder ulimits(String ulimits) {
            this.ulimits = ulimits;
            return this;
        }

        public Builder volumesFrom(String volumesFrom) {
            this.volumesFrom = volumesFrom;
            return this;
        }
    }
}
