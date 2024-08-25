package com.example.animequotes.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.animequotes.R;

public class MainDescription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_description);

        // Back Botton
        ImageView back = findViewById(R.id.img_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(MainDescription.this, MainAnimes.class);
                startActivity(back);
            }
        });

        // Zeref
        Intent Zeref = getIntent();
        int animeImageId1 = Zeref.getIntExtra("animeImageId",0);
        String animeNameId1 = Zeref.getStringExtra("animeNameId");
        String animeDescriptionId1 = Zeref.getStringExtra("animeDescriptionId");

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView animeImageView = findViewById(R.id.img_anime);
        animeImageView.setImageResource(animeImageId1);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView emojiTextViewName = findViewById(R.id.title_anime);
        emojiTextViewName.setText(animeNameId1);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView emojiTextView = findViewById(R.id.text_anime);
        emojiTextView.setText(animeDescriptionId1);

        // Yukio Tonegawa
        Intent yukio_tonegawa = getIntent();
        int animeImageId2 = yukio_tonegawa.getIntExtra("animeImageId",0);
        String animeNameId2 = yukio_tonegawa.getStringExtra("animeNameId");
        String animeDescriptionId2 = yukio_tonegawa.getStringExtra("animeDescriptionId");

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView animeImageView2 = findViewById(R.id.img_anime);
        animeImageView2.setImageResource(animeImageId2);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView emojiTextViewName2= findViewById(R.id.title_anime);
        emojiTextViewName2.setText(animeNameId2);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView emojiTextView2 = findViewById(R.id.text_anime);
        emojiTextView2.setText(animeDescriptionId2);

        // Ymir
        Intent Ymir = getIntent();
        int animeImageId3 = Ymir.getIntExtra("animeImageId",0);
        String animeNameId3 = Ymir.getStringExtra("animeNameId");
        String animeDescriptionId3 = Ymir.getStringExtra("animeDescriptionId");

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView animeImageView3 = findViewById(R.id.img_anime);
        animeImageView3.setImageResource(animeImageId3);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView emojiTextViewName3= findViewById(R.id.title_anime);
        emojiTextViewName3.setText(animeNameId3);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView emojiTextView3 = findViewById(R.id.text_anime);
        emojiTextView3.setText(animeDescriptionId3);

        // Winry Rockbell
        Intent winry_rockbell = getIntent();
        int animeImageId4 = winry_rockbell.getIntExtra("animeImageId",0);
        String animeNameId4 = winry_rockbell.getStringExtra("animeNameId");
        String animeDescriptionId4 = winry_rockbell.getStringExtra("animeDescriptionId");

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView animeImageView4 = findViewById(R.id.img_anime);
        animeImageView4.setImageResource(animeImageId4);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView emojiTextViewName4 = findViewById(R.id.title_anime);
        emojiTextViewName4.setText(animeNameId4);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView emojiTextView4 = findViewById(R.id.text_anime);
        emojiTextView4.setText(animeDescriptionId4);

        // Tsunade
        Intent Tsunade = getIntent();
        int animeImageId5 = Tsunade.getIntExtra("animeImageId",0);
        String animeNameId5 = Tsunade.getStringExtra("animeNameId");
        String animeDescriptionId5 = Tsunade.getStringExtra("animeDescriptionId");

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView animeImageView5 = findViewById(R.id.img_anime);
        animeImageView5.setImageResource(animeImageId5);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView emojiTextViewName5= findViewById(R.id.title_anime);
        emojiTextViewName5.setText(animeNameId5);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView emojiTextView5 = findViewById(R.id.text_anime);
        emojiTextView5.setText(animeDescriptionId5);

        // Trunks Brief
        Intent trunks_brief = getIntent();
        int animeImageId6 = trunks_brief.getIntExtra("animeImageId",0);
        String animeNameId6 = trunks_brief.getStringExtra("animeNameId");
        String animeDescriptionId6 = trunks_brief.getStringExtra("animeDescriptionId");

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView animeImageView6 = findViewById(R.id.img_anime);
        animeImageView6.setImageResource(animeImageId6);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView emojiTextViewName6= findViewById(R.id.title_anime);
        emojiTextViewName6.setText(animeNameId6);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView emojiTextView6 = findViewById(R.id.text_anime);
        emojiTextView6.setText(animeDescriptionId6);

        // Touka Kirishima
        Intent touka_kirishima = getIntent();
        int animeImageId7 = touka_kirishima.getIntExtra("animeImageId",0);
        String animeNameId7 = touka_kirishima.getStringExtra("animeNameId");
        String animeDescriptionId7 = touka_kirishima.getStringExtra("animeDescriptionId");

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView animeImageView7 = findViewById(R.id.img_anime);
        animeImageView7.setImageResource(animeImageId7);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView emojiTextViewName7= findViewById(R.id.title_anime);
        emojiTextViewName7.setText(animeNameId7);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView emojiTextView7 = findViewById(R.id.text_anime);
        emojiTextView7.setText(animeDescriptionId7);

        // Tetsuya Kuroko
        Intent tetsuya_kuroko = getIntent();
        int animeImageId8 = tetsuya_kuroko.getIntExtra("animeImageId",0);
        String animeNameId8 = tetsuya_kuroko.getStringExtra("animeNameId");
        String animeDescriptionId8 = tetsuya_kuroko.getStringExtra("animeDescriptionId");

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView animeImageView8 = findViewById(R.id.img_anime);
        animeImageView8.setImageResource(animeImageId8);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView emojiTextViewName8= findViewById(R.id.title_anime);
        emojiTextViewName8.setText(animeNameId8);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView emojiTextView8 = findViewById(R.id.text_anime);
        emojiTextView8.setText(animeDescriptionId8);

        // Solf J. Kimblee
        Intent Solf_J_Kimblee = getIntent();
        int animeImageId9 = Solf_J_Kimblee.getIntExtra("animeImageId",0);
        String animeNameId9 = Solf_J_Kimblee.getStringExtra("animeNameId");
        String animeDescriptionId9 = Solf_J_Kimblee.getStringExtra("animeDescriptionId");

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView animeImageView9 = findViewById(R.id.img_anime);
        animeImageView9.setImageResource(animeImageId9);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView emojiTextViewName9= findViewById(R.id.title_anime);
        emojiTextViewName9.setText(animeNameId9);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView emojiTextView9 = findViewById(R.id.text_anime);
        emojiTextView9.setText(animeDescriptionId9);

        // Tatsuya Himuro
        Intent Tatsuya_Himuro = getIntent();
        int animeImageId10 = Tatsuya_Himuro.getIntExtra("animeImageId",0);
        String animeNameId10 = Tatsuya_Himuro.getStringExtra("animeNameId");
        String animeDescriptionId10 = Tatsuya_Himuro.getStringExtra("animeDescriptionId");

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView animeImageView10 = findViewById(R.id.img_anime);
        animeImageView10.setImageResource(animeImageId10);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView emojiTextViewName10= findViewById(R.id.title_anime);
        emojiTextViewName10.setText(animeNameId10);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView emojiTextView10 = findViewById(R.id.text_anime);
        emojiTextView10.setText(animeDescriptionId10);

        // Son Goku
        Intent Son_Goku = getIntent();
        int animeImageId11 = Son_Goku.getIntExtra("animeImageId",0);
        String animeNameId11 = Son_Goku.getStringExtra("animeNameId");
        String animeDescriptionId11 = Son_Goku.getStringExtra("animeDescriptionId");

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView animeImageView11 = findViewById(R.id.img_anime);
        animeImageView11.setImageResource(animeImageId11);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView emojiTextViewName11= findViewById(R.id.title_anime);
        emojiTextViewName11.setText(animeNameId11);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView emojiTextView11 = findViewById(R.id.text_anime);
        emojiTextView11.setText(animeDescriptionId11);

        // Shino Aburame
        Intent Shino_Aburame = getIntent();
        int animeImageId12 = Shino_Aburame.getIntExtra("animeImageId",0);
        String animeNameId12 = Shino_Aburame.getStringExtra("animeNameId");
        String animeDescriptionId12 = Shino_Aburame.getStringExtra("animeDescriptionId");

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView animeImageView12 = findViewById(R.id.img_anime);
        animeImageView12.setImageResource(animeImageId12);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView emojiTextViewName12= findViewById(R.id.title_anime);
        emojiTextViewName12.setText(animeNameId12);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView emojiTextView12 = findViewById(R.id.text_anime);
        emojiTextView12.setText(animeDescriptionId12);

        // Shirley Fenette
        Intent Shirley_Fenette = getIntent();
        int animeImageId13 = Shirley_Fenette.getIntExtra("animeImageId",0);
        String animeNameId13 = Shirley_Fenette.getStringExtra("animeNameId");
        String animeDescriptionId13 = Shirley_Fenette.getStringExtra("animeDescriptionId");

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView animeImageView13 = findViewById(R.id.img_anime);
        animeImageView13.setImageResource(animeImageId13);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView emojiTextViewName13= findViewById(R.id.title_anime);
        emojiTextViewName13.setText(animeNameId13);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView emojiTextView13 = findViewById(R.id.text_anime);
        emojiTextView13.setText(animeDescriptionId13);

        // Shimura Shinpachi
        Intent Shimura_Shinpachi = getIntent();
        int animeImageId14 = Shimura_Shinpachi.getIntExtra("animeImageId",0);
        String animeNameId14 = Shimura_Shinpachi.getStringExtra("animeNameId");
        String animeDescriptionId14 = Shimura_Shinpachi.getStringExtra("animeDescriptionId");

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView animeImageView14 = findViewById(R.id.img_anime);
        animeImageView14.setImageResource(animeImageId14);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView emojiTextViewName14= findViewById(R.id.title_anime);
        emojiTextViewName14.setText(animeNameId14);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView emojiTextView14 = findViewById(R.id.text_anime);
        emojiTextView14.setText(animeDescriptionId14);

        // Sakura Haruno
        Intent Sakura_Haruno = getIntent();
        int animeImageId15 = Sakura_Haruno.getIntExtra("animeImageId",0);
        String animeNameId15 = Sakura_Haruno.getStringExtra("animeNameId");
        String animeDescriptionId15 = Sakura_Haruno.getStringExtra("animeDescriptionId");

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView animeImageView15 = findViewById(R.id.img_anime);
        animeImageView15.setImageResource(animeImageId15);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView emojiTextViewName15= findViewById(R.id.title_anime);
        emojiTextViewName15.setText(animeNameId15);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView emojiTextView15 = findViewById(R.id.text_anime);
        emojiTextView15.setText(animeDescriptionId15);

    }
}