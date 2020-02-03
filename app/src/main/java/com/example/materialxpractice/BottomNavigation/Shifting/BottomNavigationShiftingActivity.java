package com.example.materialxpractice.BottomNavigation.Shifting;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.materialxpractice.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigationShiftingActivity extends AppCompatActivity {

    private BottomNavigationView navigation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation_shifting);


        navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_movie:
                        navigation.setBackgroundColor(getResources().getColor(R.color.blue_grey_700));
                        return true;
                    case R.id.navigation_music:
                        navigation.setBackgroundColor(getResources().getColor(R.color.pink_800));
                        return true;
                    case R.id.navigation_books:
                        navigation.setBackgroundColor(getResources().getColor(R.color.grey_700));
                        return true;
                }
                return false;
            }
        });
    }
}
