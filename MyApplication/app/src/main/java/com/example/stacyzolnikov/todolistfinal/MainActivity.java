package com.example.stacyzolnikov.todolistfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    Button mButton;
    StaggeredGridLayoutManager mStaggeredGridLayoutManager;


    ArrayList<CustomObject> customObjectArrayList2;
    ArrayList<CustomObject2> customObjectArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mButton = (Button) findViewById(R.id.button);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(linearLayoutManager);


        ListsSingleton listsSingleton = ListsSingleton.getInstance();


        RecylcerViewAdapter adapter = new RecylcerViewAdapter(listsSingleton.getCustomObjectList());
        mStaggeredGridLayoutManager = new StaggeredGridLayoutManager(3,1);
        mRecyclerView.setLayoutManager(mStaggeredGridLayoutManager);

       mRecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();


        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddListTitle.class);
                startActivity(intent);
            }
        });
    }



    @Override
    protected void onResume() {
        super.onResume();
//        adapter.notifyDataSetChanged();
//This is to refresh, after finishing an activity
    }
}
