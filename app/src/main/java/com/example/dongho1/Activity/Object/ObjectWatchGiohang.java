package com.example.dongho1.Activity.Object;

import androidx.cardview.widget.CardView;

public class ObjectWatchGiohang {
    private int id;
    int imgWatch;
    String watchName;
    int price;
    int soluong;
    CardView cardview = null;
    CardView cardviewCong = null;
    CardView cardviewTru = null;
    CardView cardviewClose = null;



    public ObjectWatchGiohang(){}

    public ObjectWatchGiohang(int id, int imgWatch, String watchName, int price, int soluong, CardView cardview, CardView cardviewCong, CardView cardviewTru, CardView cardviewClose) {
        this.id = id;
        this.imgWatch = imgWatch;
        this.watchName = watchName;
        this.price = price;
        this.soluong = soluong;
        this.cardview = cardview;
        this.cardviewCong = cardviewCong;
        this.cardviewTru = cardviewTru;
        this.cardviewClose = cardviewClose;
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

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public CardView getCardview() {
        return cardview;
    }

    public void setCardview(CardView cardview) {
        this.cardview = cardview;
    }

    public CardView getCardviewCong() {
        return cardviewCong;
    }

    public void setCardviewCong(CardView cardviewCong) {
        this.cardviewCong = cardviewCong;
    }

    public CardView getCardviewTru() {
        return cardviewTru;
    }

    public void setCardviewTru(CardView cardviewTru) {
        this.cardviewTru = cardviewTru;
    }

    public CardView getCardviewClose() {
        return cardviewClose;
    }

    public void setCardviewClose(CardView cardviewClose) {
        this.cardviewClose = cardviewClose;
    }
}
