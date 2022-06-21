package com.example.onthi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.onthi1.db.DatabaseHelper;
import com.example.onthi1.model.ViTri;

public class AddVitriActivity extends AppCompatActivity {
    DatabaseHelper db;
    EditText ten_et,mota_et;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_vitri);

        db = new DatabaseHelper(this);
        ten_et = findViewById(R.id.ten_et);
        mota_et = findViewById(R.id.mota_et);

        btnAdd = findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ten = ten_et.getText().toString();
                String mota = mota_et.getText().toString();

                long result = db.addViTri(new ViTri(ten,mota));

                if (result != -1){
                    Intent i = new Intent();
                    i.putExtra("ten",ten);
                    i.putExtra("mota",mota);

                    setResult(RESULT_OK,i);
                    finish();
                }
            }
        });
    }
}