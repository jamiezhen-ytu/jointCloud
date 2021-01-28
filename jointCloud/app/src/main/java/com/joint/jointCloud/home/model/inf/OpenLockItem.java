package com.joint.jointCloud.home.model.inf;

public interface OpenLockItem {
    public int getId();

    public int getStatue();

    public String getNumble();

    public String getName();

    public String getLocation();

    public String getTime();

    public String getPeople();

    public int getOpenType();

    public String getTitle();

    public String getDate();

    public String getMileage();

    public boolean isChildItem(String date);
}
