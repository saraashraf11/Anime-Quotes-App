package com.example.animequotes.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.animequotes.R;
import com.example.animequotes.data.AnimeQuoteModel;

import java.util.ArrayList;
import java.util.List;


public class LatestQuotesFragment extends Fragment {

    RecyclerView recyclerView;
    List<AnimeQuoteModel> dataList;
    RecyclerViewAdapter adapter;
    AnimeQuoteModel androidData;
    SearchView searchView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_latest_quotes, container, false);

        recyclerView = view.findViewById(R.id.recycler_view);
        searchView = view.findViewById(R.id.search);

        searchView.clearFocus();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                searchList(newText);
                return true;
            }
        });

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),1);
        recyclerView.setLayoutManager(gridLayoutManager);
        dataList = new ArrayList<>();

        androidData = new AnimeQuoteModel(R.drawable.card_1,"The true measure of a shinobi is not how he lives, but how he dies. ");
        dataList.add(androidData);
        androidData = new AnimeQuoteModel(R.drawable.card_2,"I don't care where I get hurt, as long as my injuries are visible. \n");
        dataList.add(androidData);
        androidData = new AnimeQuoteModel(R.drawable.card_3,"There is no such thing as being born into the world to be alone. \n");
        dataList.add(androidData);
        androidData = new AnimeQuoteModel(R.drawable.card_4,"A king is no king without his people. But people without a king are lost as well! \n");
        dataList.add(androidData);
        androidData = new AnimeQuoteModel(R.drawable.card_5,"Death is simply another stage of our life. \n");
        dataList.add(androidData);
        androidData = new AnimeQuoteModel(R.drawable.card_6,"I wonder how long... How long will I remain anchored at this harbor known as battle ? ");
        dataList.add(androidData);
        androidData = new AnimeQuoteModel(R.drawable.card_7,"You have three choices, you can give up, give in or give it your all. \n");
        dataList.add(androidData);
        androidData = new AnimeQuoteModel(R.drawable.card_8,"There's no such thing as useless effort. \n");
        dataList.add(androidData);
        androidData = new AnimeQuoteModel(R.drawable.card_9,"If you truly desire greatness, you must first know what makes you weak ! \n");
        dataList.add(androidData);

        adapter = new RecyclerViewAdapter(getActivity(),dataList);
        recyclerView.setAdapter(adapter);
        return view;
    }

    private void searchList(String text){
        List<AnimeQuoteModel> dataSearchList = new ArrayList<>();
        for(AnimeQuoteModel data : dataList){
            if(data.getDataQuote().toLowerCase().contains(text.toLowerCase())){
                dataSearchList.add(data);
            }
        }
        if(dataSearchList.isEmpty()){
            Toast.makeText(getActivity(),"Not Found",Toast.LENGTH_SHORT).show();
        } else {
            adapter.setSearchList(dataSearchList);
        }
    }
}