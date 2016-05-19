package com.wanliang.docker.model.ui;


import javax.validation.constraints.NotNull;


/**
 * POST Data for update containers command
 */
public class UiUpdateContainers {

    @NotNull
    private String service;
    @NotNull
    private String version;
    @NotNull
    private String strategy;
    private Float percentage;
    private boolean healthCheckEnabled;
    private boolean rollbackEnabled;

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Float getPercentage() {
        return percentage;
    }

    public void setPercentage(Float percentage) {
        this.percentage = percentage;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public boolean isHealthCheckEnabled() {
        return healthCheckEnabled;
    }

    public void setHealthCheckEnabled(boolean healthCheckEnabled) {
        this.healthCheckEnabled = healthCheckEnabled;
    }

    public boolean isRollbackEnabled() {
        return rollbackEnabled;
    }

    public void setRollbackEnabled(boolean rollbackEnabled) {
        this.rollbackEnabled = rollbackEnabled;
    }

    @Override
    public String toString() {
        return "UiUpdateContainers{" +
          "service='" + service + '\'' +
          ", version='" + version + '\'' +
          ", strategy=" + strategy +
          ", percentage=" + percentage +
          ", healthCheckEnabled=" + healthCheckEnabled +
          '}';
    }
}
