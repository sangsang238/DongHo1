package com.example.dongho1.Activity.Activity1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.dongho1.Activity.AdapterCustom.WatchDsspAdapter;
import com.example.dongho1.Activity.AdapterCustom.WatchTtdhAdapter;
import com.example.dongho1.Activity.Object.ObjectWatchDssp;
import com.example.dongho1.Activity.Object.ObjectWatchTtdh;
import com.example.dongho1.R;

import java.util.ArrayList;

public class TrangThaiDonHang extends AppCompatActivity {
    CardView nutTroVe,nutTrangChu,nutCart;
    ImageButton nutSetting;
    Context context;
    ListView listviewWatch_TTDH;
    public static ArrayList<ObjectWatchTtdh> arrWatchTtdh;
    ObjectWatchTtdh objectWatchTtdh;
    WatchTtdhAdapter watchTtdhAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_thai_don_hang);
        AnhXa();
        AddItem();
        context=this;

        // Header Start---------------------------------------------------------------
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
        nutSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SuaThongTin.class);
                v.getContext().startActivity(intent);
            }
        });
        nutCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), GioHang.class);
                v.getContext().startActivity(intent);
            }
        });
        // Header End---------------------------------------------------------------

        // Watch Start---------------------------------------------------------------
        watchTtdhAdapter = new WatchTtdhAdapter(context,arrWatchTtdh);
        listviewWatch_TTDH.setAdapter(watchTtdhAdapter);
        listviewWatch_TTDH.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Toast.makeText(TrangThaiDonHang.this, "Item: "+TrangThaiDonHang.arrWatchTtdh.get(position).getWatchName(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(v.getContext(), ChiTiet.class);
                v.getContext().startActivity(intent);
            }
        });
        // Watch End---------------------------------------------------------------

    }
    private void AnhXa() {
        nutTroVe = (CardView) findViewById(R.id.btnTurnBackTrangThai);
        nutTrangChu = (CardView) findViewById(R.id.btnTrangChu);
        nutSetting = (ImageButton) findViewById(R.id.btnSettingTrangThai);
        nutCart = (CardView) findViewById(R.id.btnCart);
        arrWatchTtdh = new ArrayList<>();
        listviewWatch_TTDH = (ListView) findViewById(R.id.listviewTrangThaiDonHang);
    }

    private void AddItem() {
        xuatDSWatch();
    }
    private void xuatDSWatch() {
        for(int i=0; i<6;i++)
        {
            objectWatchTtdh = new ObjectWatchTtdh();
            objectWatchTtdh.setId(i);
            objectWatchTtdh.setImgWatch(R.drawable.rolex2);
            objectWatchTtdh.setWatchName("Rolex " + i);
            objectWatchTtdh.setPrice(i*10000);
            objectWatchTtdh.setTxtTrangThai("Waiting For Progressing");

            arrWatchTtdh.add(objectWatchTtdh);
        }
        objectWatchTtdh = new ObjectWatchTtdh();
        objectWatchTtdh.setId(6);
        objectWatchTtdh.setImgWatch(R.drawable.rolex1);
        objectWatchTtdh.setWatchName("Rolex " + 6);
        objectWatchTtdh.setPrice(6*10000);
        objectWatchTtdh.setTxtTrangThai("Completed");

        arrWatchTtdh.add(objectWatchTtdh);

        objectWatchTtdh = new ObjectWatchTtdh();
        objectWatchTtdh.setId(7);
        objectWatchTtdh.setImgWatch(R.drawable.rolex1);
        objectWatchTtdh.setWatchName("Rolex " + 7);
        objectWatchTtdh.setPrice(7*10000);
        objectWatchTtdh.setTxtTrangThai("Waiting For Purchase");

        arrWatchTtdh.add(objectWatchTtdh);

    }
}