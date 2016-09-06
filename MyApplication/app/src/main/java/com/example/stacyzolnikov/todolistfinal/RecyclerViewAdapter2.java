package com.example.stacyzolnikov.todolistfinal;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by stacyzolnikov on 7/6/16.
 */
public class RecyclerViewAdapter2 extends RecyclerView.Adapter<CustomViewHolder2> {

    CustomObject customObject;
    CustomObject2 customObject2;
    List<CustomObject> customObjectList2;

    public RecyclerViewAdapter2(List<CustomObject> customObject2){
        customObjectList2 = customObject2;
    }

    public RecyclerViewAdapter2(CustomObject item) {
    customObject= item;
    }


    @Override
    public CustomViewHolder2 onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View parentView = inflater.inflate(R.layout.custom_view2, parent, false);
        CustomViewHolder2 viewHolder2 = new CustomViewHolder2(parentView);
        return viewHolder2;
    }

    @Override
    public void onBindViewHolder(final CustomViewHolder2 holder, final int position) {
        holder.mdescription2.setText(customObject.customObjectList2.get(position).getMdescription2());
        holder.mcheckbox2.setChecked(customObject.customObjectList2.get(position).getMcheckbox2());
        holder.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                customObject.customObjectList2.remove(position);
                notifyItemRemoved(position);
                notifyDataSetChanged();
                return false;
            }
        });

        holder.mcheckbox2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                CustomObject2 currentObject = customObject.customObjectList2.get(position);
                currentObject.setMcheckbox2(!currentObject.getMcheckbox2());

            }
        });


    }

    @Override
    public int getItemCount() {
        if (customObject.customObjectList2 == null) {
            return 0;
        }
        else {
            return customObject.customObjectList2.size();
        }
    }
}
