package com.joint.jointCloud.car.adapter;

import android.content.Context;
import androidx.annotation.NonNull;
import android.view.View;
import android.widget.TextView;


import com.joint.jointCloud.R;
import com.joint.jointCloud.car.model.inf.ListItem;

import cn.lilingke.commonlibrary.ui.adapter.BaseRecyclerAdapter;

public class CarDetailAdapter<T extends ListItem> extends BaseRecyclerAdapter<T> {
    private Context mContext;

    @Override
    public int getItemLayoutId(int viewType) {
        return R.layout.item_car_detail;
    }

    public CarDetailAdapter(Context context) {
        this.mContext = context;
    }

    @Override
    public void onBindViewHolder(@NonNull CommonHolder holder, int position) {
        T item = getItem(position);
        holder.setText(R.id.tv_name, item.getName());
        holder.setText(R.id.tv_value, item.getValue());

        TextView tvValue = holder.getText(R.id.tv_value);
        TextView tvLeft = holder.getText(R.id.tv_left);

        if (item.getStatue() == 1) {
            tvLeft.setVisibility(View.VISIBLE);
            tvValue.setTextColor(mContext.getResources().getColor(R.color.color_CD0101));
        } else {
            tvLeft.setVisibility(View.GONE);
            tvValue.setTextColor(mContext.getResources().getColor(R.color.color_999999));
        }
    }
}
