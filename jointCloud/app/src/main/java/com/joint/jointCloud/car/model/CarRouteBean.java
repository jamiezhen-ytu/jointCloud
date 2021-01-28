package com.joint.jointCloud.car.model;

import java.util.List;

public class CarRouteBean {

    /**
     * Result : 200
     * Message : success
     * FObject : [{"FVehicleGUID":"3c611b54-623e-6fa8-3924-791c9cc94323","FVehicleName":"粤B12345","FLongitude":108.90106,"FLatitude":22.87157}]
     */

    public int Result;
    public String Message;
    public FObject FObject;


    public static class FObject{
        public List<CarListData> Table;
        public List<Table1> Table1;
    }

    public static class Table1{
        /**
         * FOverSpeed : 1000
         * FClassify : 3
         */
        public int FOverSpeed;
        public int FClassify;
    }
}
