package com.example.materialxpractice.Chips.Tag;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.materialxpractice.R;
import com.hootsuite.nachos.NachoTextView;
import com.hootsuite.nachos.terminator.ChipTerminatorHandler;
import java.util.ArrayList;
import java.util.List;

public class ChipTagActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chip_tag);
        iniComponent();
    }

    private void iniComponent() {
        NachoTextView et_tag = findViewById(R.id.et_tag); // et means EditText
        List<String> items = new ArrayList<>();
        items.add("black");
        items.add("building");
        items.add("city");
        et_tag.setText(items);
        et_tag.addChipTerminator('\n', ChipTerminatorHandler.BEHAVIOR_CHIPIFY_ALL);
    }
}
