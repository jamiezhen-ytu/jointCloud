package com.joint.jointCloud.car.model;


import com.joint.jointCloud.car.model.inf.ListItem;

public class CarDetailsBean implements ListItem {
    public int statue;
    public String name;
    public String value;

    public CarDetailsBean() {

    }

    public CarDetailsBean(int statue, String name, String value) {
        this.statue = statue;
        this.name = name;
        this.value = value;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public int getStatue() {
        return statue;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getValue() {
        return value;
    }
}
