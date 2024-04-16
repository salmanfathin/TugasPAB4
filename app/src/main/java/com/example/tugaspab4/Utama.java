package com.example.tugaspab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Utama extends AppCompatActivity {
    private TextView name;
    private TextView pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);

        name = findViewById(R.id.text_name);
        String username = getIntent().getStringExtra("keyname");
        name.setText(username);
        pass = findViewById(R.id.text_name2);
        String password = getIntent().getStringExtra("keyname2");
        pass.setText(password);
    }
}