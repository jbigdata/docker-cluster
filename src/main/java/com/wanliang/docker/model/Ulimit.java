package com.wanliang.docker.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import static com.google.common.base.Preconditions.checkNotNull;

public class Ulimit {

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Soft")
    private Integer soft;

    @JsonProperty("Hard")
    private Integer hard;

    public Ulimit() {

    }

    public Ulimit(String name, int soft, int hard) {
        checkNotNull(name, "Name is null");

        this.name = name;
        this.soft = soft;
        this.hard = hard;
    }

    public String getName() {
        return name;
    }

    public Integer getSoft() {
        return soft;
    }

    public Integer getHard() {
        return hard;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Ulimit) {
            Ulimit other = (Ulimit) obj;
            return new EqualsBuilder().append(name, other.getName()).append(soft, other.getSoft())
                    .append(hard, other.getHard()).isEquals();
        } else
            return super.equals(obj);

    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(soft).append(hard).toHashCode();
    }

    @Override
    public String toString() {
        return "Ulimit{" +
                "name='" + name + '\'' +
                ", soft=" + soft +
                ", hard=" + hard +
                '}';
    }
}