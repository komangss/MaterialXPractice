package com.example.materialxpractice.BottomNavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.materialxpractice.BottomNavigation.Primary.BottomNavigationPrimaryActivity;
import com.example.materialxpractice.BottomNavigation.Shifting.BottomNavigationShiftingActivity;
import com.example.materialxpractice.R;

public class BottomNavigationListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation_list);

        Button btnToBottomNavigationShifting = findViewById(R.id.btn_to_bottom_navigation_shifting);
        btnToBottomNavigationShifting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BottomNavigationListActivity.this, BottomNavigationShiftingActivity.class);
                startActivity(intent);
            }
        });

        Button btnToBottomNavigationPrimary = findViewById(R.id.btn_to_bottom_navigation_primary);
        btnToBottomNavigationPrimary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BottomNavigationListActivity.this, BottomNavigationPrimaryActivity.class);
                startActivity(intent);
            }
        });
    }
}
