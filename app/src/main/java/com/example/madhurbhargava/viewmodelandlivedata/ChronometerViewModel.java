package com.example.madhurbhargava.viewmodelandlivedata;

import android.arch.lifecycle.ViewModel;

public class ChronometerViewModel extends ViewModel {
    public Long getmStartTime() {
        return mStartTime;
    }

    public void setmStartTime(Long mStartTime) {
        this.mStartTime = mStartTime;
    }

    private Long mStartTime;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private String text;


}
