package com.example.materialxpractice.Card;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.materialxpractice.Card.Basic.CardBasicActivity;
import com.example.materialxpractice.R;

public class ListCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_card);

        Button btnToButtonBasic = findViewById(R.id.btn_to_card_basic);
        btnToButtonBasic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListCardActivity.this, CardBasicActivity.class);
                startActivity(intent);
            }
        });

//        Button btnToButtonFabMore = findViewById(R.id.btn_to_btn_fab_more);
//        btnToButtonFabMore.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(ListCardActivity.this, ButtonFabMoreActivity.class);
//                startActivity(intent);
//            }
//        });
    }
}
