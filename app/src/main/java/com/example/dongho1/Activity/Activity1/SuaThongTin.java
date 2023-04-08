package com.example.dongho1.Activity.Activity1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.dongho1.R;

public class SuaThongTin extends AppCompatActivity {
    CardView nutNext,nutTroVe,nutTrangChu;
    EditText email, password, phone, address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sua_thong_tin);
        AnhXa();
        AddItem();
        nutTroVe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        nutTrangChu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), TrangChu.class);
                v.getContext().startActivity(intent);
            }
        });

    }
    private void AnhXa() {
        nutTroVe = (CardView) findViewById(R.id.btnTurnBack_suathongtin);
        nutTrangChu = (CardView) findViewById(R.id.btnTrangChu);
        email = (EditText) findViewById(R.id.email_suathongtin);
        password = (EditText) findViewById(R.id.password_suathongtin);
        phone = (EditText) findViewById(R.id.phone_suathongtin);
        address = (EditText) findViewById(R.id.address_suathongtin);
        nutNext = (CardView) findViewById(R.id.btnNext_suathongtin);
    }

    private void AddItem() {
        email.setText("dangthanhsang@gmail.com");
        password.setText("sang123456");
        phone.setText("0832131102");
        address.setText("HCM");
    }
}