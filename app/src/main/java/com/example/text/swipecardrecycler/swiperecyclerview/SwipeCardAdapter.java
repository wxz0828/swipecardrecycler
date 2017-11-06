package com.example.text.swipecardrecycler.swiperecyclerview;

import android.support.v7.widget.RecyclerView;

import java.util.List;

/**
 * Created by 57VZ on 2017/11/2.
 */

public abstract class SwipeCardAdapter <VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH>{

    protected List mList;
    public SwipeCardAdapter(List list){
        mList = list;
    }
    /**
     * 删除最顶部Item
     */

    public void delTopItem() {
        int position = getItemCount() - 1;
        mList.remove(position);
        notifyItemRemoved(position);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
