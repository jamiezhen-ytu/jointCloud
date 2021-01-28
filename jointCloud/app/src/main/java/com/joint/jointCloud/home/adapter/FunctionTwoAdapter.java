package com.joint.jointCloud.home.adapter;

import androidx.annotation.NonNull;


import com.joint.jointCloud.R;
import com.joint.jointCloud.home.model.FunctionBean;

import cn.lilingke.commonlibrary.ui.adapter.BaseRecyclerAdapter;

public class FunctionTwoAdapter extends BaseRecyclerAdapter<FunctionBean> {

    @Override
    public int getItemLayoutId(int viewType) {
        return R.layout.item_function;
    }

    @Override
    public void onBindViewHolder(@NonNull CommonHolder holder, int position) {
        FunctionBean item = getItem(position);
//        holder.setText(R.id.tv_name, item.name);
//        holder.setImageResource(R.id.img_icon, item.rid);
    }
}
