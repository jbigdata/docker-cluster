package com.wanliang.docker.model.ui;

public class UIStatistics {

    //network
    private Long networkRxKBytes; //rx_bytes
    private Long networkRxPackets; //rx_packets
    private Long networkRxErrors; //rx_errors
    private Long networkRxDropped; //rx_dropped
    private Long networkTxKBytes; //tx_bytes
    private Long networkTxPackets; //tx_packets
    private Long networkTxErrors; //tx_errors
    private Long networkTxDropped; //tx_dropped

    //memory_stats in MB
    //usage
    private Double memoryMBUsage; //usage
    private Double memoryMBMaxUsage; //max_usage
    private Double memoryMBLimit;
    private Double memoryPercentage;

    //cpu_stats
    //cpu_usage
    private String cpuTotalUsage; //total_usage
    private String cpuKernel;     //usage_in_kernelmode
    private String cpuUser;       //usage_in_usermode

    private String cpuSystem;     //system_cpu_usage

    public UIStatistics() {
    }

    private UIStatistics(Builder builder) {
        this.networkRxKBytes = builder.networkRxKBytes;
        this.networkRxPackets = builder.networkRxPackets;
        this.networkRxErrors = builder.networkRxErrors;
        this.networkRxDropped = builder.networkRxDropped;
        this.networkTxKBytes = builder.networkTxKBytes;
        this.networkTxPackets = builder.networkTxPackets;
        this.networkTxErrors = builder.networkTxErrors;
        this.networkTxDropped = builder.networkTxDropped;
        this.memoryMBUsage = builder.memoryMBUsage;
        this.memoryMBMaxUsage = builder.memoryMBMaxUsage;
        this.cpuTotalUsage = builder.cpuTotalUsage;
        this.cpuKernel = builder.cpuKernel;
        this.cpuUser = builder.cpuUser;
        this.cpuSystem = builder.cpuSystem;
        this.memoryMBLimit = builder.memoryMBLimit;
        this.memoryPercentage = builder.memoryPercentage;
    }

    public static Builder newUIStatistics() {
        return new Builder();
    }


    public Long getNetworkRxKBytes() {
        return networkRxKBytes;
    }

    public void setNetworkRxKBytes(Long networkRxKBytes) {
        this.networkRxKBytes = networkRxKBytes;
    }

    public Long getNetworkRxPackets() {
        return networkRxPackets;
    }

    public void setNetworkRxPackets(Long networkRxPackets) {
        this.networkRxPackets = networkRxPackets;
    }

    public Long getNetworkRxErrors() {
        return networkRxErrors;
    }

    public void setNetworkRxErrors(Long networkRxErrors) {
        this.networkRxErrors = networkRxErrors;
    }

    public Long getNetworkRxDropped() {
        return networkRxDropped;
    }

    public void setNetworkRxDropped(Long networkRxDropped) {
        this.networkRxDropped = networkRxDropped;
    }

    public Long getNetworkTxKBytes() {
        return networkTxKBytes;
    }

    public void setNetworkTxKBytes(Long networkTxKBytes) {
        this.networkTxKBytes = networkTxKBytes;
    }

    public Long getNetworkTxPackets() {
        return networkTxPackets;
    }

    public void setNetworkTxPackets(Long networkTxPackets) {
        this.networkTxPackets = networkTxPackets;
    }

    public Long getNetworkTxErrors() {
        return networkTxErrors;
    }

    public void setNetworkTxErrors(Long networkTxErrors) {
        this.networkTxErrors = networkTxErrors;
    }

    public Long getNetworkTxDropped() {
        return networkTxDropped;
    }

    public void setNetworkTxDropped(Long networkTxDropped) {
        this.networkTxDropped = networkTxDropped;
    }

    public Double getMemoryMBUsage() {
        return memoryMBUsage;
    }

    public void setMemoryMBUsage(Double memoryMBUsage) {
        this.memoryMBUsage = memoryMBUsage;
    }

