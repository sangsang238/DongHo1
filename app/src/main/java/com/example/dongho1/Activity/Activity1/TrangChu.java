package com.example.dongho1.Activity.Activity1;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.dongho1.Activity.AdapterCustom.WatchDsspAdapter;
import com.example.dongho1.Activity.Object.ObjectBrandDssp;
import com.example.dongho1.Activity.Object.ObjectBrandTrangchu;
import com.example.dongho1.Activity.Object.ObjectWatchDssp;
import com.example.dongho1.R;

import java.util.ArrayList;

public class TrangChu extends AppCompatActivity {
    CardView cardBanner, nutCart;
    TextView txtseemore;
    public static String tokenUser="";
    Context context;

    public static ArrayList<ObjectBrandTrangchu> arrBrandTrangchu;
    ObjectBrandTrangchu objectBrandTrangchu;
    LinearLayout llBrand;

    public static ArrayList<ObjectWatchDssp> arrWatchTrangchu;
    ObjectWatchDssp objectWatchTrangchu;
    LinearLayout llWatch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_chu);
        //Toast.makeText(this, DangNhap.tokenUser, Toast.LENGTH_SHORT).show();
        context=this;
        AnhXa();
        AddItem();

        // Header Start---------------------------------------------------------------
        nutCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), GioHang.class);
                v.getContext().startActivity(intent);
            }
        });
        // Header End---------------------------------------------------------------

        cardBanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DanhSachSanPham.class);
                v.getContext().startActivity(intent);
            }
        });


        // Brand Start---------------------------------------------------------------
        LayoutInflater inflater = LayoutInflater.from(this);
        ArrayList<View> views = new ArrayList<>();

        for(int i=0; i<8;i++) {
            views.add(inflater.inflate(R.layout.item_scrollview_brand_trangchu, llBrand, false));
            views.get(i).setTag(views.get(i).getId());
            // Ánh xạ view
            ImageView imgBrand = (ImageView) views.get(i).findViewById(R.id.ic_item_trangchu);
            TextView brandName = (TextView) views.get(i).findViewById(R.id.txt_item_trangchu);
            CardView cardBrand = (CardView) views.get(i).findViewById(R.id.cardview_item_trangchu);
            ImageView imgBar = (ImageView) views.get(i).findViewById(R.id.choose_item_trangchu);
            // Add items
            imgBrand.setImageResource(arrBrandTrangchu.get(i).getImgBrand());
            brandName.setText(arrBrandTrangchu.get(i).getBrandName());
            //cardBrand.setCardBackgroundColor(Color.parseColor("#404040"));
            imgBar.setImageResource(0);


            llBrand.addView(views.get(i));
            int position=i;
            llBrand.getChildAt(position).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v){
                    for(int i=0; i<8;i++) {
                        views.add(inflater.inflate(R.layout.item_scrollview_brand_trangchu, llBrand, false));
                        views.get(i).setTag(views.get(i).getId());
                        ImageView imgBar = (ImageView) views.get(i).findViewById(R.id.choose_item_trangchu);
                        CardView cardBrand = (CardView) views.get(i).findViewById(R.id.cardview_item_trangchu);
                        imgBar.setImageResource(0);
                        cardBrand.setCardBackgroundColor(Color.parseColor("#404040"));
                    }

                    Toast.makeText(context, brandName.getText(), Toast.LENGTH_SHORT).show();
                    imgBar.setImageResource(R.drawable.rectangle_bar);
                    cardBrand.setCardBackgroundColor(Color.parseColor("#616161"));
                    // thêm code này nọ ở đây.
                }
            });
        }

        // Brand End---------------------------------------------------------------


        // Watch Start---------------------------------------------------------------
        LayoutInflater inflater2 = LayoutInflater.from(this);
        ArrayList<View> views2 = new ArrayList<>();

        for(int i=0; i<8;i++) {
            views2.add(inflater2.inflate(R.layout.item_listview_watch_dssp, llWatch, false));
            views2.get(i).setTag(views2.get(i).getId());
            // Ánh xạ view
            ImageView imgWatch = (ImageView) views2.get(i).findViewById(R.id.imgWatch_dssp);
            TextView watchName = (TextView) views2.get(i).findViewById(R.id.Name_dssp);
            TextView price = (TextView) views2.get(i).findViewById(R.id.Price_dssp);

            // Add items
            imgWatch.setImageResource(arrWatchTrangchu.get(i).getImgWatch());
            watchName.setText(arrWatchTrangchu.get(i).getWatchName());
            price.setText(arrWatchTrangchu.get(i).getPrice()+"");

            llWatch.addView(views2.get(i));
            int position=i;
            llWatch.getChildAt(position).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v){
                    Toast.makeText(context, watchName.getText(), Toast.LENGTH_SHORT).show();
                    // thêm code này nọ ở đây.
                }
            });
        }
        // Watch End---------------------------------------------------------------


        txtseemore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DanhSachSanPham.class);
                v.getContext().startActivity(intent);
            }
        });
    }

    private void AnhXa() {
        nutCart = (CardView) findViewById(R.id.btnCart);
        cardBanner = (CardView) findViewById(R.id.CardviewBanner_trangchu);
        txtseemore = (TextView) findViewById(R.id.txtSeemore_trangchu);
        arrBrandTrangchu = new ArrayList<>();
        llBrand = (LinearLayout) findViewById(R.id.llBrand_Trangchu);
        arrWatchTrangchu = new ArrayList<>();
        llWatch = (LinearLayout) findViewById(R.id.llWatch_Trangchu);

    }

    private void AddItem() {
        xuatDSBrand();
        xuatDSWatch();
    }

    private void xuatDSBrand() {
        //Thêm các object brand ở đây.
        objectBrandTrangchu = new ObjectBrandTrangchu();
        objectBrandTrangchu.setId(0);
        objectBrandTrangchu.setImgBrand(R.drawable.ic_rolex2);
        objectBrandTrangchu.setBrandName("Rolex: "+0);
        arrBrandTrangchu.add(objectBrandTrangchu);

        objectBrandTrangchu = new ObjectBrandTrangchu();
        objectBrandTrangchu.setId(1);
        objectBrandTrangchu.setImgBrand(R.drawable.ic_hublot);
        objectBrandTrangchu.setBrandName("Hublot: "+1);
        arrBrandTrangchu.add(objectBrandTrangchu);

        for(int i=2; i<8;i++)
        {
            objectBrandTrangchu = new ObjectBrandTrangchu();
            objectBrandTrangchu.setId(i);
            objectBrandTrangchu.setImgBrand(R.drawable.ic_patek2);
            objectBrandTrangchu.setBrandName("Patek Phillipines: "+i);
            arrBrandTrangchu.add(objectBrandTrangchu);
        }
    }

    private void xuatDSWatch() {
        for(int i=0; i<8;i++)
        {
            objectWatchTrangchu = new ObjectWatchDssp();
            objectWatchTrangchu.setId(i);
            objectWatchTrangchu.setImgWatch(R.drawable.rolex2);
            objectWatchTrangchu.setWatchName("Rolex " + i);
            objectWatchTrangchu.setPrice(i*10000);

            arrWatchTrangchu.add(objectWatchTrangchu);
        }
    }

}