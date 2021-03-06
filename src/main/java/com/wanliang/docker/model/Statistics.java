package com.wanliang.docker.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;


/**
 * Representation of a Docker statistics.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class Statistics {

    @JsonProperty("read")
    private String read;

    @JsonProperty("network")
    private Map<String, Object> networkStats;

    @JsonProperty("memory_stats")
    private Map<String, Object> memoryStats;

    @JsonProperty("blkio_stats")
    private Map<String, Object> blkioStats;

    @JsonProperty("cpu_stats")
    private Map<String, Object> cpuStats;

    public Map<String, Object> getNetworkStats() {
        return networkStats;
    }

    public Map<String, Object> getCpuStats() {
        return cpuStats;
    }

    public Map<String, Object> getMemoryStats() {
        return memoryStats;
    }

    public Map<String, Object> getBlkioStats() {
        return blkioStats;
    }

}