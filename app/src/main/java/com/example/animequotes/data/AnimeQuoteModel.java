package com.example.animequotes.data;

public class AnimeQuoteModel {

    private int dataImage;
    private String dataQuote;

    public AnimeQuoteModel(int dataImage, String dataQuote) {
        this.dataImage = dataImage;
        this.dataQuote = dataQuote;
    }

    public int getDataImage() {
        return dataImage;
    }

    public String getDataQuote() {
        return dataQuote;
    }
}
