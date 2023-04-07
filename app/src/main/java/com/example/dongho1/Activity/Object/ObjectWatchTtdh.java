package com.example.dongho1.Activity.Object;

import androidx.cardview.widget.CardView;

public class ObjectWatchTtdh {
    private int id;
    int imgWatch;
    String watchName;
    int price;
    String txtTrangThai;

    CardView cardviewCancel = null;
    private boolean ischecked;

    public ObjectWatchTtdh(){}

    public ObjectWatchTtdh(int id, int imgWatch, String watchName, int price, String txtTrangThai, CardView cardviewCancel, boolean ischecked) {
        this.id = id;
        this.imgWatch = imgWatch;
        this.watchName = watchName;
        this.price = price;
        this.txtTrangThai = txtTrangThai;
        this.cardviewCancel = cardviewCancel;
        this.ischecked = ischecked;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImgWatch() {
        return imgWatch;
    }

    public void setImgWatch(int imgWatch) {
        this.imgWatch = imgWatch;
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

    public String getTxtTrangThai() {
        return txtTrangThai;
    }

    public void setTxtTrangThai(String txtTrangThai) {
        this.txtTrangThai = txtTrangThai;
    }

    public CardView getCardviewCancel() {
        return cardviewCancel;
    }

    public void setCardviewCancel(CardView cardviewCancel) {
        this.cardviewCancel = cardviewCancel;
    }

    public boolean isIschecked() {
        return ischecked;
    }

    public void setIschecked(boolean ischecked) {
        this.ischecked = ischecked;
    }
}
