package com.wanliang.docker.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Configuration of image container.
 */
public final class ContainerConfig {
    private static final String ATTACH_STDERR = "AttachStderr";
    private static final String ATTACH_STDIN = "AttachStdin";
    private static final String ATTACH_STDOUT = "AttachStdout";
    private static final String CMD = "Cmd";
    private static final String CPU_SHARES = "CpuShares";
    private static final String CPUSET = "Cpuset";
    private static final String DOMAIN_NAME = "Domainname";
    private static final String ENTRYPOINT = "Entrypoint";
    private static final String ENV = "Env";
    private static final String EXPOSED_PORTS = "ExposedPorts";
    private static final String HOSTNAME = "Hostname";
    private static final String IMAGE = "Image";
    private static final String LABELS = "Labels";
    private static final String MAC_ADDRESS = "MacAddress";
    private static final String MEMORY = "Memory";
    private static final String MEMORY_SWAP = "MemorySwap";
    private static final String NETWORK_DISBALED = "NetworkDisabled";
    private static final String ON_BUILD = "OnBuild";
    private static final String OPEN_STDIN = "OpenStdin";
    private static final String PORT_SPECS = "PortSpecs";
    private static final String STDIN_ONCE = "StdinOnce";
    private static final String TTY = "Tty";
    private static final String USER = "User";
    private static final String VOLUMES = "Volumes";
    private static final String WORKING_DIR = "WorkingDir";

    private final boolean attachStderr;
    private final boolean attachStdin;
    private final boolean attachStdout;
    private final List<String> cmd;
    private final int cpuShares;
    private final String cpuset;
    private final String domainname;
    private final List<String> entrypoint;
    private final List<String> env;
    private final Map<String, Object> exposedPorts;
    private final String hostname;
    private final String image;
    private final Map<String, String> labels;
    private final String macAddress;
    private final long memory;
    private final long memorySwap;
    private final boolean networkDisabled;
    private final List<String> onBuild;
    private final boolean openStdin;
    private final String portSpecs;
    private final boolean stdinOnce;
    private final boolean tty;
    private final String user;
    private final Map<String, Object> volumes;
    private final String workingDir;

    @JsonCreator
    public ContainerConfig(@JsonProperty(ATTACH_STDERR) boolean attachStderr,
                           @JsonProperty(ATTACH_STDIN) boolean attachStdin,
                           @JsonProperty(ATTACH_STDOUT) boolean attachStdout,
                           @JsonProperty(CMD) List<String> cmd,
                           @JsonProperty(CPU_SHARES) int cpuShares,
                           @JsonProperty(CPUSET) String cpuset,
                           @JsonProperty(DOMAIN_NAME) String domainname,
                           @JsonProperty(ENTRYPOINT) List<String> entrypoint,
                           @JsonProperty(ENV) List<String> env,
                           @JsonProperty(EXPOSED_PORTS) Map<String, Object> exposedPorts,
                           @JsonProperty(HOSTNAME) String hostname,
                           @JsonProperty(IMAGE) String image,
                           @JsonProperty(LABELS) Map<String, String> labels,
                           @JsonProperty(MAC_ADDRESS) String macAddress,
                           @JsonProperty(MEMORY) long memory,
                           @JsonProperty(MEMORY_SWAP) long memorySwap,
                           @JsonProperty(NETWORK_DISBALED) boolean networkDisabled,
                           @JsonProperty(ON_BUILD) List<String> onBuild,
                           @JsonProperty(OPEN_STDIN) boolean openStdin,
                           @JsonProperty(PORT_SPECS) String portSpecs,
                           @JsonProperty(STDIN_ONCE) boolean stdinOnce,
                           @JsonProperty(TTY) boolean tty,
                           @JsonProperty(USER) String user,
                           @JsonProperty(VOLUMES) Map<String, Object> volumes,
                           @JsonProperty(WORKING_DIR) String workingDir) {
        this.attachStderr = attachStderr;
        this.attachStdin = attachStdin;
        this.attachStdout = attachStdout;
        this.cmd = cmd;
        this.cpuShares = cpuShares;
        this.cpuset = cpuset;
        this.domainname = domainname;
        this.entrypoint = entrypoint == null? Collections.<String>emptyList() : ImmutableList.copyOf(entrypoint);
        this.env = env;
        this.exposedPorts = exposedPorts == null?  Collections.<String, Object>emptyMap()  : ImmutableMap.copyOf(exposedPorts);
        this.hostname = hostname;
        this.image = image;
        this.labels = labels == null? Collections.<String, String>emptyMap() : ImmutableMap.copyOf(labels);
        this.macAddress = macAddress;
        this.memory = memory;
        this.memorySwap = memorySwap;
        this.networkDisabled = networkDisabled;
        this.onBuild = onBuild;
        this.openStdin = openStdin;
        this.portSpecs = portSpecs;
        this.stdinOnce = stdinOnce;
        this.tty = tty;
        this.user = user;
        this.volumes = volumes == null? Collections.<String, Object>emptyMap() : ImmutableMap.copyOf(volumes);
        this.workingDir = workingDir;
    }

