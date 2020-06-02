package com.helmet.subscribe.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "data")
public class Data {
    @Id
    @GeneratedValue
    private long id;

    @Column
    private String sensor;

    @Column
    private long time;

    @Column
    private double jing;

    @Column
    private double wei;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public double getJing() {
        return jing;
    }

    public void setJing(double jing) {
        this.jing = jing;
    }

    public double getWei() {
        return wei;
    }

    public void setWei(double wei) {
        this.wei = wei;
    }
}
