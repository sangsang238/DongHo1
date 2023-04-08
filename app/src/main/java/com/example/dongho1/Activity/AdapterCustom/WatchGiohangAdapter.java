package com.example.dongho1.Activity.AdapterCustom;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;

import com.example.dongho1.Activity.Activity1.GioHang;
import com.example.dongho1.Activity.Activity1.TrangThaiDonHang;
import com.example.dongho1.Activity.Object.ObjectWatchGiohang;
import com.example.dongho1.R;

import java.util.ArrayList;


public class WatchGiohangAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    ArrayList<ObjectWatchGiohang> listGiohang;
    private ObjectWatchGiohang objectWatchGiohang;
    public static ArrayList<Integer> dsLTCduocchon = new ArrayList<Integer>();


    public WatchGiohangAdapter(Context context, ArrayList<ObjectWatchGiohang> listGiohang) {
        this.context = context;
        this.listGiohang= listGiohang;
        layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return listGiohang.size();
    }

    @Override
    public Object getItem(int i) {
        return listGiohang.get(i);
    }


    public long getItemId(int i) {
        return listGiohang.get(i).getId();
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view=layoutInflater.inflate(R.layout.item_listview_giohang,parent,false);
        }

        ImageView imageView = view.findViewById(R.id.imgWatch_giohang);
        TextView name = view.findViewById(R.id.Name_giohang);
        TextView price = view.findViewById(R.id.Price_giohang);
        TextView soluong = view.findViewById(R.id.soluong_giohang);
        CardView cardviewCong = view.findViewById(R.id.btnCong_giohang);
        CardView cardviewTru = view.findViewById(R.id.btnTru_giohang);
        CardView cardviewClose = view.findViewById(R.id.btnClose_giohang);
        CardView cardview = view.findViewById(R.id.Cardview_giohang);

        objectWatchGiohang = listGiohang.get(position);
        imageView.setImageResource(objectWatchGiohang.getImgWatch());
        name.setText(objectWatchGiohang.getWatchName());
        price.setText('$'+String.valueOf(objectWatchGiohang.getPrice()));
        soluong.setText(String.valueOf(objectWatchGiohang.getSoluong()));
        //cardviewCancel.setTag(position);

        cardviewCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    int curSL = listGiohang.get(position).getSoluong();
                    curSL++;
                    listGiohang.get(position).setSoluong(curSL);
                    notifyDataSetChanged();
                    GioHang.updatePrice();
            }
        });
        cardviewTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (listGiohang.get(position).getSoluong()!=0) {
                    int curSL = listGiohang.get(position).getSoluong();
                    curSL--;
                    listGiohang.get(position).setSoluong(curSL);
                    notifyDataSetChanged();
                    GioHang.updatePrice();
                }
            }
        });
        cardviewClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GioHang.arrWatchGiohang.remove(position);
                notifyDataSetChanged();
                GioHang.updatePrice();
            }
        });



        return view;
    }


}
