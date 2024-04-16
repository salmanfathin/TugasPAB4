package com.example.tugaspab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends AppCompatActivity {
    private EditText name;
    private EditText mail;
    private EditText pass;
    private Button add;
    private Button loginpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        name = findViewById(R.id.name);
        mail = findViewById(R.id.email);
        pass = findViewById(R.id.password);
        add = findViewById(R.id.registerbutton);
        loginpage = findViewById(R.id.loginbawah);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = name.getText().toString();
                String email = mail.getText().toString();
                String password = pass.getText().toString();
                Intent intent = new Intent(Register.this, Utama2.class);
                intent.putExtra("keyname",username);
                intent.putExtra("keyname2",email);
                intent.putExtra("keyname3",password);
                startActivity(intent);
            }
        });

        loginpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Register.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}