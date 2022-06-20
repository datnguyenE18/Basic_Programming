package com.example.th1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declare:
        EditText soA = findViewById(R.id.soA);
        EditText soB = findViewById(R.id.soB);
        EditText res = findViewById(R.id.res);

        Button cong = findViewById(R.id.btnPlus);
        Button tru = findViewById(R.id.btnMin);
        Button nhan = findViewById(R.id.btnMul);
        Button chia = findViewById(R.id.btnDev);

        // Calculating:
        cong.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                float A = Float.parseFloat(soA.getText().toString());
                float B = Float.parseFloat(soB.getText().toString());
                res.setText(String.valueOf(A+B));
            }
        } );

        tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float A = Float.parseFloat(soA.getText().toString());
                float B = Float.parseFloat(soB.getText().toString());
                res.setText(String.valueOf(A-B));
            }
        });

        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float A = Float.parseFloat(soA.getText().toString());
                float B = Float.parseFloat(soB.getText().toString());
                res.setText(String.valueOf(A*B));
            }
        });

        chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float A = Float.parseFloat(soA.getText().toString());
                float B = Float.parseFloat(soB.getText().toString());

                if (B == 0){
                    res.setText("No Result!!!");
                } else {
                    res.setText(String.valueOf(A/B));
                }
            }
        });

        // ActionBar config:
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#6677B9")));
    }
}