package com.example.dongho1.Activity.Object;

import androidx.cardview.widget.CardView;

public class ObjectWatchDssp {
    private int id;
    String watchName;
    int price;
    int imgWatch;

    public ObjectWatchDssp(){}

    public ObjectWatchDssp(int id, String watchName, int price, int imgWatch) {
        this.id = id;
        this.watchName = watchName;
        this.price = price;
        this.imgWatch = imgWatch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWatchName() {
        return watchName;
    }

    public void setWatchName(String watchName) {
        this.watchName = watchName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getImgWatch() {
        return imgWatch;
    }

    public void setImgWatch(int imgWatch) {
        this.imgWatch = imgWatch;
    }
}
