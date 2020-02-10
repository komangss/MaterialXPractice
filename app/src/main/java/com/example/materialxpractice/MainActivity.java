package com.example.materialxpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.materialxpractice.BottomNavigation.BottomNavigationListActivity;
import com.example.materialxpractice.BottomSheet.ListBottomSheetActivity;
import com.example.materialxpractice.Button.ListButtonActivity;
import com.example.materialxpractice.Card.ListCardActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponent();
    }

    private void initComponent() {
        Button btnToBottomNavigationLoListActivity = findViewById(R.id.btn_to_bottom_navigation_list);

        btnToBottomNavigationLoListActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BottomNavigationListActivity.class);
                startActivity(intent);
            }
        });
        Button btnToBottomSheetActivity = findViewById(R.id.btn_to_bottom_sheet_list);

        btnToBottomSheetActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListBottomSheetActivity.class);
                startActivity(intent);
            }
        });

        Button btnToButtonList = findViewById(R.id.btn_to_button_list);

        btnToButtonList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListButtonActivity.class);
                startActivity(intent);
            }
        });

        Button btnToCardList = findViewById(R.id.btn_to_card_list);

        btnToCardList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListCardActivity.class);
                startActivity(intent);
            }
        });
    }
}
