package com.example.animequotes.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.animequotes.R;
import com.google.android.material.navigation.NavigationView;

import androidx.activity.EdgeToEdge;

public class MainAnimes extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this); // Ensure EdgeToEdge is correctly implemented
        setContentView(R.layout.activity_main_animes);

        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.open_nav, R.string.close_nav);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_containar, new LatestListFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_animeList);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.nav_animeList) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_containar,
                    new LatestListFragment()).commit();
        } else if (item.getItemId() == R.id.nav_latestQuotes) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_containar,
                    new LatestQuotesFragment()).commit();
        }
        else if (item.getItemId() == R.id.nav_favourite) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_containar,
                    new FavouriteFragment()).commit();
        }else if (item.getItemId() == R.id.nav_animeCharacter) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_containar,
                    new AnimeCharacterFragment()).commit();
        }else if (item.getItemId() == R.id.nav_aboutUs) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_containar,
                    new AboutUsFragment()).commit();
        }


        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}