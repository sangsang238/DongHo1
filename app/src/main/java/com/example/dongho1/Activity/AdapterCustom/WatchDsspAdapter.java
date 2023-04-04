package com.example.dongho1.Activity.AdapterCustom;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.example.dongho1.Activity.Object.ObjectLineDssp;
import com.example.dongho1.Activity.Object.ObjectWatchDssp;
import com.example.dongho1.R;

import java.util.ArrayList;


public class WatchDsspAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private LayoutInflater layoutInflater;
    ArrayList<ObjectWatchDssp> listDssp;
    private ObjectWatchDssp objectWatchDssp;


    public WatchDsspAdapter(Context context, ArrayList<ObjectWatchDssp> listDssp) {
        this.context = context;
        this.listDssp = listDssp;
        layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public WatchDsspAdapter(Context context, int layout, ArrayList<ObjectWatchDssp> listDssp) {
        this.context = context;
        this.layout=layout;
        this.listDssp=listDssp;
    }

    @Override
    public int getCount() {
        return listDssp.size();
    }

    @Override
    public Object getItem(int i) {
        return listDssp.get(i);
    }


    public long getItemId(int i) {
        return listDssp.get(i).getId();
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.item_listview_watch_dssp, null);
        }

        objectWatchDssp = listDssp.get(position);

        ImageView imageView = view.findViewById(R.id.imgWatch_dssp);
        TextView name = view.findViewById(R.id.Name_dssp);
        TextView price = view.findViewById(R.id.Price_dssp);

        imageView.setImageResource(objectWatchDssp.getImgWatch());
        name.setText(objectWatchDssp.getWatchName());
        price.setText('$'+String.valueOf(objectWatchDssp.getPrice()));

        return view;
    }
}
