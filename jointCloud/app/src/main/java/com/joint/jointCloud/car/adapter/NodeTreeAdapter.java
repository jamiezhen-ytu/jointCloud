package com.joint.jointCloud.car.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.joint.jointCloud.R;
import com.joint.jointCloud.home.model.CarNodeBean;

import java.util.LinkedList;
import java.util.List;

import cn.lilingke.commonlibrary.utils.LogPlus;

/**
 * @author :created by lilingke
 * @date :2020/11/21
 * @describe :
 */
public class NodeTreeAdapter extends BaseAdapter {
    //大家经常用ArrayList，但是这里为什么要使用LinkedList
    // ，后面大家会发现因为这个list会随着用户展开、收缩某一项而频繁的进行增加、删除元素操作，
    // 因为ArrayList是数组实现的，频繁的增删性能低下，而LinkedList是链表实现的，对于频繁的增删
    //操作性能要比ArrayList好。
    private LinkedList<CarNodeBean> nodeLinkedList;
    private LayoutInflater inflater;
    private int retract;//缩进值
    private Context context;
    private ListView mListView;

    public NodeTreeAdapter(Context context, ListView listView, LinkedList<CarNodeBean> linkedList) {
        nodeLinkedList = linkedList;
        mListView = listView;
        inflater = LayoutInflater.from(context);
        retract = (int) (context.getResources().getDisplayMetrics().density * 10 + 0.5f);

        mListView.setOnItemClickListener((parent, view, position, id) -> {

        });
    }

    /**
     * 展开或收缩用户点击的条目
     *
     * @param position
     */
    public void expandOrCollapse(int position) {
        CarNodeBean node = nodeLinkedList.get(position);
        if (node != null && !node.isLeaf()) {
            boolean old = node.isExpand;
            if (old) {
                List<CarNodeBean> nodeList = node.get_childrenList();
                int size = nodeList.size();
                CarNodeBean tmp = null;
                for (int i = 0; i < size; i++) {
                    tmp = nodeList.get(i);
                    if (tmp.isExpand) {
                        collapse(tmp, position + 1);
                    }
                    nodeLinkedList.remove(position + 1);
                }
            } else {
                nodeLinkedList.addAll(position + 1, node.FChild);
            }
            node.isExpand = old;
            notifyDataSetChanged();
        }
    }


    /**
     * 递归收缩用户点击的条目
     * 因为此中实现思路是：当用户展开某一条时，就将该条对应的所有子节点加入到nodeLinkedList
     * ，同时控制缩进，当用户收缩某一条时，就将该条所对应的子节点全部删除，而当用户跨级缩进时
     * ，就需要递归缩进其所有的孩子节点，这样才能保持整个nodeLinkedList的正确性，同时这种实
     * 现方式避免了每次对所有数据进行处理然后插入到一个list，最后显示出来，当数据量一大，就会卡顿，
     * 所以这种只改变局部数据的方式性能大大提高。
     */
    private void collapse(CarNodeBean node, int position) {
        node.isExpand = false;
        List<CarNodeBean> nodes = node.get_childrenList();
        int size = nodes.size();
        CarNodeBean tmp = null;
        for (int i = 0; i < size; i++) {
            tmp = nodes.get(i);
            if (tmp.isExpand) {
                collapse(tmp, position + 1);
            }
            nodeLinkedList.remove(position + 1);
        }
    }


    @Override
    public int getCount() {
        return nodeLinkedList.size();
    }

    @Override
    public Object getItem(int position) {
        return nodeLinkedList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        View convertView = view;
        ViewHolder holder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_car_tree, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        CarNodeBean node = nodeLinkedList.get(position);
        holder.label.setText(node.FName);
        if (node.AGUID == null || TextUtils.isEmpty(node.AGUID)) {
            holder.cbLable.setVisibility(View.INVISIBLE);
        } else {
            holder.cbLable.setVisibility(View.VISIBLE);
            holder.cbCheck.setChecked(node.isExpand);
        }
        convertView.setPadding(node.getLevel() * retract, 5, 5, 5);

        holder.label.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogPlus.e("poition == "+ position);
                expandOrCollapse(position);
            }
        });
        return convertView;
    }

    public class ViewHolder {
        public CheckBox cbLable;
        public TextView label;
        public CheckBox cbCheck;
        public ImageView icon;

        public ViewHolder(View view) {
            cbLable = view.findViewById(R.id.zhankai_cb);
            cbCheck = view.findViewById(R.id.quanxuan_cb);
            label = view.findViewById(R.id.fname);
            icon = view.findViewById(R.id.iamge);
        }
    }
}
