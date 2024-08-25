package com.example.animequotes.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.animequotes.R;


public class LatestListFragment extends Fragment {

    String animeName[] = {"Zeref","Yukio Tonegawa","Ymir","Winry Rockbell","Tsunade","Trunks Brief","Touka Kirishima","Tetsuya Kuroko","Solf J. Kimblee","Tatsuya Himuro","Son Goku","Shino Aburame","Shirley Fenette","Shimura Shinpachi","Sakura Haruno"};
    int animeImage[] = {R.drawable.zeref,R.drawable.yukio_tonegawa,R.drawable.ymir,R.drawable.winry_rockbell,R.drawable.tsunade,R.drawable.trunks_brief,R.drawable.touka_kirishima,R.drawable.tetsuya_kuroko,R.drawable.solf_j_kimblee,R.drawable.tatsuya_himuro,R.drawable.son_goku,R.drawable.shino_aburame,R.drawable.shirley_fenette,R.drawable.shimura_shinpachi,R.drawable.sakura_haruno};

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_latest_list, container, false);

        // List View
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ListView listView = (ListView) view.findViewById(R.id.list_item);
        CustomBaseAdapter adapter = new CustomBaseAdapter(getActivity().getApplicationContext(), animeName,animeImage);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if(i == 0) {                  // clicked Zeref
                    Intent Zeref = new Intent(getActivity(), MainDescription.class);
                    Zeref.putExtra("animeImageId", R.drawable.zeref);
                    Zeref.putExtra("animeNameId", " Zeref " + "(Fairy Tail)");
                    Zeref.putExtra("animeDescriptionId", "There are things in this world that you cannot oppose, no matter how hard you try. ");
                    startActivity(Zeref);
                } else if (i == 1) {           // clicked Yukio Tonegawa
                    Intent yukio_tonegawa = new Intent(getActivity(), MainDescription.class);
                    yukio_tonegawa.putExtra("animeImageId", R.drawable.yukio_tonegawa);
                    yukio_tonegawa.putExtra("animeNameId", " Yukio Tonegawa " + "(Kaiji)");
                    yukio_tonegawa.putExtra("animeDescriptionId", "Normally, those people would never wake up from their fantasy worlds. They live meaningless lives. They waste their precious days over nothing. No matter how old they get, they'll continue to say, \"My real life hasn't started yet. The real me is still asleep, so that's why my life is such garbage.\" They continue to tell themselves that. And they age. Then die. And on their deathbeds, they will finally realize: the life they lived was the real thing. People don't live provisional lives, nor do they die provisional deaths. That's a simple fact! The problem... is whether they realize that simple fact. \n");
                    startActivity(yukio_tonegawa);
                } else if (i == 2) {           // clicked Ymir
                    Intent Ymir = new Intent(getActivity(), MainDescription.class);
                    Ymir.putExtra("animeImageId", R.drawable.ymir);
                    Ymir.putExtra("animeNameId", " Ymir  " + "(Shingeki no Kyojin)");
                    Ymir.putExtra("animeDescriptionId", "I too used to believe that the world would be a better place if I hadn’t been born. I was hated merely for the fact that I existed, and I died for the happiness of many people. But there was one thing I wished for with all my heart... If I’m ever given a second chance in life, I want to live for only myself. That is my sincere wish. ");
                    startActivity(Ymir);
                } else if (i == 3) {           // clicked Winry Rockbell
                    Intent Winry_Rockbell = new Intent(getActivity(), MainDescription.class);
                    Winry_Rockbell.putExtra("animeImageId", R.drawable.winry_rockbell);
                    Winry_Rockbell.putExtra("animeNameId", " Winry Rockbell " + "(Fullmetal Alchemist Brotherhood)");
                    Winry_Rockbell.putExtra("animeDescriptionId", "What do I have to live for now that I know Cain won't come back? You tell me that, Ed! \n");
                    startActivity(Winry_Rockbell);
                } else if (i == 4) {           // clicked Tsunade
                    Intent Zeref = new Intent(getActivity(), MainDescription.class);
                    Zeref.putExtra("animeImageId", R.drawable.tsunade);
                    Zeref.putExtra("animeNameId", " Tsunade " + "(Naruto Shippuden)");
                    Zeref.putExtra("animeDescriptionId", "Grow up... Death comes with being a shinobi. There are times when death is hard to accept, but if you don't get over it, there's no future... \n");
                    startActivity(Zeref);
                } else if (i == 5) {           // clicked Trunks Brief
                    Intent Zeref = new Intent(getActivity(), MainDescription.class);
                    Zeref.putExtra("animeImageId", R.drawable.trunks_brief);
                    Zeref.putExtra("animeNameId", " Trunks Brief " + "(Dragon Ball)");
                    Zeref.putExtra("animeDescriptionId", "Father, you're so tough and proud, hard and cold like a rock. But still, deep down, your heart beats like mine does... I know you feel... I'm your son and I will always love you. \n");
                    startActivity(Zeref);
                } else if (i == 6) {           // clicked Touka Kirishima
                    Intent Zeref = new Intent(getActivity(), MainDescription.class);
                    Zeref.putExtra("animeImageId", R.drawable.touka_kirishima);
                    Zeref.putExtra("animeNameId", " Touka Kirishima " + "(Tokyo Ghoul)");
                    Zeref.putExtra("animeDescriptionId", "After you've gobbled him down you'd be left alone to regret it while covered in blood and guts. That's the hunger of a ghoul. That's our destiny. \n");
                    startActivity(Zeref);
                } else if (i == 7) {           // clicked Tetsuya Kuroko
                    Intent Zeref = new Intent(getActivity(), MainDescription.class);
                    Zeref.putExtra("animeImageId", R.drawable.tetsuya_kuroko);
                    Zeref.putExtra("animeNameId", " Tetsuya Kuroko " + "(Kuroko no Basket)");
                    Zeref.putExtra("animeDescriptionId", "But hating something you love is a painful feeling. \n");
                    startActivity(Zeref);
                } else if (i == 8) {           // clicked Solf J. Kimblee
                    Intent Zeref = new Intent(getActivity(), MainDescription.class);
                    Zeref.putExtra("animeImageId", R.drawable.solf_j_kimblee);
                    Zeref.putExtra("animeNameId", " Solf J. Kimblee " + "(Fullmetal Alchemist Brotherhood)");
                    Zeref.putExtra("animeDescriptionId", "I think you've got me all wrong. My motives aren't so sophisticated as \"revenge\" or \"honor\" or any of that... The reason I killed all of those men... was because I could. It's that simple. \n");
                    startActivity(Zeref);
                } else if (i == 9) {           // clicked Tatsuya Himuro
                    Intent Zeref = new Intent(getActivity(), MainDescription.class);
                    Zeref.putExtra("animeImageId", R.drawable.tatsuya_himuro);
                    Zeref.putExtra("animeNameId", " Tatsuya Himuro " + "(Kuroko no Basket)");
                    Zeref.putExtra("animeDescriptionId", "What are you good at, what do you like… You need to show something that makes people understand who you are. ");
                    startActivity(Zeref);
                } else if (i == 10) {          // clicked Son Goku
                    Intent Zeref = new Intent(getActivity(), MainDescription.class);
                    Zeref.putExtra("animeImageId", R.drawable.son_goku);
                    Zeref.putExtra("animeNameId", " Son Goku " + "(Dragon Ball)");
                    Zeref.putExtra("animeDescriptionId", "I would rather be a brainless monkey than a heartless monster. (To Frieza) \n");
                    startActivity(Zeref);
                } else if (i == 11) {          // clicked Shino Aburame
                    Intent Zeref = new Intent(getActivity(), MainDescription.class);
                    Zeref.putExtra("animeImageId", R.drawable.shino_aburame);
                    Zeref.putExtra("animeNameId", " Shino Aburame " + "(Naruto Shippuden)");
                    Zeref.putExtra("animeDescriptionId", "Never underestimate your opponent, no matter how small they may seem. \n");
                    startActivity(Zeref);
                } else if (i == 12) {          // clicked Shirley Fenette
                    Intent Zeref = new Intent(getActivity(), MainDescription.class);
                    Zeref.putExtra("animeImageId", R.drawable.shirley_fenette);
                    Zeref.putExtra("animeNameId", " Shirley Fenette " + "(Code Geass)");
                    Zeref.putExtra("animeDescriptionId", "Nothing is unforgivable. So if you cannot forgive him, it means you do not want to. \n");
                    startActivity(Zeref);
                } else if (i == 13) {          // clicked Shimura Shinpachi
                    Intent Zeref = new Intent(getActivity(), MainDescription.class);
                    Zeref.putExtra("animeImageId", R.drawable.shimura_shinpachi);
                    Zeref.putExtra("animeNameId", " Shimura Shinpachi " + "(Gintama)");
                    Zeref.putExtra("animeDescriptionId", "[Shinpachi and Kagura are stuck in a trashcan, and have been pushed onto the train tracks. Shinpachi sees a train coming]This timing's just like some manga! \n");
                    startActivity(Zeref);
                } else if (i == 14) {          // clicked Sakura Haruno
                    Intent Zeref = new Intent(getActivity(), MainDescription.class);
                    Zeref.putExtra("animeImageId", R.drawable.sakura_haruno);
                    Zeref.putExtra("animeNameId", " Sakura Haruno " + "(Naruto Shippuden)");
                    Zeref.putExtra("animeDescriptionId", "I'm the one who made Naruto suffer the most... I've just been getting it wrong. Just been messing it up... I don't want to get it wrong anymore...don't want to screw it up anymore.");
                    startActivity(Zeref);
                }
            }
        });

        return view;
    }
}