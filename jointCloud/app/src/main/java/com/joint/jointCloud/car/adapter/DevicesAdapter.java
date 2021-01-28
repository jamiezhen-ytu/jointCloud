package com.joint.jointCloud.car.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.joint.jointCloud.R;
import com.joint.jointCloud.car.model.DevicesBean;
import com.joint.jointCloud.car.model.inf.RoutineDetailItem;

import cn.lilingke.commonlibrary.ui.adapter.BaseRecyclerAdapter;

public class DevicesAdapter extends BaseRecyclerAdapter<DevicesBean.DeviceData> {

    @Override
    public int getItemLayoutId(int viewType) {
        return R.layout.item_devices_list;
    }

    @Override
    public void onBindViewHolder(@NonNull CommonHolder holder, int position) {
        DevicesBean.DeviceData item = getItem(position);
        if (item.FVehicleName != null && !item.FVehicleName.isEmpty()) {
            holder.setText(R.id.tv_name, holder.getContext().getResources().getString(R.string.devices_name2, item.FAssetID, item.FAssetTypeName, item.FVehicleName));
        } else {
            holder.setText(R.id.tv_name, holder.getContext().getResources().getString(R.string.devices_name1, item.FAssetID, item.FAssetTypeName));
        }

    }

}
