package com.joint.jointCloud.home.model;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :created by lilingke
 * @date :2020/11/6
 * @describe :
 */
public class CarNodeBean {

    /**
     * TD : 0
     * FChild : [{"TD":0,"FChild":null,"FGUID":"72427c12-8568-44fe-a1f7-c1ccb68407aa","FNType":0,"AName":null,"FVCount":0,"FACount":0,"FName":"test【0】","FCar":null,"AGUID":"9afabf96-0bfa-4e67-b926-2436f57175de","GName":null}]
     * FGUID : 9afabf96-0bfa-4e67-b926-2436f57175de
     * FNType : 1
     * AName : null
     * FVCount : 0
     * FACount : 1
     * FName : 沃达浮测试【0】
     * FCar : null
     * AGUID : 25a48ca5-a844-4732-8af4-afa2a9d5c6dc
     * GName : null
     */
    public int TD;
    public List<CarNodeBean> FChild;
    public String FGUID;
    public int FNType;
    public String AName;
    public int FVCount;
    public int FACount;
    public String FName;
    public CarDetailBean FCar;
    public String AGUID;
    public String GName;
    // 条目的icon
    public int icon;
    // 树的层级
    public int level = -1;
    //    是否展开
    public boolean isExpand = true;
    //    是否选中
    public boolean isChoose;
    // 在搜索查询的时候使用：判断本节点是否显示
    public boolean isShow;
    //    父节点
    public CarNodeBean parent;

    public String getCarName() {
        if (FCar != null) {
            return FName + "[" + FCar.ID + "]";
        }
        return FName;
    }

    public List<CarNodeBean> get_childrenList() {
        if (FChild == null)
            return new ArrayList<>();
        return FChild;
    }

    //设置父节点
    public void setChildParent() {
        if (FChild != null && !FChild.isEmpty()) {
            for (CarNodeBean bean : FChild) {
                bean.parent = this;
                bean.setChildParent();
            }
        }
    }

    public int getLevel() {
        if (isRoot())
            level = 0;
        else if (level == -1)
            level = parent.getLevel() + 1;
        return level;

    }

    public boolean isRoot() {
        return parent == null;
    }

    public boolean isLeaf() {
        return (FChild == null || FChild.size() <= 0);
    }

    //递归遍历所有的子节点
    public List<CarNodeBean> getAllChild(List<CarNodeBean> childList) {

        if (FChild != null && !FChild.isEmpty()) {
            for (CarNodeBean nodeBean : FChild) {
                childList.add(nodeBean);
                nodeBean.getAllChild(childList);
            }

        }
        return childList;
    }

    public void setAllChildIsCheck(boolean isChoose) {
        this.isChoose = isChoose;
        if (FChild != null && !FChild.isEmpty()) {
            for (CarNodeBean nodeBean : FChild) {
                nodeBean.isChoose = isChoose;
                nodeBean.setAllChildIsCheck(isChoose);
            }

        }

    }

    public void setParentIschoos(boolean isChoose) {
        if (parent != null) {
            if (isChoose) {
                for (CarNodeBean bean : parent.FChild) {
                    if (!bean.isChoose)
                        return;
                }
                parent.isChoose = true;
                parent.setParentIschoos(true);
            } else {
                parent.isChoose = false;
                parent.setParentIschoos(false);
            }
        }
    }

    @Override
    public String toString() {
        return "CarNodeBean{" +
                "TD=" + TD +
                ", FGUID='" + FGUID + '\'' +
                ", FNType=" + FNType +
                ", AName='" + AName + '\'' +
                ", FVCount=" + FVCount +
                ", FACount=" + FACount +
                ", FName='" + FName + '\'' +
                ", FCar=" + FCar +
                ", AGUID='" + AGUID + '\'' +
                ", GName='" + GName + '\'' +
                ", icon=" + icon +
                ", level=" + level +
                ", isExpand=" + isExpand +
                ", isChoose=" + isChoose +
                ", isShow=" + isShow +
                ", parent=" + parent +
                '}';
    }
}
