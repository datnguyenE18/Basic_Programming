package com.example.iparking;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

import java.util.regex.Pattern;

public class ActivityD extends AppCompatActivity implements View.OnClickListener {

    private FirebaseAuth mAuth;

    private TextView dangkyngay,dangky;
    private EditText name1, tel1, email1, password1;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);

        mAuth = FirebaseAuth.getInstance();

        dangkyngay = (TextView) findViewById(R.id.dangkyngay);
        dangkyngay.setOnClickListener(this);

        dangky = (Button) findViewById(R.id.dangky);
        dangky.setOnClickListener(this);

        name1 = (EditText) findViewById(R.id.name);
        tel1 = (EditText) findViewById(R.id.tel);
        email1 = (EditText) findViewById(R.id.email1);
        password1 = (EditText) findViewById(R.id.password1);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.dangkyngay:
                startActivity(new Intent(this, ActivityB.class));
                break;
            case R.id.dangky:
                dangkytaikhoan();
                break;
        }
    }

    private void dangkytaikhoan() {
        String email = email1.getText().toString().trim();
        String password = password1.getText().toString().trim();
        String tel = tel1.getText().toString().trim();
        String name = name1.getText().toString().trim();

        if(name.isEmpty()){
            name1.setError("Vui lòng nhập tên");
            name1.requestFocus();
            return;
        }
        if(tel.isEmpty()){
            tel1.setError("Vui lòng nhập số điện thoại");
            tel1.requestFocus();
            return;
        }
        if(tel.length() < 9){
            password1.setError("Số điện thoại phải dài hơn 9 ký tự");
            password1.requestFocus();
            return;
        }
        if(email.isEmpty()){
            email1.setError("Vui lòng nhập email");
            email1.requestFocus();
            return;
        }

        if(password.isEmpty()){
            password1.setError("Vui lòng nhập mật khẩu");
            password1.requestFocus();
            return;
        }
        if(password.length() < 6){
            password1.setError("Mật khẩu phải dài hơn 6 ký tự");
            password1.requestFocus();
            return;
        }

        progressBar.setVisibility(View.VISIBLE);
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if(task.isSuccessful()) {
                            User user = new User(name,tel,email);

                            FirebaseDatabase.getInstance().getReference("Users")
                                    .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                    .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {

                                    if(task.isSuccessful()){
                                        Toast.makeText(ActivityD.this, "Đăng ký thành công",Toast.LENGTH_LONG).show();
                                        progressBar.setVisibility(View.GONE);

                                        //
                                    }else{
                                        Toast.makeText(ActivityD.this, "Đăng ký thất bại, thử lại", Toast.LENGTH_LONG).show();
                                        progressBar.setVisibility(View.GONE);
                                    }
                                }
                            });

                        }else{
                            Toast.makeText(ActivityD.this, "Đăng ký thất bại", Toast.LENGTH_LONG).show();
                            progressBar.setVisibility(View.GONE);
                        }
                    }
                });
    }
}