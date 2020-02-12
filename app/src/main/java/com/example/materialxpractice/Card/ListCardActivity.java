package com.example.materialxpractice.Card;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.materialxpractice.Card.Basic.CardBasicActivity;
import com.example.materialxpractice.Card.Timeline.CardTimelineActivity;
import com.example.materialxpractice.Card.Wizard.CardWizardActivity;
import com.example.materialxpractice.Card.WizardOverleap.CardWizardOverlapActivity;
import com.example.materialxpractice.R;

public class ListCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_card);

        Button btnToCardBasic = findViewById(R.id.btn_to_card_basic);
        btnToCardBasic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListCardActivity.this, CardBasicActivity.class);
                startActivity(intent);
            }
        });

        Button btnToCardTimeline = findViewById(R.id.btn_to_card_timeline);
        btnToCardTimeline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListCardActivity.this, CardTimelineActivity.class);
                startActivity(intent);
            }
        });

        Button btnToCardWizard = findViewById(R.id.btn_to_card_wizard);
        btnToCardWizard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListCardActivity.this, CardWizardActivity.class);
                startActivity(intent);
            }
        });

        Button btnToCardWizardOverleap = findViewById(R.id.btn_to_card_wizard_overleap);
        btnToCardWizardOverleap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListCardActivity.this, CardWizardOverlapActivity.class);
                startActivity(intent);
            }
        });
    }
}
