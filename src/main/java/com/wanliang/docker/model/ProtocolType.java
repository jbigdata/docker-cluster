package com.wanliang.docker.model;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum of docker protocol types
 */
public enum ProtocolType {
    TCP, UDP;

    @JsonValue
    public String jsonValue() {
        return name().toLowerCase();
    }
}
