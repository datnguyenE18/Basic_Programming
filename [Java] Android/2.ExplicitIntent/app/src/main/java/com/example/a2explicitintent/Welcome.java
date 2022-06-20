package com.example.a2explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        TextView txtWelc = findViewById(R.id.txtWelc);

        // Khai báo Intent:
        Intent intent = getIntent();

        // Nhận dữ liệu:
        String name = intent.getStringExtra("toWelcome");
        txtWelc.setText("Welcome, " + name + "!");

        // ActionBar Config:
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#6677B9")));
    }
}