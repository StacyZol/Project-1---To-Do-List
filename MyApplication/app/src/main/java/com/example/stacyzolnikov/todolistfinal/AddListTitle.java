package com.example.stacyzolnikov.todolistfinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by stacyzolnikov on 7/6/16.
 */
public class AddListTitle extends AppCompatActivity {
    Button mButton;
    EditText mAddTitle;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_list_title);

        final ListsSingleton listsSingleton = ListsSingleton.getInstance();

        mAddTitle = (EditText)findViewById(R.id.listtitle);


        mButton = (Button)findViewById(R.id.buttontitle);
        mButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                if(mAddTitle.length()==0){
                    mAddTitle.setError("Your list needs a title");
                }
                else if (mAddTitle.length()>0){
                    listsSingleton.addcustomObject(new CustomObject(mAddTitle.getText().toString(), false));
//                Log.d("test", mAddTitle.getText().toString());
                    Intent intent = new Intent(AddListTitle.this, SecondActivity.class);
                    intent.putExtra("position", listsSingleton.getCustomObjectList().size()-1);
                    startActivity(intent);
                }
            }
        });


    }
}
