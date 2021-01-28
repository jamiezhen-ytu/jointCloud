package com.joint.jointCloud.car.model;

/**
 * @author :created by lilingke
 * @date :2020/11/13
 * @describe :
 */
public class CarDetailData {


    /**
     * Message : check token success
     * FObject : {"FFuelPercentages":null,"FFuelTotal":null,"FFuels":null,"FHumis":"","FFuelAndPer":null,"FFuelPerTotal":null,"FDriverPhone":"13044556677","FDriverName":"曹四","FTemps":"","FTH":"","FPosture":null,"FAlarmCount":0}
     * Result : 200
     */
    public String Message;
    public FObjectEntity FObject;
    public int Result;


    public class FObjectEntity {
        /**
         * FFuelPercentages : null
         * FFuelTotal : null
         * FFuels : null
         * FHumis :
         * FFuelAndPer : null
         * FFuelPerTotal : null
         * FDriverPhone : 13044556677
         * FDriverName : 曹四
         * FTemps :
         * FTH :
         * FPosture : null
         * FAlarmCount : 0
         */
        public String FFuelPercentages;
        public String FFuelTotal;
        public String FFuels;
        public String FHumis;
        public String FFuelAndPer;
        public String FFuelPerTotal;
        public String FDriverPhone;
        public String FDriverName;
        public String FTemps;
        public String FTH;
        public String FPosture;
        public int FAlarmCount;
    }
}
