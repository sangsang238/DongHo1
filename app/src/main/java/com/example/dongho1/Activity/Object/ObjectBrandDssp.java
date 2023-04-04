package com.example.dongho1.Activity.Object;

import androidx.cardview.widget.CardView;

public class ObjectBrandDssp {
    private int id;
    int slconlai;
    int imgBrand;
    CardView cardBrand = null;
    CardView cardslConLai = null;

    public ObjectBrandDssp(){}

    public ObjectBrandDssp(int id, int slconlai, int imgBrand, CardView cardBrand, CardView cardslConLai) {
        this.id = id;
        this.slconlai = slconlai;
        this.imgBrand = imgBrand;
        this.cardBrand = cardBrand;
        this.cardslConLai = cardslConLai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSlconlai() {
        return slconlai;
    }

    public void setSlconlai(int slconlai) {
        this.slconlai = slconlai;
    }

    public int getImgBrand() {
        return imgBrand;
    }

    public void setImgBrand(int imgBrand) {
        this.imgBrand = imgBrand;
    }

    public CardView getCardBrand() {
        return cardBrand;
    }

    public void setCardBrand(CardView cardBrand) {
        this.cardBrand = cardBrand;
    }

    public CardView getCardslConLai() {
        return cardslConLai;
    }

    public void setCardslConLai(CardView cardslConLai) {
        this.cardslConLai = cardslConLai;
    }
}
