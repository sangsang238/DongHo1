package com.example.dongho1.Activity.AdapterCustom;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

import com.example.dongho1.Activity.Object.ObjectLineDssp;
import com.example.dongho1.R;

import java.util.ArrayList;


public class LineDsspAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    public static LayoutInflater layoutInflater;
    ArrayList<ObjectLineDssp> listDssp;
    private ObjectLineDssp objectLineDssp;


    public LineDsspAdapter(Context context, ArrayList<ObjectLineDssp> listDssp) {
        this.context = context;
        this.listDssp = listDssp;
        layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public LineDsspAdapter(Context context,int layout, ArrayList<ObjectLineDssp> listDssp) {
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


//    @Override
//    public View getView(int i, View view, ViewGroup parent) {
//
//        View rowView=view;
//        if (rowView==null) {
//            rowView=layoutInflater.inflate(R.layout.item_listview_line_dssp,parent,false);
//        }
//
//        // Ánh xạ view
//        TextView line = (TextView) rowView.findViewById(R.id.textviewLineDssp);
//        ImageView imgBar = (ImageView) rowView.findViewById(R.id.ImgBarLineDssp);
//
//
//        // Gán giá trị
//        objectLineDssp =listDssp.get(i);
//        line.setText(objectLineDssp.getLine());
//        imgBar.setVisibility(View.VISIBLE);
//
//
//        return rowView;
//    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.item_listview_line_dssp, null);
        }

        objectLineDssp = listDssp.get(position);

        ImageView imageView = view.findViewById(R.id.ImgBarLineDssp);
        TextView textView = view.findViewById(R.id.textviewLineDssp);

        imageView.setImageResource(objectLineDssp.getImgBar());
        textView.setText(objectLineDssp.getLine());

        return view;
    }
}
