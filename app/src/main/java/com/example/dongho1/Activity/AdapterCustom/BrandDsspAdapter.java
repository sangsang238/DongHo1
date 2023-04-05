//package com.example.dongho1.Activity.AdapterCustom;
//
//import android.content.Context;
//import android.content.DialogInterface;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//import android.widget.CheckBox;
//import android.widget.HorizontalScrollView;
//import android.widget.ImageView;
//import android.widget.LinearLayout;
//import android.widget.TextView;
//
//import androidx.appcompat.app.AlertDialog;
//import androidx.cardview.widget.CardView;
//
//import com.example.dongho1.Activity.Object.ObjectBrandDssp;
//import com.example.dongho1.Activity.Object.ObjectLineDssp;
//import com.example.dongho1.Activity.Object.ObjectWatchDssp;
//import com.example.dongho1.R;
//
//import java.util.ArrayList;
//
//public class BrandDsspAdapter extends BaseAdapter {
//
//    private Context context;
//    private LayoutInflater layoutInflater;
//    ArrayList<ObjectBrandDssp> listDssp;
//    private ObjectBrandDssp objectBrandDssp;
//
//
//
//    public BrandDsspAdapter(Context context, ArrayList<ObjectBrandDssp> listDssp) {
//        this.context = context;
//        this.listDssp = listDssp;
//        layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//    }
//
//    @Override
//    public int getCount() {
//        return listDssp.size();
//    }
//
//    @Override
//    public Object getItem(int i) {
//        return listDssp.get(i);
//    }
//
//
//    public long getItemId(int i) {
//        return listDssp.get(i).getId();
//    }
//
//
//    @Override
//    public View getView(int i, View view, ViewGroup parent) {
//
//        View rowView=view;
//        if (rowView==null) {
//            rowView=layoutInflater.inflate(R.layout.item_scrollview_brand_dssp,parent,false);
//        }
//
//        // Ánh xạ view
//        ImageView imgBrand = (ImageView) rowView.findViewById(R.id.img_brand_dssp);
//        TextView slconlai = (TextView) rowView.findViewById(R.id.slConLai_brand_dssp);
//        CardView cardBrand = (CardView) rowView.findViewById(R.id.card_brand_dssp);
//        CardView cardslConLai = (CardView) rowView.findViewById(R.id.card_slcl_dssp);
//
//
//        // Gán giá trị
//        objectBrandDssp =listDssp.get(i);
//        imgBrand.setImageResource(objectBrandDssp.getImgBrand());
//        slconlai.setText(String.valueOf(objectBrandDssp.getSlconlai()));
//
//        cardBrand.setTag(i);
//        cardslConLai.setTag(i*100);
//
//        return rowView;
//    }
//
////    private class ViewHolder
////    {
////        ImageView imgBrand;
////        TextView slconlai;
////        CardView cardBrand;
////        CardView cardslConLai;
////    }
////
////    public View getView(int position, View view, ViewGroup viewgroup) {
////        ViewHolder holder = new ViewHolder(); // our view holder of the row
////
////
////        HorizontalScrollView hr = new HorizontalScrollView(context);
////        LinearLayout layout = new LinearLayout(context);
////
////
////        hr.addView(layout);
////        view = hr;
////
////        view.setTag(holder);
////
////
////        holder = (ViewHolder) view.getTag();
////
////        return view;
////    }
//
//}
//
