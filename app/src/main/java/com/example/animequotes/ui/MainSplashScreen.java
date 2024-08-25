package com.example.animequotes.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.animequotes.R;

public class MainSplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash_screen);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView splash = findViewById(R.id.img_splash);
        Thread thread = new Thread(){
            public void run(){
                try {
                    sleep(4000);
                    Intent animes = new Intent(MainSplashScreen.this,MainHomeScreen.class);
                    startActivity(animes);
                    finish();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        thread.start();
    }
}