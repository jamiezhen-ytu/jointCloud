package com.joint.jointCloud.car.model.inf;

public interface RoutineDetailItem {
    public int getId();

    public int getStatue();

    public String getTitle();

    public String getNum();

    public String getName();

    public String getStartTime();

    public String getEndTime();

    public String getAllTime();

    public String getStartLocation();

    public String getEndLcation();

    public String getDate();

    public boolean isChildItem(String date);

}
