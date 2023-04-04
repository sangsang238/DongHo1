package com.example.dongho1.Activity.Activity1;

import android.content.Context;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.dongho1.Activity.AdapterCustom.BrandDsspAdapter;
import com.example.dongho1.Activity.AdapterCustom.LineDsspAdapter;
import com.example.dongho1.Activity.AdapterCustom.WatchDsspAdapter;
import com.example.dongho1.Activity.Object.ObjectBrandDssp;
import com.example.dongho1.Activity.Object.ObjectLineDssp;
import com.example.dongho1.Activity.Object.ObjectWatchDssp;
import com.example.dongho1.R;

import java.util.ArrayList;

public class DanhSachSanPham extends AppCompatActivity {
    CardView nutTroVe,nutGioHang;
    ImageButton nutSearch;
    Context context;
    ListView listviewLine_DSSP, listviewWatch_DSSP;
    HorizontalScrollView horizontalscrollviewBrand_DSSP;

    public static ArrayList<ObjectBrandDssp> arrBrandDSSP;
    ObjectBrandDssp objectBrandDssp;
    BrandDsspAdapter brandDsspAdapter;
    LinearLayout llBrand;

    public static ArrayList<ObjectLineDssp> arrLineDSSP;
    ObjectLineDssp objectLineDssp;
    LineDsspAdapter lineDsspAdapter;

    public static ArrayList<ObjectWatchDssp> arrWatchDSSP;
    ObjectWatchDssp objectWatchDssp;
    WatchDsspAdapter watchDsspAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danh_sach_san_pham);
        context=this;
        AnhXa();
        AddItem();
        System.out.println("day là 1 cái mới trê branch longbao nè nha");

        // Brand Start---------------------------------------------------------------
        LayoutInflater inflater = LayoutInflater.from(this);
        ArrayList<View> views = new ArrayList<>();

        for(int i=0; i<8;i++) {
            views.add(inflater.inflate(R.layout.item_scrollview_brand_dssp, llBrand, false));
            views.get(i).setTag(views.get(i).getId());
            // Ánh xạ view
            ImageView imgBrand = (ImageView) views.get(i).findViewById(R.id.img_brand_dssp);
            TextView slconlai = (TextView) views.get(i).findViewById(R.id.slConLai_brand_dssp);
            CardView cardBrand = (CardView) views.get(i).findViewById(R.id.card_brand_dssp);
            CardView cardslConLai = (CardView) views.get(i).findViewById(R.id.card_slcl_dssp);

            imgBrand.setImageResource(arrBrandDSSP.get(i).getImgBrand());
            slconlai.setText(String.valueOf(arrBrandDSSP.get(i).getSlconlai()));
            cardBrand.setCardBackgroundColor(Color.parseColor("#404040"));
            cardslConLai.setCardBackgroundColor(Color.parseColor("#8F8F8F"));


            llBrand.addView(views.get(i));
            int position=i;
            llBrand.getChildAt(position).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v){
                    for(int i=0; i<8;i++) {
                        views.add(inflater.inflate(R.layout.item_scrollview_brand_dssp, llBrand, false));
                        views.get(i).setTag(views.get(i).getId());
                        CardView cardBrand = (CardView) views.get(i).findViewById(R.id.card_brand_dssp);
                        CardView cardslConLai = (CardView) views.get(i).findViewById(R.id.card_slcl_dssp);
                        cardBrand.setCardBackgroundColor(Color.parseColor("#404040"));
                        cardslConLai.setCardBackgroundColor(Color.parseColor("#8F8F8F"));
                    }
                    Toast.makeText(context, " "+position, Toast.LENGTH_SHORT).show();
                    cardBrand.setCardBackgroundColor(Color.parseColor("#616161"));
                    cardslConLai.setCardBackgroundColor(Color.parseColor("#C09E57"));
                    // thêm code này nọ ở đây.
                }
            });
        }

        // Brand End---------------------------------------------------------------




        lineDsspAdapter = new LineDsspAdapter(this,R.layout.item_listview_line_dssp,arrLineDSSP);
        listviewLine_DSSP.setAdapter(lineDsspAdapter);
        arrLineDSSP.get(0).setImgBar(R.drawable.rectangle_bar);
        listviewLine_DSSP.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                for(int i=0; i<DanhSachSanPham.arrLineDSSP.size();i++)
                {
                    arrLineDSSP.get(i).setImgBar(0);
                }
                arrLineDSSP.get(position).setImgBar(R.drawable.rectangle_bar);
                lineDsspAdapter.notifyDataSetChanged();
                Toast.makeText(DanhSachSanPham.this, "Item: "+DanhSachSanPham.arrLineDSSP.get(position).getId(), Toast.LENGTH_SHORT).show();
            }
        });

        watchDsspAdapter = new WatchDsspAdapter(this,R.layout.item_listview_watch_dssp,arrWatchDSSP);
        listviewWatch_DSSP.setAdapter(watchDsspAdapter);
        listviewWatch_DSSP.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(DanhSachSanPham.this, "Item: "+DanhSachSanPham.arrWatchDSSP.get(position).getWatchName(), Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void AnhXa() {
        nutTroVe = (CardView) findViewById(R.id.btnTurnBackDSSP);
        nutSearch = (ImageButton) findViewById(R.id.searchbtnDSSP);
        nutGioHang = (CardView) findViewById(R.id.btnShopingCart);
        arrLineDSSP = new ArrayList<>();
        listviewLine_DSSP = (ListView) findViewById(R.id.listviewLine_DSSP);
        arrWatchDSSP = new ArrayList<>();
        listviewWatch_DSSP = (ListView) findViewById(R.id.listviewWatch_DSSP);

        arrBrandDSSP = new ArrayList<>();
        horizontalscrollviewBrand_DSSP = (HorizontalScrollView) findViewById(R.id.horizontal_scroll_DSSP);
        llBrand = (LinearLayout) findViewById(R.id.llBrand_DSSP);

    }

    private void AddItem() {
        xuatDSLine();
        xuatDSWatch();
        xuatDSBrand();
    }

    private void xuatDSBrand() {
        //Thêm các object brand ở đây.
        for(int i=0; i<8;i++)
        {
            objectBrandDssp = new ObjectBrandDssp();
            objectBrandDssp.setId(i);
            objectBrandDssp.setImgBrand(R.drawable.ic_patek2);
            objectBrandDssp.setSlconlai(i);
            arrBrandDSSP.add(objectBrandDssp);
        }
    }

    private void xuatDSLine() {
        for(int i=0; i<6;i++)
        {
            objectLineDssp = new ObjectLineDssp();
            objectLineDssp.setId(i);
            objectLineDssp.setLine("Datejust " + i);
            objectLineDssp.setImgBar(0);

            arrLineDSSP.add(objectLineDssp);
        }
    }

    private void xuatDSWatch() {
        for(int i=0; i<6;i++)
        {
            objectWatchDssp = new ObjectWatchDssp();
            objectWatchDssp.setId(i);
            objectWatchDssp.setImgWatch(R.drawable.rolex2);
            objectWatchDssp.setWatchName("Rolex " + i);
            objectWatchDssp.setPrice(i*10000);

            arrWatchDSSP.add(objectWatchDssp);
        }
    }
}