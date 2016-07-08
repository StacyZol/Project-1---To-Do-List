package com.example.stacyzolnikov.todolistfinal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by stacyzolnikov on 7/6/16.
 */
public class SecondActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    Button button;
    EditText maddTask;

    Button mainbutton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        maddTask = (EditText) findViewById(R.id.newtasktext);

        final ListsSingleton listsSingleton = ListsSingleton.getInstance();

        int x = getIntent().getExtras().getInt("position");
        final CustomObject item = listsSingleton.getCustomObjectList().get(x);


        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(linearLayoutManager);

        final RecyclerViewAdapter2 adapter = new RecyclerViewAdapter2(item);
        mRecyclerView.setAdapter(adapter);
       // RecyclerViewAdapter2 adapter = new RecyclerViewAdapter2(listsSingleton.getCustomObjectList2());
       // mRecyclerView.setAdapter(adapter);
       // adapter.notifyDataSetChanged();


        button = (Button) findViewById(R.id.taskbutton);
        mainbutton = (Button) findViewById(R.id.mainbutton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // item.addtasks(new CustomObject2(maddTask.getText().toString(), true));
                //maddTask.setText(null);
                //Intent intent = new Intent(SecondActivity.this, SecondActivity.class);
                // startActivity(intent);
                if (maddTask.length() == 0) {
                    maddTask.setError("Incorrect input");
                }
                else if(maddTask.length()>0) {
                    item.addtasks(new CustomObject2(maddTask.getText().toString(), true));
                    maddTask.setText(null);
                    adapter.notifyDataSetChanged();
                   // InputMethodManager imm = (InputMethodManager) getSystemService (Context.INPUT_METHOD_SERVICE);
                    //imm.hideSoftInputFromInputMethod(maddTask.getWindowToken(),0);

                }

            }
        });

        mainbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                intent.putExtra("list", maddTask.getText().toString());
                startActivity(intent);

                setResult(RESULT_OK, intent);{

                }
                SecondActivity.this.finish();
            }

        });

    }
}
