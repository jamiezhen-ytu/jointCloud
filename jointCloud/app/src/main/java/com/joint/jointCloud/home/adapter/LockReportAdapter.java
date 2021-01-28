package com.joint.jointCloud.home.adapter;

import androidx.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.joint.jointCloud.R;
import com.joint.jointCloud.home.model.inf.OpenLockItem;

import cn.lilingke.commonlibrary.ui.adapter.BaseRecyclerAdapter;

public class LockReportAdapter<T extends OpenLockItem> extends BaseRecyclerAdapter<T> {

    @Override
    public int getItemLayoutId(int viewType) {
        return R.layout.item_open_lock_report;
    }

    @Override
    public void onBindViewHolder(@NonNull CommonHolder holder, int position) {
        T item = getItem(position);
        holder.setText(R.id.tv_name, item.getName());
        holder.setText(R.id.tv_mileage, item.getMileage());
        holder.setText(R.id.tv_time, item.getTime());
        holder.setText(R.id.tv_location, item.getLocation());
        TextView tvTitle = holder.getText(R.id.tv_title);
        TextView tvPeople = holder.getText(R.id.tv_people);
        ImageView imgIcon = holder.getImage(R.id.img_icon);
        View line = holder.getView(R.id.view_bottom);

        if (position == 0) {
            tvTitle.setVisibility(View.VISIBLE);
            line.setVisibility(View.GONE);
            tvTitle.setText(item.getTitle());
        } else {
            T preItem = getItem(position - 1);
            if (item.isChildItem(preItem.getDate())) {//是同一天的
                tvTitle.setVisibility(View.GONE);
                line.setVisibility(View.VISIBLE);
            } else {
                tvTitle.setVisibility(View.VISIBLE);
                line.setVisibility(View.GONE);
                tvTitle.setText(item.getTitle());
            }
        }

        if (item.getStatue() == 1){
            tvPeople.setText(item.getPeople());
            imgIcon.setImageResource(getImgRid(item.getOpenType()));
            tvPeople.setVisibility(View.VISIBLE);
            imgIcon.setVisibility(View.VISIBLE);
        }else {
            tvPeople.setVisibility(View.INVISIBLE);
            imgIcon.setVisibility(View.INVISIBLE);
        }
    }

    private int getImgRid(int type){
        int rid = R.mipmap.lock_unrecognized_icon;
        if (type ==1){
            rid = R.mipmap.lock_remote_icon;
        }else if (type ==2){
            rid = R.mipmap.lock_card_icon;
        }else if (type ==3){
            rid = R.mipmap.lock_blue_icon;
        }
        return rid;
    }
}
