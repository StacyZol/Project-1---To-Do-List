package com.example.stacyzolnikov.todolistfinal;

import android.widget.EditText;

/**
 * Created by stacyzolnikov on 7/6/16.
 */
public class CustomObject2 {
    public String mdescription2;
    public Boolean mcheckbox2;



    public CustomObject2 (String mdescription2, boolean checkbox2) {
        this.mdescription2=mdescription2;
        this.mcheckbox2=checkbox2;
    }

    public String getMdescription2() {
        return mdescription2;
    }

    public void setMdescription2(String mdescription2) {
        this.mdescription2 = mdescription2;
    }

    public Boolean getMcheckbox2() {
        return mcheckbox2;
    }

    public void setMcheckbox2(Boolean mcheckbox2) {
        this.mcheckbox2 = mcheckbox2;
    }
}
