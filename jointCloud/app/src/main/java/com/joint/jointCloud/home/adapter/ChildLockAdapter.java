package com.joint.jointCloud.home.adapter;

import androidx.annotation.NonNull;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.joint.jointCloud.R;
import com.joint.jointCloud.home.model.AddLockBean;
import com.joint.jointCloud.home.model.CarDetailBean;

import java.util.ArrayList;
import java.util.List;

import cn.lilingke.commonlibrary.ui.adapter.BaseRecyclerAdapter;
import cn.lilingke.commonlibrary.utils.LogPlus;

public class ChildLockAdapter extends BaseRecyclerAdapter<AddLockBean> {

    @Override
    public int getItemLayoutId(int viewType) {
        return R.layout.item_child_lock;
    }

    public ChildLockAdapter() {

    }

    @Override
    public void onBindViewHolder(@NonNull CommonHolder holder, final int position) {
        AddLockBean item = getItem(position);
        holder.setText(R.id.tv_name, holder.getContext().getResources().getString(R.string.child_lock_id, position + 1));
        EditText etValue = holder.getView(R.id.et_num);
        etValue.setText(item.name);
        LogPlus.e("statue == " + item.statue);
        etValue.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s != null && !s.toString().isEmpty()) {
                    mData.get(position).name = s.toString();
                    mData.get(position).statue = 1;
                } else {
                    mData.get(position).name = null;
                    mData.get(position).statue = 0;
                }
            }
        });
    }

    public void appenData(String value) {
        int index = -1;
        for (int i = 0; i < mData.size(); i++) {
            if (mData.get(i).statue == 0) {
                mData.get(i).statue = 1;
                mData.get(i).name = value;
                index = i;
                break;
            }
        }
        if (index == -1) {
            mData.add(new AddLockBean(value, 1));
        }
        LogPlus.e("要刷新了");
        notifyDataSetChanged();
    }


    public String getChildLockId() {
        StringBuilder sb = new StringBuilder();
        for (AddLockBean bean : mData) {
            if (bean.statue == 1 && !bean.name.isEmpty())
                sb.append(bean.name).append(",");
        }
        return sb.length() > 1 ? sb.substring(0, sb.length() - 1) : sb.toString();
    }
}
