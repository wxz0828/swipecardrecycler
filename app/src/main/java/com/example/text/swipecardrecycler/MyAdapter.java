package com.example.text.swipecardrecycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.text.swipecardrecycler.swiperecyclerview.SwipeCardAdapter;

import java.util.List;

/**
 * Created by 57VZ on 2017/11/2.
 */

public class MyAdapter extends SwipeCardAdapter<MyAdapter.MyHolder> {
private Context mContext;
    public MyAdapter(Context context,List<String> list) {
        super(list);
        mContext = context;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.layout_item,parent,false);
        MyHolder holder = new MyHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.setData((String) mList.get(position));
    }

    class MyHolder extends RecyclerView.ViewHolder{
        private TextView mTextView;
        public MyHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.textView);
        }
        public void setData(String text){
            mTextView.setText(text);
        }
    }
}
