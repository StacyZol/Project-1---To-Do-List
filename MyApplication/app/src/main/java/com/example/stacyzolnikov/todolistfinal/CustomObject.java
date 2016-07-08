package com.example.stacyzolnikov.todolistfinal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by stacyzolnikov on 7/6/16.
 */
public class CustomObject {
   // public String greenBox;
    public String textView1;
    public Boolean checkBox;
    List<CustomObject2> customObjectList2 =  new ArrayList<>();

    public void addtasks (CustomObject2 tasks) {
        customObjectList2.add(tasks);
    }


    public CustomObject (String textView1, boolean checkBox) {
       // this.greenBox=greenBox;
        this.textView1=textView1;
        this.checkBox=checkBox;

    }

    public CustomObject (String textView1) {
        this.textView1=textView1;
    }

   // public String getGreenBox() {
    //    return greenBox;
   // }

   // public void setGreenBox(String greenBox) {
     //   this.greenBox = greenBox;
   // }

    public String getTextView1() {
        return textView1;
    }

    public void setTextView1(String textView1) {
        this.textView1 = textView1;
    }


    public Boolean getCheckBox() {
        return checkBox;
    }

    public void setCheckBox(Boolean checkBox) {
        this.checkBox = checkBox;
    }
}
