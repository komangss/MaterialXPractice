package com.example.materialxpractice.BottomNavigation.Primary;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.materialxpractice.R;

public class BottomNavigationPrimaryActivity extends AppCompatActivity {


    private ActionBar actionBar;
    private NestedScrollView nested_scroll_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation_primary);
    }

    public void clickAction(View view) {
        Toast.makeText(this, "Tombol di tekan", Toast.LENGTH_SHORT);
    }
}