    @JsonProperty(ATTACH_STDERR)
    public boolean isAttachStderr() {
        return attachStderr;
    }

    @JsonProperty(ATTACH_STDIN)
    public boolean isAttachStdin() {
        return attachStdin;
    }

    @JsonProperty(ATTACH_STDOUT)
    public boolean isAttachStdout() {
        return attachStdout;
    }

    @JsonProperty(CMD)
    public List<String> getCmd() {
        return cmd;
    }

    @JsonProperty(CPU_SHARES)
    public int getCpuShares() {
        return cpuShares;
    }

    @JsonProperty(CPUSET)
    public String getCpuset() {
        return cpuset;
    }

    @JsonProperty(DOMAIN_NAME)
    public String getDomainname() {
        return domainname;
    }

    @JsonProperty(ENTRYPOINT)
    public List<String> getEntrypoint() {
        return entrypoint;
    }

    @JsonProperty(ENV)
    public List<String> getEnv() {
        return env;
    }

    @JsonProperty(EXPOSED_PORTS)
    public Map<String, Object> getExposedPorts() {
        return exposedPorts;
    }

    @JsonProperty(HOSTNAME)
    public String getHostname() {
        return hostname;
    }

    @JsonProperty(IMAGE)
    public String getImage() {
        return image;
    }

    @JsonProperty(LABELS)
    public Map<String, String> getLabels() {
        return labels;
    }

    @JsonProperty(MAC_ADDRESS)
    public String getMacAddress() {
        return macAddress;
    }

    @JsonProperty(MEMORY)
    public long getMemory() {
        return memory;
    }

    @JsonProperty(MEMORY_SWAP)
    public long getMemorySwap() {
        return memorySwap;
    }

    @JsonProperty(NETWORK_DISBALED)
    public boolean isNetworkDisabled() {
        return networkDisabled;
    }

    @JsonProperty(ON_BUILD)
    public List<String> getOnBuild() {
        return onBuild;
    }

    @JsonProperty(OPEN_STDIN)
    public boolean isOpenStdin() {
        return openStdin;
    }

    @JsonProperty(PORT_SPECS)
    public String getPortSpecs() {
        return portSpecs;
    }

    @JsonProperty(STDIN_ONCE)
    public boolean isStdinOnce() {
        return stdinOnce;
    }

    @JsonProperty(TTY)
    public boolean isTty() {
        return tty;
    }

    @JsonProperty(USER)
    public String getUser() {
        return user;
    }

    @JsonProperty(VOLUMES)
    public Map<String, Object> getVolumes() {
        return volumes;
    }

    @JsonProperty(WORKING_DIR)
    public String getWorkingDir() {
        return workingDir;
    }

    @Override
    public String toString() {
        return "ContainerConfig{" +
                "cmd=" + cmd +
                ", domainname='" + domainname + '\'' +
                ", entrypoint=" + entrypoint +
                ", image='" + image + '\'' +
                '}';
    }
}
