package com.joint.jointCloud.home.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class FunctionBean {
    /**
     * Message : check token success
     * FObject : [{"FMenuName":"菜单栏","FMenuIndex":100,"FSolutionID":58,"FSystemType":2,"FGUID":"ac1a7d7c-d9fd-4600-a179-b0018f5f6252","FMenuLevle":1,"FParentGUID":null},{"FMenuName":"报警报表","FMenuIndex":104,"FSolutionID":59,"FSystemType":2,"FGUID":"5a18f061-031a-4797-bbc6-ba5df6840053","FMenuLevle":2,"FParentGUID":"ac1a7d7c-d9fd-4600-a179-b0018f5f6252"},{"FMenuName":"开关锁报告","FMenuIndex":105,"FSolutionID":65,"FSystemType":2,"FGUID":"5ffc3a85-d2f5-406d-b543-a53c1f370c4f","FMenuLevle":2,"FParentGUID":"ac1a7d7c-d9fd-4600-a179-b0018f5f6252"},{"FMenuName":"事件通知","FMenuIndex":106,"FSolutionID":66,"FSystemType":2,"FGUID":"3f17e82a-e859-44d7-b1e4-17d215bc750e","FMenuLevle":2,"FParentGUID":"ac1a7d7c-d9fd-4600-a179-b0018f5f6252"},{"FMenuName":"温度曲线","FMenuIndex":107,"FSolutionID":60,"FSystemType":2,"FGUID":"f231799c-b346-4816-b2ab-51caf1de4db7","FMenuLevle":2,"FParentGUID":"ac1a7d7c-d9fd-4600-a179-b0018f5f6252"},{"FMenuName":"油位分析","FMenuIndex":108,"FSolutionID":61,"FSystemType":2,"FGUID":"fd077298-308e-48fe-9e23-4fdf240745a5","FMenuLevle":2,"FParentGUID":"ac1a7d7c-d9fd-4600-a179-b0018f5f6252"},{"FMenuName":"停车报表","FMenuIndex":109,"FSolutionID":63,"FSystemType":2,"FGUID":"e9247ab9-05b1-4109-9abc-0abcf6a58e4a","FMenuLevle":2,"FParentGUID":"ac1a7d7c-d9fd-4600-a179-b0018f5f6252"},{"FMenuName":"行驶统计","FMenuIndex":110,"FSolutionID":64,"FSystemType":2,"FGUID":"230815f7-44fd-4f99-95cc-a3bccb51b005","FMenuLevle":2,"FParentGUID":"ac1a7d7c-d9fd-4600-a179-b0018f5f6252"},{"FMenuName":"主动安全报告","FMenuIndex":121,"FSolutionID":77,"FSystemType":2,"FGUID":"0c53d9e3-b41f-448f-b1e9-3f673880f148","FMenuLevle":2,"FParentGUID":"ac1a7d7c-d9fd-4600-a179-b0018f5f6252"},{"FMenuName":"派车清单","FMenuIndex":122,"FSolutionID":70,"FSystemType":2,"FGUID":"67b39453-f644-44b5-99ec-ee8fc1785d39","FMenuLevle":2,"FParentGUID":"ac1a7d7c-d9fd-4600-a179-b0018f5f6252"},{"FMenuName":"车次派发","FMenuIndex":123,"FSolutionID":71,"FSystemType":2,"FGUID":"4a70120f-e7a4-419f-a318-0b27dfc6a6e0","FMenuLevle":2,"FParentGUID":"ac1a7d7c-d9fd-4600-a179-b0018f5f6252"},{"FMenuName":"锁密码维护","FMenuIndex":124,"FSolutionID":68,"FSystemType":2,"FGUID":"655d8088-bc6d-4fdb-b643-4b37d565edc1","FMenuLevle":2,"FParentGUID":"ac1a7d7c-d9fd-4600-a179-b0018f5f6252"},{"FMenuName":"子锁配置","FMenuIndex":125,"FSolutionID":62,"FSystemType":2,"FGUID":"26bf0b02-9898-4373-9e26-5fe935d97a85","FMenuLevle":2,"FParentGUID":"ac1a7d7c-d9fd-4600-a179-b0018f5f6252"},{"FMenuName":"温湿度传感器配置","FMenuIndex":126,"FSolutionID":67,"FSystemType":2,"FGUID":"406933fe-ba42-45a3-be9d-73f474853655","FMenuLevle":2,"FParentGUID":"ac1a7d7c-d9fd-4600-a179-b0018f5f6252"},{"FMenuName":"视频配置","FMenuIndex":127,"FSolutionID":76,"FSystemType":2,"FGUID":"46ec8b4c-23f3-42fe-abe4-0554a1a462cf","FMenuLevle":2,"FParentGUID":"ac1a7d7c-d9fd-4600-a179-b0018f5f6252"},{"FMenuName":"设备注册","FMenuIndex":128,"FSolutionID":73,"FSystemType":2,"FGUID":"c7d1c196-0bfa-47ff-956d-26e1cea8be70","FMenuLevle":2,"FParentGUID":"ac1a7d7c-d9fd-4600-a179-b0018f5f6252"},{"FMenuName":"OTA升级","FMenuIndex":131,"FSolutionID":93,"FSystemType":2,"FGUID":"a91fd40e-615d-4a66-9ee6-13ca9afc31af","FMenuLevle":2,"FParentGUID":"ac1a7d7c-d9fd-4600-a179-b0018f5f6252"},{"FMenuName":"蓝牙运维","FMenuIndex":132,"FSolutionID":96,"FSystemType":2,"FGUID":"ebb0d278-1b0c-4c1b-96dc-1aef940162ff","FMenuLevle":2,"FParentGUID":"ac1a7d7c-d9fd-4600-a179-b0018f5f6252"}]
     * Result : 200
     */
    public String Message;
    public List<FunctionData> FObject;
    public int Result;

    public void setMessage(String Message) {
        this.Message = Message;
    }


    public static class FunctionData implements Parcelable {
        /**
         * FMenuName : 菜单栏
         * FMenuIndex : 100
         * FSolutionID : 58
         * FSystemType : 2
         * FGUID : ac1a7d7c-d9fd-4600-a179-b0018f5f6252
         * FMenuLevle : 1
         * FParentGUID : null
         */
        public String FMenuName;
        public int FMenuIndex;
        public int FSolutionID;
        public int FSystemType;
        public String FGUID;
        public int FMenuLevle;
        public int rid;
        public String FParentGUID;

        public FunctionData(String FMenuName, int FSolutionID) {
            this.FMenuName = FMenuName;
            this.FSolutionID = FSolutionID;
        }

        protected FunctionData(Parcel in) {
            FMenuName = in.readString();
            FMenuIndex = in.readInt();
            FSolutionID = in.readInt();
            FSystemType = in.readInt();
            FGUID = in.readString();
            FMenuLevle = in.readInt();
            rid = in.readInt();
            FParentGUID = in.readString();
        }


        public final Creator<FunctionData> CREATOR = new Creator<FunctionData>() {
            @Override
            public FunctionData createFromParcel(Parcel in) {
                return new FunctionData(in);
            }

            @Override
            public FunctionData[] newArray(int size) {
                return new FunctionData[size];
            }
        };

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(FMenuName);
            dest.writeInt(FMenuIndex);
            dest.writeInt(FSolutionID);
            dest.writeInt(FSystemType);
            dest.writeString(FGUID);
            dest.writeInt(FMenuLevle);
            dest.writeInt(rid);
            dest.writeString(FParentGUID);
        }
    }
}
