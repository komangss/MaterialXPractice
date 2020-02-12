package com.example.materialxpractice.Dialog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.materialxpractice.Card.Basic.CardBasicActivity;
import com.example.materialxpractice.Card.Timeline.CardTimelineActivity;
import com.example.materialxpractice.R;

public class ListDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_card);

        Button btnToCardBasic = findViewById(R.id.btn_to_card_basic);
        btnToCardBasic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListDialogActivity.this, CardBasicActivity.class);
                startActivity(intent);
            }
        });

        Button btnToCardTimeline = findViewById(R.id.btn_to_card_timeline);
        btnToCardTimeline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListDialogActivity.this, CardTimelineActivity.class);
                startActivity(intent);
            }
        });
    }
}
