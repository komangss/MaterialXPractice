package com.example.materialxpractice.Model;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;

public class People{
    public int image;
    public Drawable imageDrw;
    public String name;
    public String email;
    public boolean section = false;

    public People() {
    }

    public People(String name, boolean section) {
        this.name = name;
        this.section = section;
    }
}
