package com.example.animequotes.data;

public class AnimeCharacterModel {

    private final Integer iconId;
    private final String letters;

    public AnimeCharacterModel(Integer iconId, String letters) {
        this.iconId = iconId;
        this.letters = letters;
    }

    public Integer getIconId() {
        return iconId;
    }

    public String getLetters() {
        return letters;
    }
}
