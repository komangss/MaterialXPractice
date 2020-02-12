package com.example.materialxpractice.Chips;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.materialxpractice.Chips.Basic.ChipBasicActivity;
import com.example.materialxpractice.Chips.Tag.ChipTagActivity;
import com.example.materialxpractice.R;

public class ListChipsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_chips);

        Button btnToChipsBasic = findViewById(R.id.btn_to_chips_basic);
        btnToChipsBasic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListChipsActivity.this, ChipBasicActivity.class);
                startActivity(intent);
            }
        });

        Button btnToChipsTag = findViewById(R.id.btn_to_chips_tag);
        btnToChipsTag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListChipsActivity.this, ChipTagActivity.class);
                startActivity(intent);
            }
        });
    }
}
