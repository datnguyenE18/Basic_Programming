package com.example.a2explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Surname extends AppCompatActivity {

    Button btnSave, btnCan;
    EditText edtSur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.surname);

        // Tìm View:
        btnSave = findViewById(R.id.btnSave);
        btnCan = findViewById(R.id.btnCan);
        edtSur = findViewById(R.id.edtSur);

        // Chức năng:

        // Nút LƯU:
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtSur.getText().toString().length() == 0) {
                    Toast.makeText(Surname.this, "Điền tên Họ của bạn", Toast.LENGTH_SHORT).show();
                } else {
                    String surname = edtSur.getText().toString();

                    // Khai báo Intent
                    // Tạo một Intent mới để chứa dữ liệu trả về
                    Intent intent = new Intent();

                    // Truyền data vào intent
                    // Đính kèm dữ liệu:
                    intent.putExtra("surName", surname);

                    // Đặt resultCode là RESULT_OK để
                    // thể hiện đã thành công và có chứa kết quả trả về
                    setResult(RESULT_OK, intent);

                    // gọi hàm finish() để đóng Activity hiện tại và trở về MainActivity.
                    // Surname.this.finish();
                    finish();
                }
            }
        });

        // Nút HỦY:
        btnCan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // đặt resultCode là RESULT_CANCELED thể hiện
                // đã thất bại khi người dùng click vào nút HỦY.
                // Khi này sẽ không trả về data.
                setResult(RESULT_CANCELED);
                finish();
            }
        });

        // ActionBar Config:
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#6677B9")));
    }
}