    public Double getMemoryMBMaxUsage() {
        return memoryMBMaxUsage;
    }

    public void setMemoryMBMaxUsage(Double memoryMBMaxUsage) {
        this.memoryMBMaxUsage = memoryMBMaxUsage;
    }

    public String getCpuTotalUsage() {
        return cpuTotalUsage;
    }

    public void setCpuTotalUsage(String cpuTotalUsage) {
        this.cpuTotalUsage = cpuTotalUsage;
    }

    public String getCpuKernel() {
        return cpuKernel;
    }

    public void setCpuKernel(String cpuKernel) {
        this.cpuKernel = cpuKernel;
    }

    public String getCpuUser() {
        return cpuUser;
    }

    public void setCpuUser(String cpuUser) {
        this.cpuUser = cpuUser;
    }

    public String getCpuSystem() {
        return cpuSystem;
    }

    public void setCpuSystem(String cpuSystem) {
        this.cpuSystem = cpuSystem;
    }

    public Double getMemoryMBLimit() {
        return memoryMBLimit;
    }

    public Double getMemoryPercentage() {
        return memoryPercentage;
    }

    public static final class Builder {
        private Long networkRxKBytes;
        private Long networkRxPackets;
        private Long networkRxErrors;
        private Long networkRxDropped;
        private Long networkTxKBytes;
        private Long networkTxPackets;
        private Long networkTxErrors;
        private Long networkTxDropped;
        private Double memoryMBUsage;
        private Double memoryMBMaxUsage;
        private Double memoryMBLimit;
        private Double memoryPercentage;
        private String cpuTotalUsage;
        private String cpuKernel;
        private String cpuUser;
        private String cpuSystem;

        private Builder() {
        }

        public UIStatistics build() {
            return new UIStatistics(this);
        }

        public Builder networkRxKBytes(Long networkRxKBytes) {
            this.networkRxKBytes = networkRxKBytes;
            return this;
        }

        public Builder networkRxPackets(Long networkRxPackets) {
            this.networkRxPackets = networkRxPackets;
            return this;
        }

        public Builder networkRxErrors(Long networkRxErrors) {
            this.networkRxErrors = networkRxErrors;
            return this;
        }

        public Builder networkRxDropped(Long networkRxDropped) {
            this.networkRxDropped = networkRxDropped;
            return this;
        }

        public Builder networkTxKBytes(Long networkTxKBytes) {
            this.networkTxKBytes = networkTxKBytes;
            return this;
        }

        public Builder networkTxPackets(Long networkTxPackets) {
            this.networkTxPackets = networkTxPackets;
            return this;
        }

        public Builder networkTxErrors(Long networkTxErrors) {
            this.networkTxErrors = networkTxErrors;
            return this;
        }

        public Builder networkTxDropped(Long networkTxDropped) {
            this.networkTxDropped = networkTxDropped;
            return this;
        }

        public Builder memoryMBUsage(Double memoryMBUsage) {
            this.memoryMBUsage = memoryMBUsage;
            return this;
        }

        public Builder memoryMBMaxUsage(Double memoryMBMaxUsage) {
            this.memoryMBMaxUsage = memoryMBMaxUsage;
            return this;
        }

        public Builder memoryMBLimit(Double memoryMBLimit) {
            this.memoryMBLimit = memoryMBLimit;
            return this;
        }

        public Builder memoryPercentage(Double memoryPercentage) {
            this.memoryPercentage = memoryPercentage;
            return this;
        }

        public Builder cpuTotalUsage(String cpuTotalUsage) {
            this.cpuTotalUsage = cpuTotalUsage;
            return this;
        }

        public Builder cpuKernel(String cpuKernel) {
            this.cpuKernel = cpuKernel;
            return this;
        }

        public Builder cpuUser(String cpuUser) {
            this.cpuUser = cpuUser;
            return this;
        }

        public Builder cpuSystem(String cpuSystem) {
            this.cpuSystem = cpuSystem;
            return this;
        }
    }
}
