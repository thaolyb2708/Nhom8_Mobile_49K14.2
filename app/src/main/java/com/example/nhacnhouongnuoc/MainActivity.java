package com.example.nhacnhouongnuoc;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);

        // Mặc định hiển thị màn hình Home
        showHome();

        bottomNav.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.nav_today) {
                showHome();
                return true;
            } else if (id == R.id.nav_stats) {
                showStats();
                return true;
            } else if (id == R.id.nav_explore) {
                showExplore();
                return true;
            } else if (id == R.id.nav_settings) {
                showSettings();
                return true;
            }
            return false;
        });
    }

    private void showHome() {
        View homeView = getLayoutInflater().inflate(R.layout.fragment_home, null);
        FrameLayout container = findViewById(R.id.fragment_container);
        container.removeAllViews();
        container.addView(homeView);
    }

    private void showStats() {
        View statsView = getLayoutInflater().inflate(R.layout.fragment_stats, null);
        FrameLayout container = findViewById(R.id.fragment_container);
        container.removeAllViews();
        container.addView(statsView);
    }

    private void showExplore() {
        View exploreView = getLayoutInflater().inflate(R.layout.fragment_explore, null);
        FrameLayout container = findViewById(R.id.fragment_container);
        container.removeAllViews();
        container.addView(exploreView);
    }

    private void showSettings() {
        View settingsView = getLayoutInflater().inflate(R.layout.fragment_settings, null);
        FrameLayout container = findViewById(R.id.fragment_container);
        container.removeAllViews();
        container.addView(settingsView);
    }
}