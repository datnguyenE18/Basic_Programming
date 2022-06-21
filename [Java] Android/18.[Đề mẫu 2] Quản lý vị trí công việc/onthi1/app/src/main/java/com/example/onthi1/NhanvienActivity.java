package com.example.onthi1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.onthi1.adapter.NhanVienAdapter;
import com.example.onthi1.db.DatabaseHelper;
import com.example.onthi1.model.NhanVien;

import java.util.ArrayList;

public class NhanvienActivity extends AppCompatActivity implements View.OnClickListener{
    RecyclerView recyclerView;
    NhanVienAdapter nhanVienAdapter;
    Button themnv;
    ArrayList<NhanVien> nvList;

    DatabaseHelper mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhanvien);

        recyclerView = findViewById(R.id.recycler_view);
        themnv = findViewById(R.id.themnv);
        themnv.setOnClickListener(this);

        mydb = new DatabaseHelper(NhanvienActivity.this);

        setRecyclerView();
    }

    private void setRecyclerView() {
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        nvList = getList();
        nhanVienAdapter = new NhanVienAdapter(this, nvList);

        recyclerView.setAdapter(nhanVienAdapter);
    }

    private ArrayList<NhanVien> getList() {
        ArrayList<NhanVien> list = mydb.getAllNhanVien();

//        list.add(new NhanVien(1,2000,"Nguyen Van A","HN","CD"));
//        list.add(new NhanVien(2,2000,"Nguyen Van A","HN","CD"));
//        list.add(new NhanVien(3,2000,"Nguyen Van A","HN","CD"));
//        list.add(new NhanVien(4,2000,"Nguyen Van A","HN","CD"));
//        list.add(new NhanVien(5,2000,"Nguyen Van A","HN","CD"));
//        list.add(new NhanVien(6,2000,"Nguyen Van A","HN","CD"));
//        list.add(new NhanVien(7,2000,"Nguyen Van A","HN","CD"));
//        list.add(new NhanVien(8,2000,"Nguyen Van A","HN","CD"));
//        list.add(new NhanVien(9,2000,"Nguyen Van A","HN","CD"));
//        list.add(new NhanVien(10,2000,"Nguyen Van A","HN","CD"));
//        list.add(new NhanVien(11,2000,"Nguyen Van A","HN","CD"));
//        list.add(new NhanVien(12,2000,"Nguyen Van A","HN","CD"));
//        list.add(new NhanVien(13,2000,"Nguyen Van A","HN","CD"));
//        list.add(new NhanVien(14,2000,"Nguyen Van A","HN","CD"));
//        list.add(new NhanVien(15,2000,"Nguyen Van A","HN","CD"));

        return list;
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == themnv.getId()){
//            mydb.addNhanVien(new NhanVien(2000,"Nguyen Van A","HN","CD"));
            Intent i = new Intent(this, AddNhanvienActivity.class);
            startActivityForResult(i,1);

        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==1){
            if (resultCode == RESULT_OK) {
                int namsinh = data.getIntExtra("namsinh",0);
                String ten = data.getStringExtra("ten");
                String que = data.getStringExtra("quequan");
                String trinh = data.getStringExtra("trinhdo");

                NhanVien nv = new NhanVien(nvList.size()+1,namsinh,ten,que,trinh);
                nvList.add(nv);
                nhanVienAdapter.notifyDataSetChanged();
            }
        }
    }
}