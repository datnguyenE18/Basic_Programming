package com.example.onthi1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.onthi1.adapter.CongViecAdapter;
import com.example.onthi1.db.DatabaseHelper;
import com.example.onthi1.model.CongViec;

import java.util.ArrayList;

public class CongviecActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnAdd;
    RecyclerView recyclerView;

    //adapter
    CongViecAdapter adapter;

    //list + db
    ArrayList<CongViec> cvList;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congviec);

        //khoi tao components
        btnAdd = findViewById(R.id.addCV);
        btnAdd.setOnClickListener(this);
        recyclerView = findViewById(R.id.recycler_view);

        //db
        db = new DatabaseHelper(this);

        //set RV
        setRecyclerView();
    }

    private void setRecyclerView() {
        //init
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //get list
        cvList = getList();

        //adapter
        adapter = new CongViecAdapter(this, cvList);
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<CongViec> getList() {
        ArrayList<CongViec> list = db.getAllCongviec();
        return list;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.addCV) {
            CongViec cv = new CongViec(1,1,null,"mota1");
            long res = db.addCongViec(cv);
        }
    }
}