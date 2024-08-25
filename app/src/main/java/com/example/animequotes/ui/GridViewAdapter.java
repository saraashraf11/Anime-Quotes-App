package com.example.animequotes.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.animequotes.R;
import com.example.animequotes.data.AnimeCharacterModel;

import java.util.ArrayList;

public class GridViewAdapter extends ArrayAdapter<AnimeCharacterModel> {

    public GridViewAdapter(@NonNull Context context, ArrayList<AnimeCharacterModel> animeCharacterModel) {
        super(context, 0, animeCharacterModel);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ModelView modelView;

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_grid_view , parent,false);
            modelView = new ModelView(convertView);
            convertView.setTag(modelView);
        }
        else{
            modelView =(ModelView) convertView.getTag();
        }

        AnimeCharacterModel model = getItem(position);
        assert model != null;
        modelView.animeImage.setImageResource(model.getIconId());
        modelView.animeName.setText(model.getLetters());

        return convertView;
    }

    private static class ModelView{
        private final ImageView animeImage;
        private final TextView animeName;

        public ModelView(View view){
            animeImage = view.findViewById(R.id.img_gridView);
            animeName = view.findViewById(R.id.txt_gridView);
        }

    }
}
