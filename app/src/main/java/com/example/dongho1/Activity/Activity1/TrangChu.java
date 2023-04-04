package com.example.dongho1.Activity.Activity1;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dongho1.R;

public class TrangChu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_chu);
        Toast.makeText(this, DangNhap.tokenUser, Toast.LENGTH_SHORT).show();
    }
}