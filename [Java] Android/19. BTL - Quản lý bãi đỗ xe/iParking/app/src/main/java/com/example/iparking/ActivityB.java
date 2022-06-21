package com.example.iparking;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class ActivityB extends AppCompatActivity implements View.OnClickListener {

    private TextView dangky, quenmatkhau;
    private EditText email2, password2;
    private Button dangnhap;

    private FirebaseAuth mAuth;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        dangky = (TextView)findViewById(R.id.dangky);
        dangky.setOnClickListener(this);

        quenmatkhau = (TextView)findViewById(R.id.quenmatkhau);
        quenmatkhau.setOnClickListener(this);

        dangnhap = (Button) findViewById(R.id.dangnhap);
        dangnhap.setOnClickListener(this);

        email2 = (EditText) findViewById(R.id.email2);
        password2 = (EditText)  findViewById(R.id.password2);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        mAuth = FirebaseAuth.getInstance();
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.dangky:
                startActivity(new Intent(this, ActivityD.class));
                break;

            case R.id.dangnhap:
                dangnhaptaikhoan();
        }
    }

    private void dangnhaptaikhoan() {
        String email = email2.getText().toString().trim();
        String password = password2.getText().toString().trim();

        if(email.isEmpty()){
            email2.setError("Vui lòng nhập tài khoản");
            email2.requestFocus();
            return;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            email2.setError("Vui lòng nhập tài khoản hợp lệ");
            email2.requestFocus();
            return;
        }
        if(password.isEmpty()){
            password2.setError("Vui lòng nhập mật khẩu");
            password2.requestFocus();
            return;
        }
        if(password.length() < 6){
            password2.setError("Mật khẩu phải dài hơn 6 kí tự");
            password2.requestFocus();
            return;
        }

        progressBar.setVisibility(View.VISIBLE);

        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if (task.isSuccessful()) {
                    startActivity(new Intent(ActivityB.this, ActivityC.class));
                }else{
                    Toast.makeText(ActivityB.this, "Đăng nhập thất bại", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}