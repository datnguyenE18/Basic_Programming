package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class AddNhanVien extends AppCompatActivity {
    Button btnAddNV1;
    EditText editAddId, editAddName, editAddYear, editAddQue;
    Spinner editAddDeg;
    private static final String[] options = {"Cao Dang", "Dai Hoc", "Sau Dai Hoc"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_nhan_vien);

        btnAddNV1 = findViewById(R.id.btnAddNV1);
        editAddId = findViewById(R.id.edtAddID);
        editAddName = findViewById(R.id.editAddName);
        editAddYear = findViewById(R.id.editAddYear);
        editAddQue = findViewById(R.id.editAddQue);
        editAddDeg = findViewById(R.id.editAddDeg);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, options);
        editAddDeg.setAdapter(adapter);

        btnAddNV1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseHelper db1 = new DatabaseHelper(getBaseContext());
                String nvName = editAddName.getText().toString();
                String nvYear = editAddYear.getText().toString();
                String nvQue = editAddQue.getText().toString();
                String nvDeg = editAddDeg.getSelectedItem().toString();
                NhanVien nhanVien = new NhanVien(nvName, nvYear, nvQue, nvDeg);

                db1.addNV(nhanVien);

                editAddName.setText("");
                editAddYear.setText("");
                editAddQue.setText("");
            }
        });
    }
}