package com.example.stacyzolnikov.todolistfinal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by stacyzolnikov on 7/6/16.
 */
public class ListsSingleton {

    List<CustomObject> customObjectList;
    List<CustomObject2> customObjectList2;


    private ListsSingleton() {
        if (customObjectList == null) {
            customObjectList = new ArrayList<>();
        }
      //  if (customObjectList2 == null) {
        //    customObjectList2 = new ArrayList<>();
      //  }

    }


    public static ListsSingleton listsSingleton;

    public static ListsSingleton getInstance() {
        if (listsSingleton == null) {
            listsSingleton = new ListsSingleton();
        }
        return listsSingleton;
    }

    public List<CustomObject> getCustomObjectList() {
        return customObjectList;
    }
    public List<CustomObject2> getCustomObjectList2() { return customObjectList2;}

    public void setCustomObjectList(List<CustomObject> customObjectList) {
        this.customObjectList = customObjectList;
    }

    public void setCustomObjectList2(List<CustomObject> customObjectList) {
        this.customObjectList2 = customObjectList2;
    }

    public void addcustomObject(CustomObject object) {
        customObjectList.add(object);
    }

    public void addcustomObject2 (CustomObject2 object2) {
        customObjectList2.add(object2);
    }

}
