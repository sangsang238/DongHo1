package com.example.dongho1.Activity.Object;

import androidx.cardview.widget.CardView;

public class ObjectBrandTrangchu {
    private int id;
    String brandName;
    int imgBrand;
    int imgBar;
    CardView cardBrand = null;


    public ObjectBrandTrangchu(){}

    public ObjectBrandTrangchu(int id, String brandName, int imgBrand, int imgBar, CardView cardBrand) {
        this.id = id;
        this.brandName = brandName;
        this.imgBrand = imgBrand;
        this.imgBar = imgBar;
        this.cardBrand = cardBrand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getImgBrand() {
        return imgBrand;
    }

    public void setImgBrand(int imgBrand) {
        this.imgBrand = imgBrand;
    }

    public int getImgBar() {
        return imgBar;
    }

    public void setImgBar(int imgBar) {
        this.imgBar = imgBar;
    }

    public CardView getCardBrand() {
        return cardBrand;
    }

    public void setCardBrand(CardView cardBrand) {
        this.cardBrand = cardBrand;
    }
}

