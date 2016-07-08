package com.example.stacyzolnikov.todolistfinal;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by stacyzolnikov on 7/6/16.
 */
public class CustomViewHolder2 extends RecyclerView.ViewHolder{
    public TextView mdescription2;
    public CheckBox mcheckbox2;
    public LinearLayout mcard2;

    public CustomViewHolder2(View itemView) {
        super(itemView);

        mdescription2 = (TextView) itemView.findViewById(R.id.description2);
        mcheckbox2 = (CheckBox) itemView.findViewById(R.id.checkbox2);
        mcard2 = (LinearLayout) itemView.findViewById(R.id.card2);
    }
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        itemView.setOnLongClickListener(onLongClickListener);
    }
}
