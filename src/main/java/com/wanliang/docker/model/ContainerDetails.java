package com.wanliang.docker.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Detailed info for container
 */
public class ContainerDetails {
    private static final String APP_ARMOR_PROFILE="AppArmorProfile";
    private static final String ARGS = "Args";
    private static final String CONFIG = "Config";
    private static final String CREATED = "Created";
    private static final String DRIVER = "Driver";
    private static final String EXEC_DRIVER = "ExecDriver";
    private static final String EXEC_IDS = "ExecIDs";
    private static final String HOST_CONFIG = "HostConfig";
    private static final String HOSTNAME_PATH = "HostnamePath";
    private static final String HOSTS_PATH = "HostsPath";
    private static final String ID = "Id";
    private static final String IMAGE = "Image";
    private static final String LOG_PATH = "LogPath";
    private static final String MOUNT_LABEL = "MountLabel";
    private static final String NAME = "Name";
    private static final String NETWORK_SETTINGS = "NetworkSettings";
    private static final String NODE = "Node";
    private static final String PATH = "Path";
    private static final String PROCESS_LABEL = "ProcessLabel";
    private static final String RESOLV_CONF_PATH = "ResolvConfPath";
    private static final String RESTART_COUNT = "RestartCount";
    private static final String STATE = "State";
    private static final String VOLUMES = "Volumes";
    private static final String VOLUMES_RW = "VolumesRW";

    private final String appArmorProfile;
    private final List<String> args;
    private final ContainerConfig config;
    private final String created;
    private final String driver;
    private final String execDriver;
    private final List<String> execIDs;
    private final HostConfig hostConfig;
    private final String hostnamePath;
    private final String hostsPath;
    private final String id;
    private final String image;
    private final String logPath;
    private final String mountLabel;
    private final String name;
    private final ContainerNetworkSettings networkSettings;
    private final Node node;
    private final String path;
    private final String processLabel;
    private final String resolvConfPath;
    private final String restartCount;
    private final ContainerState state;
    private final Map<String, String> volumes;
    private final Map<String, Boolean> volumesRW;

    public ContainerDetails(@JsonProperty(APP_ARMOR_PROFILE) String appArmorProfile,
                            @JsonProperty(ARGS) List<String> args,
                            @JsonProperty(CONFIG) ContainerConfig config,
                            @JsonProperty(CREATED) String created,
                            @JsonProperty(DRIVER) String driver,
                            @JsonProperty(EXEC_DRIVER) String execDriver,
                            @JsonProperty(EXEC_IDS) List<String> execIDs,
                            @JsonProperty(HOST_CONFIG) HostConfig hostConfig,
                            @JsonProperty(HOSTNAME_PATH) String hostnamePath,
                            @JsonProperty(HOSTS_PATH) String hostsPath,
                            @JsonProperty(ID) String id,
                            @JsonProperty(IMAGE) String image,
                            @JsonProperty(LOG_PATH) String logPath,
                            @JsonProperty(MOUNT_LABEL) String mountLabel,
                            @JsonProperty(NAME) String name,
                            @JsonProperty(NETWORK_SETTINGS) ContainerNetworkSettings networkSettings,
                            @JsonProperty(NODE) Node node,
                            @JsonProperty(PATH) String path,
                            @JsonProperty(PROCESS_LABEL) String processLabel,
                            @JsonProperty(RESOLV_CONF_PATH) String resolvConfPath,
                            @JsonProperty(RESTART_COUNT) String restartCount,
                            @JsonProperty(STATE) ContainerState state,
                            @JsonProperty(VOLUMES) Map<String, String> volumes,
                            @JsonProperty(VOLUMES_RW) Map<String, Boolean> volumesRW) {
        this.appArmorProfile = appArmorProfile;
        this.args = args == null ? null : ImmutableList.copyOf(args);
        this.config = config;
        this.created = created;
        this.driver = driver;
        this.execDriver = execDriver;
        this.execIDs = execIDs == null ? null : ImmutableList.copyOf(execIDs);
        this.hostConfig = hostConfig;
        this.hostnamePath = hostnamePath;
        this.hostsPath = hostsPath;
        this.id = id;
        this.image = image;
        this.logPath = logPath;
        this.mountLabel = mountLabel;
        this.name = name;
        this.networkSettings = networkSettings;
        this.node = node;
        this.path = path;
        this.processLabel = processLabel;
        this.resolvConfPath = resolvConfPath;
        this.restartCount = restartCount;
        this.state = state;
        this.volumes = volumes == null? Collections.<String, String>emptyMap() : ImmutableMap.copyOf(volumes);
        this.volumesRW = volumesRW == null ? Collections.<String, Boolean>emptyMap() : ImmutableMap.copyOf(volumesRW);
    }

