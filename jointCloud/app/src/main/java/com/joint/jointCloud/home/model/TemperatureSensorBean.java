package com.joint.jointCloud.home.model;

/**
 * @author :created by lilingke
 * @date :2020/11/4
 * @describe :
 */
public class TemperatureSensorBean {
    public String id;
    public String time;
    public String temperature;
    public String humidity;
    public String power;

    public TemperatureSensorBean(String id, String time, String temperature, String humidity, String power) {
        this.id = id;
        this.time = time;
        this.temperature = temperature;
        this.humidity = humidity;
        this.power = power;
    }
}
