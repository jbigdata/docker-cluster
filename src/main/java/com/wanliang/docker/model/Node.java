package com.wanliang.docker.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableMap;

import java.util.Collections;
import java.util.Map;

/**
 * Represent swarm node @see https://github.com/docker/swarm/blob/master/discovery/nodes/nodes.go
 * The node == host on which runs docker service.
 */
public class Node {
    private static final String ADDR = "Addr";
    private static final String CPUS = "Cpus";
    private static final String ID = "ID";
    private static final String IP = "IP";
    private static final String LABELS = "Labels";
    private static final String MEMORY = "Memory";
    private static final String NAME = "Name";

    private final String addr;
    private final int cpus;
    private final String id;
    private final String ip;
    private final String name;
    private final long memory;
    private final Map<String, String> labels;

    @JsonCreator
    public Node(@JsonProperty(ADDR) String addr,
                @JsonProperty(CPUS) int cpus,
                @JsonProperty(ID) String id,
                @JsonProperty(IP) String ip,
                @JsonProperty(NAME) String name,
                @JsonProperty(MEMORY) long memory,
                @JsonProperty(LABELS) Map<String, String> labels) {
        this.addr = addr;
        this.cpus = cpus;
        this.id = id;
        this.ip = ip;
        this.name = name;
        this.memory = memory;
        this.labels = labels == null? Collections.<String, String>emptyMap() : ImmutableMap.copyOf(labels);
    }

    @JsonProperty(ADDR)
    public String getAddr() {
        return addr;
    }

    @JsonProperty(CPUS)
    public int getCpus() {
        return cpus;
    }

    @JsonProperty(ID)
    public String getId() {
        return id;
    }

    @JsonProperty(IP)
    public String getIp() {
        return ip;
    }

    @JsonProperty(NAME)
    public String getName() {
        return name;
    }

    @JsonProperty(MEMORY)
    public long getMemory() {
        return memory;
    }

    @JsonProperty(LABELS)
    public Map<String, String> getLabels() {
        return labels;
    }
}
