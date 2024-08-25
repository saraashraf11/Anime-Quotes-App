package com.example.animequotes.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.animequotes.R;

public class CustomBaseAdapter extends BaseAdapter {

    Context context;
    String listAnimeName[];
    int listAnimeImage[];
    LayoutInflater inflater;

    public CustomBaseAdapter(Context ctx, String[] animeName,int[] animeImage){
        this.context = ctx;
        this.listAnimeName = animeName;
        this.listAnimeImage = animeImage;
        inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return listAnimeName.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.activity_custome_list_view,null);
        TextView txtView = (TextView) view.findViewById(R.id.textView);
        ImageView animeImage = (ImageView) view.findViewById(R.id.imageIcon);
        txtView.setText(listAnimeName[i]);
        animeImage.setImageResource(listAnimeImage[i]);
        return view;
    }
}
