package com.joint.jointCloud.home.adapter;

import androidx.annotation.NonNull;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import com.joint.jointCloud.R;
import com.joint.jointCloud.home.model.TemperatureSensorBean;

import cn.lilingke.commonlibrary.ui.adapter.BaseRecyclerAdapter;

public class TemperatureSensorAdapter extends BaseRecyclerAdapter<TemperatureSensorBean> {

    @Override
    public int getItemLayoutId(int viewType) {
        return R.layout.item_temperature_sensor;
    }


    @Override
    public void onBindViewHolder(@NonNull CommonHolder holder, final int position) {
        TemperatureSensorBean item = getItem(position);
        holder.setText(R.id.tv_num, (position + 1) + "");
        holder.setText(R.id.et_num, item.id);
        holder.setText(R.id.tv_time, item.time);
        holder.setText(R.id.tv_temperature, item.temperature);
        holder.setText(R.id.tv_humidity, item.humidity);
        holder.setText(R.id.tv_power, item.power);
        TextView tvPower = holder.getText(R.id.tv_power);
        EditText etId = holder.getView(R.id.et_num);


        etId.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s != null) {
                    mData.get(position).id = s.toString();
                } else {
                    mData.get(position).id = null;
                }
            }
        });
    }
}
