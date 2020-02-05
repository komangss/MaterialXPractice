package com.example.materialxpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.materialxpractice.BottomNavigation.BottomNavigationListActivity;
import com.example.materialxpractice.BottomSheet.ListBottomSheetActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnToBottomNavigationLoListActivity, btnToBottomSheetActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponent();
    }

    private void initComponent() {
        btnToBottomNavigationLoListActivity = findViewById(R.id.btn_to_bottom_navigation_list);

        btnToBottomNavigationLoListActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BottomNavigationListActivity.class);
                startActivity(intent);
            }
        });
        btnToBottomSheetActivity = findViewById(R.id.btn_to_bottom_sheet_list);

        btnToBottomSheetActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListBottomSheetActivity.class);
                startActivity(intent);
            }
        });
    }
}
