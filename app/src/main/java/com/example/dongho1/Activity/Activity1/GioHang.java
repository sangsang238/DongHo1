package com.example.dongho1.Activity.Activity1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.dongho1.Activity.AdapterCustom.WatchGiohangAdapter;
import com.example.dongho1.Activity.AdapterCustom.WatchTtdhAdapter;
import com.example.dongho1.Activity.Object.ObjectWatchGiohang;
import com.example.dongho1.Activity.Object.ObjectWatchTtdh;
import com.example.dongho1.R;

import java.util.ArrayList;

public class GioHang extends AppCompatActivity {
    CardView nutTroVe, nutCheckout;
    Context context;
    ListView listviewWatch_Giohang;
    public static ArrayList<ObjectWatchGiohang> arrWatchGiohang;
    ObjectWatchGiohang objectWatchGiohang;
    WatchGiohangAdapter watchGiohangAdapter;

    public static TextView sumPrice,taxPrice,totalPrice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gio_hang);
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
        nutCheckout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), TrangThaiDonHang.class);
                v.getContext().startActivity(intent);
            }
        });
        // Header End---------------------------------------------------------------

        // Watch Start---------------------------------------------------------------
        watchGiohangAdapter = new WatchGiohangAdapter(context,arrWatchGiohang);
        listviewWatch_Giohang.setAdapter(watchGiohangAdapter);
        listviewWatch_Giohang.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Toast.makeText(GioHang.this, "Item: "+GioHang.arrWatchGiohang.get(position).getWatchName(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(v.getContext(), ChiTiet.class);
                v.getContext().startActivity(intent);
            }
        });
        // Watch End---------------------------------------------------------------

        // Price Start---------------------------------------------------------------
        updatePrice();
        // Price End---------------------------------------------------------------


    }
    private void AnhXa() {
        nutTroVe = (CardView) findViewById(R.id.btnTurnBack_giohang);
        nutCheckout = (CardView) findViewById(R.id.btnCheckout_giohang);
        arrWatchGiohang = new ArrayList<>();
        listviewWatch_Giohang = (ListView) findViewById(R.id.listviewGiohang);
        sumPrice = (TextView) findViewById(R.id.sumPrice_Giohang);
        taxPrice = (TextView) findViewById(R.id.taxPrice_Giohang);
        totalPrice = (TextView) findViewById(R.id.totalPrice_Giohang);
    }

    private void AddItem() {
        xuatDSWatch();

    }
    private void xuatDSWatch() {
        for(int i=0; i<6;i++)
        {
            objectWatchGiohang = new ObjectWatchGiohang();
            objectWatchGiohang.setId(i);
            objectWatchGiohang.setImgWatch(R.drawable.rolex2);
            objectWatchGiohang.setWatchName("Rolex " + i);
            objectWatchGiohang.setPrice(i*10000);
            objectWatchGiohang.setSoluong(i);

            arrWatchGiohang.add(objectWatchGiohang);
        }
    }

    public static void updatePrice(){
        int sum=0;
        for (int i=0; i<arrWatchGiohang.size(); i++)
            sum=sum+(arrWatchGiohang.get(i).getPrice()*arrWatchGiohang.get(i).getSoluong());
        sumPrice.setText("$"+sum);
        taxPrice.setText("$"+((float)(sum/100)));
        totalPrice.setText("$"+(sum+((float)(sum/100))));
    }
}