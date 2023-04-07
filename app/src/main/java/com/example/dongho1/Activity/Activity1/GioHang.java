package com.example.dongho1.Activity.Activity1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.dongho1.R;

public class GioHang extends AppCompatActivity {
    CardView nutTroVe, nutCheckout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gio_hang);
        AnhXa();
        AddItem();
        nutTroVe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        nutCheckout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), TrangThaiDonHang.class);
                v.getContext().startActivity(intent);
            }
        });
    }
    private void AnhXa() {
        nutTroVe = (CardView) findViewById(R.id.btnTurnBack_giohang);
        nutCheckout = (CardView) findViewById(R.id.btnCheckout_giohang);
    }

    private void AddItem() {

    }
}