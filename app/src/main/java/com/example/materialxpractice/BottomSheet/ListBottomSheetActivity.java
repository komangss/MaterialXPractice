package com.example.materialxpractice.BottomSheet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.materialxpractice.BottomSheet.Floating.BottomSheetFloatingActivity;
import com.example.materialxpractice.BottomSheet.List.BottomSheetList;
import com.example.materialxpractice.R;

public class ListBottomSheetActivity extends AppCompatActivity {

    private Button btnToList, btnToFloat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_bottom_sheet);

        btnToList = findViewById(R.id.btn_to_sheet_list);
        btnToList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListBottomSheetActivity.this, BottomSheetList.class);
                startActivity(intent);
            }
        });

        btnToFloat = findViewById(R.id.btn_to_sheet_float);
        btnToFloat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListBottomSheetActivity.this, BottomSheetFloatingActivity.class);
                startActivity(intent);
            }
        });
    }
}
