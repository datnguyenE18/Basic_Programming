package com.example.onthi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btn_nhanvien, btn_vitri, btn_cv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        btn_nhanvien = findViewById(R.id.nhanvien);
        btn_vitri = findViewById(R.id.vitri);
        btn_cv = findViewById(R.id.cv);

        btn_nhanvien.setOnClickListener(this);
        btn_vitri.setOnClickListener(this);
        btn_cv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int viewID =view.getId();
        if(viewID == R.id.nhanvien){
//            System.out.println("nhanvien");
            Intent i = new Intent(this, NhanvienActivity.class);
            startActivity(i);
//            finish();
        }
        if(viewID == R.id.vitri){
            Intent i = new Intent(this,VitriActivity.class);
            startActivity(i);
        }
        if(viewID == R.id.cv){
            Intent i = new Intent(this, CongviecActivity.class);
            startActivity(i);
        }
    }
}