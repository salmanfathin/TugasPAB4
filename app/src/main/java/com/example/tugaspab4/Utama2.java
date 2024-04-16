package com.example.tugaspab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Utama2 extends AppCompatActivity {
    private TextView name;
    private TextView mail;
    private TextView pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama2);

        name = findViewById(R.id.text_name);
        String username = getIntent().getStringExtra("keyname");
        name.setText(username);
        mail = findViewById(R.id.text_name2);
        String email = getIntent().getStringExtra("keyname2");
        mail.setText(email);
        pass = findViewById(R.id.text_name3);
        String password = getIntent().getStringExtra("keyname3");
        pass.setText(password);
    }
}