package com.joint.jointCloud.home.model;

/**
 * @author :created by lilingke
 * @date :2020/11/5
 * @describe :
 */
public class CarStatueBean {

    /**
     * Message : check token success
     * FObject : {"FOffline":552,"FUserExpired":4,"FRun":9,"FStop":57,"FOnline":69,"FUserExpiring":0,"FNotActive":57,"FCount":678,"FIdling":3}
     * Result : 200
     */
    public String Message;
    public CarStatueData FObject;
    public int Result;

    public class CarStatueData {
        /**
         * FOffline : 552
         * FUserExpired : 4
         * FRun : 9
         * FStop : 57
         * FOnline : 69
         * FUserExpiring : 0
         * FNotActive : 57
         * FCount : 678
         * FIdling : 3
         */
        public int FOffline;
        public int FUserExpired;
        public int FRun;
        public int FStop;
        public int FOnline;
        public int FUserExpiring;
        public int FNotActive;
        public int FCount;
        public int FIdling;
    }
}
