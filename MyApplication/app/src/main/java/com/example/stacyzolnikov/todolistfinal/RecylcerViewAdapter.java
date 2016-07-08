package com.example.stacyzolnikov.todolistfinal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.content.Intent.getIntent;

/**
 * Created by stacyzolnikov on 7/6/16.
 */
public class RecylcerViewAdapter extends RecyclerView.Adapter<CustomViewHolder> {
    List<CustomObject> customObjectList1;

    public RecylcerViewAdapter(List<CustomObject> customObjectList) {
        customObjectList1 = customObjectList;
    }


    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
         View parentView = inflater.inflate(R.layout.custom_view, parent, false);
        CustomViewHolder viewHolder = new CustomViewHolder(parentView);
        return viewHolder;


    }

    @Override
    public void onBindViewHolder(final CustomViewHolder holder, final int position) {
        holder.mtextView1.setText(customObjectList1.get(position).getTextView1());
       holder.mcheckBox.setChecked(customObjectList1.get(position).getCheckBox());


        holder.mcheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomObject currentObject = customObjectList1.get(position);
                currentObject.setCheckBox(!currentObject.getCheckBox());


            }
        });
        //holder.mcheckBox.setChecked(customObjectList1.get(position).getCheckBox());

        holder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), SecondActivity.class);
                intent.putExtra("position", position);
                view.getContext().startActivity(intent);
            }
        });
        holder.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                customObjectList1.remove(position);
              //  notifyItemRemoved(position);
                notifyDataSetChanged();
                return false;
            }
        });

    }
        @Override
        public int getItemCount () {
            if (customObjectList1 == null) {
                return 0;
            } else {
                return customObjectList1.size();
            }

    }
}
