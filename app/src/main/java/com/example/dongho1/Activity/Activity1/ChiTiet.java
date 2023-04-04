package com.example.dongho1.Activity.Activity1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dongho1.R;

public class ChiTiet extends AppCompatActivity {

    String hang = "Patek Philippines";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet);

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

    }
}