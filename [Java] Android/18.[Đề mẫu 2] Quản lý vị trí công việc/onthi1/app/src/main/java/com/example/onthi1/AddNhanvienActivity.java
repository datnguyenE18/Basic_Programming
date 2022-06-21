package com.example.onthi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.onthi1.db.DatabaseHelper;
import com.example.onthi1.model.NhanVien;

public class AddNhanvienActivity extends AppCompatActivity {

    Button btnAdd;
    DatabaseHelper mydb;
    EditText ten_et,namsinh_et,trinhdo_et,quequan_et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_nhanvien);

        mydb = new DatabaseHelper(this);

        ten_et = findViewById(R.id.ten_et);
        namsinh_et = findViewById(R.id.namsinh_et);
        trinhdo_et = findViewById(R.id.trinhdo_et);
        quequan_et = findViewById(R.id.que_et);

        btnAdd = findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int namsinh = Integer.valueOf(namsinh_et.getText().toString());
                String ten = ten_et.getText().toString();
                String que = quequan_et.getText().toString();
                String trinhdo = trinhdo_et.getText().toString();
//                System.out.println(ten+namsinh+que+trinhdo);
                NhanVien nv = new NhanVien(namsinh,ten,que,trinhdo);
                if (mydb.addNhanVien(nv) != -1){
                    Intent resultIntent = new Intent();
                    resultIntent.putExtra("namsinh",nv.getNamSinh());
                    resultIntent.putExtra("ten",nv.getTen());
                    resultIntent.putExtra("quequan",nv.getQue());
                    resultIntent.putExtra("trinhdo",nv.getTrinhdo());

                    setResult(RESULT_OK, resultIntent);
                    finish();
                };
            }
        });
    }
}