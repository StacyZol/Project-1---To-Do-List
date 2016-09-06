package com.example.stacyzolnikov.todolistfinal;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by stacyzolnikov on 7/6/16.
 */
public class CustomViewHolder extends RecyclerView.ViewHolder {
    public TextView mTitle;
    public TextView mtextView1;
    public CheckBox mcheckBox;
    public LinearLayout mcard1;

    public CustomViewHolder(View itemView) {
        super(itemView);

       // mTitle= (TextView) itemView.findViewById(R.id.listTitle);
        mtextView1 = (TextView) itemView.findViewById(R.id.listTitle);
        mcheckBox = (CheckBox) itemView.findViewById(R.id.checkbox);
       // mcard1 = (LinearLayout) itemView.findViewById(R.id.card1);



    }
   public void setOnClickListener(View.OnClickListener onClickListener) {
       itemView.setOnClickListener(onClickListener);
   }


    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        itemView.setOnLongClickListener(onLongClickListener);
    }
}
