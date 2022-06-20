package com.example.a2explicitintent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Declare:
    EditText edtName;
    Button btnWelc;
    Button btnSur;
    TextView txtSur;
    final int MY_REQUEST_CODE = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // FIND VIEW:
        edtName = findViewById(R.id.edtName);
        btnWelc = findViewById(R.id.btnWelc);
        btnSur = findViewById(R.id.btnSur);
        txtSur = findViewById(R.id.txtSur);

        // CHỨC NĂNG:

        // Nút chào mừng:
        btnWelc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtName.getText().toString().length() == 0) {
                    Toast.makeText(MainActivity.this, "Điền tên của bạn", Toast.LENGTH_SHORT).show();
                } else {
                    String name = edtName.getText().toString();

                    // Khai báo Intent:
                    Intent intent = new Intent();

                    // Gán context và tên lớp Activity cần chạy:
                    intent.setClass(MainActivity.this, Welcome.class);

                    // Các dữ liệu gửi kèm:
                    intent.putExtra("toWelcome", name);

                    // start Activity chỉ định trong Intent
                    // (Không cần phản hồi từ Activity được gọi)
                    startActivity(intent);
                }
            }
        });

        // Nút hiển thị Surname:
        btnSur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Khai báo và chuyển --> viết gộp:
                Intent intent = new Intent(MainActivity.this, Surname.class);

                // Yêu cầu start Activity và sẽ có phản hồi từ Activity được gọi
                // Start DetailActivity với request code
                startActivityForResult(intent, MY_REQUEST_CODE);
            }
        });

        // ActionBar Config:
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#6677B9")));
    }

    // Nhận và hiển thị dữ liệu từ Surname:
    @Override
    protected void onActivityResult(int reqestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(reqestCode, resultCode, data);

        if (reqestCode == MY_REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                txtSur.setText(data.getStringExtra("surName"));
            } else if (resultCode == RESULT_CANCELED) {
                txtSur.setText("Nothing Data");
            }
        }
    }
}