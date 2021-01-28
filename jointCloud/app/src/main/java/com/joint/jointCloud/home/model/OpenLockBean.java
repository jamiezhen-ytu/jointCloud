package com.joint.jointCloud.home.model;

import com.joint.jointCloud.home.model.inf.OpenLockItem;

import java.util.Random;

/**
 * @author :created by lilingke
 * @date :2020/11/4
 * @describe :
 */
public class OpenLockBean implements OpenLockItem {

    public String date;

    public OpenLockBean(String date) {
        this.date = date;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public int getStatue() {
        Random random = new Random();
        return random.nextInt(1);
    }

    @Override
    public String getNumble() {
        return "[E014521485]";
    }

    @Override
    public String getName() {
        return "7854214856";
    }

    @Override
    public String getLocation() {
        return "湖南省长沙市岳麓区三一大道伍家岭高新区管委会23号";
    }

    @Override
    public String getTime() {
        return "05:20:11";
    }

    @Override
    public String getPeople() {
        return "张红";
    }

    @Override
    public int getOpenType() {
        Random random = new Random();
        return random.nextInt(4);
    }

    @Override
    public String getTitle() {
        return date + " 开锁情况";
    }

    @Override
    public String getDate() {
        return date;
    }

    @Override
    public String getMileage() {
        return 1220+"km";
    }

    @Override
    public boolean isChildItem(String date) {
        return this.date.equals(date);
    }
}
