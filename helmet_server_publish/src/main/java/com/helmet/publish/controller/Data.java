package com.helmet.publish.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class Data {

    private long id;


    private String sensor;


    private long time;


    private double jing;


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

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", sensor='" + sensor + '\'' +
                ", time=" + time +
                ", jing=" + jing +
                ", wei=" + wei +
                '}';
    }
}
