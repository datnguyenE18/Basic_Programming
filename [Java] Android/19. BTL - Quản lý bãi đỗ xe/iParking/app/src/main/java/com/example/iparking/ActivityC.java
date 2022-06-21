package com.example.iparking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ActivityC extends AppCompatActivity implements View.OnClickListener, ValueEventListener {

    private Button dangxuat, suathongtin, dangkyguixe, danhsachxe, layxera;
    private ProgressBar progressBar;
    private TextView txtname;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference().child("Users").child("pNKj9fJScJeQB8rfgYqH0E6Gc902").child("name1");

        databaseReference.addValueEventListener(this);

        danhsachxe = (Button) findViewById(R.id.danhsachxe);
        danhsachxe.setOnClickListener(this);

        dangxuat = (Button) findViewById(R.id.dangxuat);
        dangxuat.setOnClickListener(this);

        dangkyguixe = (Button) findViewById(R.id.dangkyguixe);
        dangkyguixe.setOnClickListener(this);

        suathongtin = (Button) findViewById(R.id.suathongtin);
        suathongtin.setOnClickListener(this);

        layxera = (Button) findViewById(R.id.layxera);
        layxera.setOnClickListener(this);

        txtname = (TextView) findViewById(R.id.txtname);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.dangxuat:
                startActivity(new Intent(ActivityC.this, ActivityB.class));
                break;

            case R.id.suathongtin:
                startActivity(new Intent(ActivityC.this, ActivityE.class));
                break;

            case R.id.danhsachxe:
                startActivity(new Intent(ActivityC.this, ActivityF.class));
                break;

            case R.id.dangkyguixe:
                startActivity(new Intent(ActivityC.this, ActivityG.class));
                break;
            case R.id.layxera:
                startActivity(new Intent(ActivityC.this, ActivityH.class));
                break;
        }
    }

    @Override
    public void onDataChange(DataSnapshot dataSnapshot) {
        Log.d("kiemtra", dataSnapshot.getValue().toString());
        txtname.setText(dataSnapshot.getValue().toString());
    }

    @Override
    public void onCancelled(DatabaseError databaseError) {

    }
}