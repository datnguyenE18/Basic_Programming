package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddViTri extends AppCompatActivity {
    Button btnAddVT;
    EditText editAddId, editAddName, editAddDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_vi_tri);

        btnAddVT = findViewById(R.id.btnAddVT);
        editAddId = findViewById(R.id.edtAddID);
        editAddName = findViewById(R.id.editAddName);
        editAddDescription = findViewById(R.id.editAddDescription);

        btnAddVT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseHelper db1 = new DatabaseHelper(getBaseContext());
                String vtName = editAddName.getText().toString();
                String vtDescription = editAddDescription.getText().toString();
                ViTri vitri = new ViTri(vtName, vtDescription);

                db1.addVT(vitri);

                editAddName.setText("");
                editAddDescription.setText("");
            }
        });
    }
}