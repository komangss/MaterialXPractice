package com.example.materialxpractice.Button;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.materialxpractice.Button.Basic.ButtonBasicActivity;
import com.example.materialxpractice.Button.FabMore.ButtonFabMoreActivity;
import com.example.materialxpractice.R;

public class ListButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_button);

        Button btnToButtonBasic = findViewById(R.id.btn_to_btn_basic);
        btnToButtonBasic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListButtonActivity.this, ButtonBasicActivity.class);
                startActivity(intent);
            }
        });

        Button btnToButtonFabMore = findViewById(R.id.btn_to_btn_fab_more);
        btnToButtonFabMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListButtonActivity.this, ButtonFabMoreActivity.class);
                startActivity(intent);
            }
        });
    }
}
