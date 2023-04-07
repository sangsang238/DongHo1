package com.example.dongho1.Activity.Activity1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.dongho1.R;

public class ChiTiet extends AppCompatActivity {
    CardView nutTrangChu;
    String hang = "Patek Philippines";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet);
        AnhXa();
        AddItem();

        TextView tvhang= (TextView) findViewById(R.id.tv_hang);
        TextView tvhangngang= findViewById(R.id.tv_hang_chu_ngang);
        if(hang.length() > 7){
            tvhang.setTextSize(15);
            tvhangngang.setTextSize(40);
            tvhang.setText(hang);
            tvhangngang.setText(hang);
        }
        else {
            tvhang.setText(hang);
            tvhangngang.setText(hang);
        }




        nutTrangChu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), TrangChu.class);
                v.getContext().startActivity(intent);
            }
        });

    }
    private void AnhXa() {
        nutTrangChu = (CardView) findViewById(R.id.btnTrangChu);
    }

    private void AddItem() {

    }
}