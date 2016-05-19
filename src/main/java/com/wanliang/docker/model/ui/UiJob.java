package com.wanliang.docker.model.ui;

import org.springframework.batch.core.BatchStatus;

import java.util.Date;
import java.util.Map;

/**
 * Model of ui representation of {@link org.springframework.batch.core.JobExecution }
 */
public class UiJob {
    private long id;
    private String name;
    private Map<String, Object> parameters;
    private BatchStatus status;
    private Date startTime;
    private Date createTime;
    private Date endTime;
    private Date lastUpdated;
    private String exitCode;
    private String exitDescription;
    private boolean running;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Object> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    public BatchStatus getStatus() {
        return status;
    }

    public void setStatus(BatchStatus status) {
        this.status = status;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getExitCode() {
        return exitCode;
    }

    public void setExitCode(String exitCode) {
        this.exitCode = exitCode;
    }

    public String getExitDescription() {
        return exitDescription;
    }

    public void setExitDescription(String exitDescription) {
        this.exitDescription = exitDescription;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
}
