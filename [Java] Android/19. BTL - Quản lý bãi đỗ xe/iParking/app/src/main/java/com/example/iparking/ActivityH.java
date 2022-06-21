package com.example.iparking;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class ActivityH extends AppCompatActivity implements View.OnClickListener {
    private RecyclerView rcvVehicals1;

    private VehicalAdapter1 mVehicalAdapter1;

    private List<Vehical> mListVehicals1;

    private Button timxe;

    private EditText biensoxera;

    private TextView thanhtoantien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h);

        biensoxera =(EditText) findViewById(R.id.biensoxera);
        thanhtoantien=(TextView) findViewById(R.id.thanhtoantien);

        timxe= (Button)findViewById(R.id.timxe);
        timxe.setOnClickListener(this);

        rcvVehicals1 = findViewById(R.id.rcv_vehicals1);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcvVehicals1.setLayoutManager(linearLayoutManager);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        rcvVehicals1.addItemDecoration(dividerItemDecoration);

        mListVehicals1 = new ArrayList<>();
        mVehicalAdapter1 = new VehicalAdapter1(mListVehicals1);

        rcvVehicals1.setAdapter(mVehicalAdapter1);
    }

    @Override
    public void onClick(View view) {
        String key = biensoxera.getText().toString().trim();
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Users").child("pNKj9fJScJeQB8rfgYqH0E6Gc902").child("ticket1");

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot dataSnapshot : snapshot.getChildren()){
                    Vehical vehical = dataSnapshot.getValue(Vehical.class);
                    if(vehical.getBienso1().contains(key)) {
                        mListVehicals1.add(vehical);
                        mVehicalAdapter1.notifyDataSetChanged();
                        int x = vehical.getTime1();
                        int y = x*20000;
                        String z = String.valueOf(y);
                        thanhtoantien.setText(z + " vnd");
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ActivityH.this, "Loi khong lay duoc du lieu", Toast.LENGTH_SHORT).show();
            }
        });
    }
}