package com.example.text.swipecardrecycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.text.swipecardrecycler.swiperecyclerview.ItemRemovedListener;
import com.example.text.swipecardrecycler.swiperecyclerview.SwipeCardLayoutManager;
import com.example.text.swipecardrecycler.swiperecyclerview.SwipeCardRecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private SwipeCardRecyclerView mRecyclerView;
    private MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (SwipeCardRecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new SwipeCardLayoutManager());
        final List<String> list = new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add(String.valueOf(i));
        }
        myAdapter = new MyAdapter(this,list);
        mRecyclerView.setAdapter(myAdapter);
        mRecyclerView.setRemovedListener(new ItemRemovedListener() {
            @Override
            public void onRightRemoved() {
                Toast.makeText(MainActivity.this, list.get(list.size() - 1) + " was right removed", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLeftRemoved() {
                Toast.makeText(MainActivity.this, list.get(list.size() - 1) + " was left removed", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
