package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class ShowVT extends AppCompatActivity {
    ListView lv1;
    Button btnAddVT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_vt);
        lv1 = findViewById(R.id.listVT);
        btnAddVT = findViewById(R.id.btnAddVT);
        btnAddVT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShowVT.this, AddViTri.class);
                startActivity(intent);
            }
        });
        LoadListVT();
    }

    protected void LoadListVT(){
        DatabaseHelper db1 = new DatabaseHelper(getBaseContext());
        final List<ViTri> list1 = db1.getAllViTri();
        ArrayAdapter<ViTri> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list1);
        lv1.setAdapter(adapter);
    }
}