    @JsonProperty(VOLUMES_RW)
    public Map<String, Boolean> getVolumesRW() {
        return volumesRW;
    }

    @JsonProperty(VOLUMES)
    public Map<String, String> getVolumes() {
        return volumes;
    }

    @JsonProperty(STATE)
    public ContainerState getState() {
        return state;
    }

    @JsonProperty(RESTART_COUNT)
    public String getRestartCount() {
        return restartCount;
    }

    @JsonProperty(RESOLV_CONF_PATH)
    public String getResolvConfPath() {
        return resolvConfPath;
    }

    @JsonProperty(PROCESS_LABEL)
    public String getProcessLabel() {
        return processLabel;
    }

    @JsonProperty(PATH)
    public String getPath() {
        return path;
    }

    @JsonProperty(NODE)
    public Node getNode() {
        return node;
    }

    @JsonProperty(NETWORK_SETTINGS)
    public ContainerNetworkSettings getNetworkSettings() {
        return networkSettings;
    }

    @JsonProperty(NAME)
    public String getName() {
        return name;
    }

    @JsonProperty(MOUNT_LABEL)
    public String getMountLabel() {
        return mountLabel;
    }

    @JsonProperty(LOG_PATH)
    public String getLogPath() {
        return logPath;
    }

    @JsonProperty(IMAGE)
    public String getImage() {
        return image;
    }

    @JsonProperty(ID)
    public String getId() {
        return id;
    }

    @JsonProperty(HOSTS_PATH)
    public String getHostsPath() {
        return hostsPath;
    }

    @JsonProperty(HOSTNAME_PATH)
    public String getHostnamePath() {
        return hostnamePath;
    }

    @JsonProperty(HOST_CONFIG)
    public HostConfig getHostConfig() {
        return hostConfig;
    }

    @JsonProperty(EXEC_IDS)
    public List<String> getExecIDs() {
        return execIDs;
    }

    @JsonProperty(EXEC_DRIVER)
    public String getExecDriver() {
        return execDriver;
    }

    @JsonProperty(DRIVER)
    public String getDriver() {
        return driver;
    }

    @JsonProperty(CREATED)
    public String getCreated() {
        return created;
    }

    @JsonProperty(CONFIG)
    public ContainerConfig getConfig() {
        return config;
    }

    @JsonProperty(ARGS)
    public List<String> getArgs() {
        return args;
    }

    @JsonProperty(APP_ARMOR_PROFILE)
    public String getAppArmorProfile() {
        return appArmorProfile;
    }

    @Override
    public String toString() {
        return "ContainerDetails{" +
                "appArmorProfile='" + appArmorProfile + '\'' +
                ", args=" + args +
                ", config=" + config +
                ", created='" + created + '\'' +
                ", driver='" + driver + '\'' +
                ", execDriver='" + execDriver + '\'' +
                ", execIDs=" + execIDs +
                ", hostConfig=" + hostConfig +
                ", hostnamePath='" + hostnamePath + '\'' +
                ", hostsPath='" + hostsPath + '\'' +
                ", id='" + id + '\'' +
                ", image='" + image + '\'' +
                ", logPath='" + logPath + '\'' +
                ", mountLabel='" + mountLabel + '\'' +
                ", name='" + name + '\'' +
                ", networkSettings=" + networkSettings +
                ", node=" + node +
                ", path='" + path + '\'' +
                ", processLabel='" + processLabel + '\'' +
                ", resolvConfPath='" + resolvConfPath + '\'' +
                ", restartCount='" + restartCount + '\'' +
                ", state=" + state +
                ", volumes=" + volumes +
                ", volumesRW=" + volumesRW +
                '}';
    }
}
