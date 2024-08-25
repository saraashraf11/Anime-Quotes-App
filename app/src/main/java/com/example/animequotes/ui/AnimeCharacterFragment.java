package com.example.animequotes.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.animequotes.R;
import com.example.animequotes.data.AnimeCharacterModel;
import com.example.animequotes.data.ArrayListModel;

public class AnimeCharacterFragment extends Fragment implements AdapterView.OnItemClickListener {

    GridView gridView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_anime_character, container, false);

        gridView = view.findViewById(R.id.grid_view);
        GridViewAdapter gridViewAdapter = new GridViewAdapter(getActivity(),new ArrayListModel().setlistdata());
        gridView.setAdapter(gridViewAdapter);
        gridView.setOnItemClickListener(this);

        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
        AnimeCharacterModel model =(AnimeCharacterModel) parent.getItemAtPosition(position);
        Toast.makeText(getActivity(),"Clicked By : " + model.getLetters(), Toast.LENGTH_SHORT).show();
    }
}