package com.example.animequotes.data;

import com.example.animequotes.R;

import java.util.ArrayList;

public class ArrayListModel {

    public ArrayList<AnimeCharacterModel> setlistdata(){

        ArrayList<AnimeCharacterModel> arrayList = new ArrayList<>();
        arrayList.add(new AnimeCharacterModel(R.drawable.capuz_azul,"Capuz Azul"));
        arrayList.add(new AnimeCharacterModel(R.drawable.koucho_shinobu,"Koucho Shinobu"));
        arrayList.add(new AnimeCharacterModel(R.drawable.mitsuri_kanroji,"Mitsuri Kanroji"));
        arrayList.add(new AnimeCharacterModel(R.drawable.harley_quinn,"Harley Quinn"));
        arrayList.add(new AnimeCharacterModel(R.drawable.ciel_black_butler,"Black Butler"));
        arrayList.add(new AnimeCharacterModel(R.drawable.hunter_x_hunter,"Hunter X Hunter"));
        arrayList.add(new AnimeCharacterModel(R.drawable.alya,"Alya"));
        arrayList.add(new AnimeCharacterModel(R.drawable.hola,"Hola"));
        arrayList.add(new AnimeCharacterModel(R.drawable.artist,"Artist"));
        arrayList.add(new AnimeCharacterModel(R.drawable.villain_lover,"Villain Lover"));
        arrayList.add(new AnimeCharacterModel(R.drawable.bored_panda,"Bored Panda"));
        arrayList.add(new AnimeCharacterModel(R.drawable.demon_slayer,"Demon Slayer"));
        arrayList.add(new AnimeCharacterModel(R.drawable.boku,"Boku"));
        arrayList.add(new AnimeCharacterModel(R.drawable.paimon,"Paimon"));
        arrayList.add(new AnimeCharacterModel(R.drawable.himeno,"Himeno"));
        arrayList.add(new AnimeCharacterModel(R.drawable.trunks_brief,"Trunks Brief"));
        arrayList.add(new AnimeCharacterModel(R.drawable.son_goku,"Son Goku"));
        arrayList.add(new AnimeCharacterModel(R.drawable.zeref,"Zeref"));

        return arrayList;
    }
}

