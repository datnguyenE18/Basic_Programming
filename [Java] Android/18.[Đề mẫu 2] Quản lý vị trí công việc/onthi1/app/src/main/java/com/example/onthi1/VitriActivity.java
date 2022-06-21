package com.example.onthi1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.onthi1.adapter.ViTriAdapter;
import com.example.onthi1.db.DatabaseHelper;
import com.example.onthi1.model.ViTri;

import java.util.ArrayList;

public class VitriActivity extends AppCompatActivity implements View.OnClickListener{
    RecyclerView recyclerView;
    ViTriAdapter viTriAdapter;
    Button addVT;

    ArrayList<ViTri> vitriList;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitri);

        recyclerView = findViewById(R.id.recycler_view);

        db = new DatabaseHelper(this);
        setRecyclerView();

        addVT = findViewById(R.id.addVT);
        addVT.setOnClickListener(this);
    }


    private void setRecyclerView() {
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        vitriList = getList();
        viTriAdapter = new ViTriAdapter(this, vitriList);

        recyclerView.setAdapter(viTriAdapter);
    }

    private ArrayList<ViTri> getList() {
        return db.getAllVitri();
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.addVT){
//              ViTri vt = new ViTri("vitri1","mota1");
//              db.addViTri(vt);
                Intent i = new Intent(this, AddVitriActivity.class);
                startActivityForResult(i,1);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1){
            if (resultCode == RESULT_OK){
                String ten = data.getStringExtra("ten");
                String mota = data.getStringExtra("mota");

                ViTri vt = new ViTri(vitriList.size()+1,ten,mota);
                vitriList.add(vt);
                viTriAdapter.notifyDataSetChanged();
            }
        }
    }
}