package com.example.dongho1.Activity.Object;

import android.widget.ImageView;

public class ObjectLineDssp {
    private int id;
    String line;
    int imgBar;

    public ObjectLineDssp() {

    }
    public ObjectLineDssp(int id, String line, int imgBar) {
        this.id = id;
        this.line = line;
        this.imgBar = imgBar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public int getImgBar() {
        return imgBar;
    }

    public void setImgBar(int imgBar) {
        this.imgBar = imgBar;
    }
}
