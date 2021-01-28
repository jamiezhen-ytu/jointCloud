package cn.lilingke.commonlibrary.utils.rv_tool;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import cn.lilingke.commonlibrary.utils.LogPlus;

/**
 * Created by John on 2017/11/12.
 */

public class EmptyRecyclerView extends RecyclerView.AdapterDataObserver {

    private RecyclerView.Adapter mAdapter;
    private RecyclerView mRecyclerView;
    private View mEmptyView;

    private EmptyRecyclerView(RecyclerView recyclerView, View emptyView) {
        mRecyclerView = recyclerView;
        mEmptyView = emptyView;
    }

    public void setAdapter(RecyclerView.Adapter adapter) {

        if (mAdapter != null) {
            mAdapter.unregisterAdapterDataObserver(this);
        }
        mAdapter = adapter;
        mAdapter.registerAdapterDataObserver(this);
        checkIfEmpty();
    }

    public void setEmptyView(View emptyView) {
        mEmptyView = emptyView;
        checkIfEmpty();
    }

    /**
     * @param recyclerView
     * @param emptyView
     * @return
     */
    public static EmptyRecyclerView bind(@NonNull RecyclerView recyclerView,
        @Nullable View emptyView) {
        EmptyRecyclerView emptyRecyclerView = new EmptyRecyclerView(recyclerView, emptyView);
        emptyRecyclerView.setAdapter(recyclerView.getAdapter());
        return emptyRecyclerView;
    }

    @Override
    public void onChanged() {
        checkIfEmpty();
    }

    @Override
    public void onItemRangeInserted(int positionStart, int itemCount) {
        checkIfEmpty();
    }

    @Override
    public void onItemRangeRemoved(int positionStart, int itemCount) {
        checkIfEmpty();
    }

    private void checkIfEmpty() {
        LogPlus.e("有到这里吗");
        if (mEmptyView != null && mAdapter != null) {

            boolean hideEmpty = mAdapter.getItemCount() > 0;
            LogPlus.e("hideEmpty == "+hideEmpty);
            mEmptyView.setVisibility(hideEmpty ? View.GONE : View.VISIBLE);
            mRecyclerView.setVisibility(hideEmpty ? View.VISIBLE : View.GONE);
        }
    }
}
