package com.tabdemo.designpattern.proxy;

import android.util.Log;

public class RealImage extends Image {

    private final String fileName;

    private static final String TAG = "RealImage";

    public RealImage(String fileName){
       this.fileName = fileName;
        loadImage();
   }

    private void loadImage() {
        Log.d(TAG, "loadImage: "+"Loading   " + fileName);
    }

    @Override
    public void displayImage() {
        Log.d(TAG, "displayImage: "+"Loading   " + fileName);
    }
}
