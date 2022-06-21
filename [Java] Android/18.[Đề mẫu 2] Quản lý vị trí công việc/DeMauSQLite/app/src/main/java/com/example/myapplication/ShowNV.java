package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class ShowNV extends AppCompatActivity {
    ListView lv1;
    Button btnAddNV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_nv);
        lv1 = findViewById(R.id.listNV);
        btnAddNV = findViewById(R.id.btnAddNV);
        btnAddNV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShowNV.this, AddNhanVien.class);
                startActivity(intent);
            }
        });
        LoadListNV();
    }

    protected void LoadListNV(){
        DatabaseHelper db1 = new DatabaseHelper(getBaseContext());
        final List<NhanVien> list1 = db1.getAllNhanVien();
        ArrayAdapter<NhanVien> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list1);
        lv1.setAdapter(adapter);
    }
}