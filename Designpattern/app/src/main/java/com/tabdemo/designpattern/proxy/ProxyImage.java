package com.tabdemo.designpattern.proxy;

public class ProxyImage extends Image {

    private final String fileName;
    private Image image;

    public  ProxyImage (String fileName){
        this.fileName =fileName;
    }

    @Override
    public void displayImage() {
        if (image==null){
            image = new RealImage(fileName);
        }
       image.displayImage();
    }
}
