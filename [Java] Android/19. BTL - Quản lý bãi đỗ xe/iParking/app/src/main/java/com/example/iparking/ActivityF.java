package com.example.iparking;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class ActivityF extends AppCompatActivity implements View.OnClickListener{

    private RecyclerView rcvVehicals;

    private VehicalAdapter mVehicalAdapter;

    private List<Vehical> mListVehicals;

    private Button hienthidanhsachxe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f);

        hienthidanhsachxe= (Button)findViewById(R.id.hienthidanhsachxe);
        hienthidanhsachxe.setOnClickListener(this);

        rcvVehicals = findViewById(R.id.rcv_vehicals);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcvVehicals.setLayoutManager(linearLayoutManager);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        rcvVehicals.addItemDecoration(dividerItemDecoration);

        mListVehicals = new ArrayList<>();
        mVehicalAdapter = new VehicalAdapter(mListVehicals);

        rcvVehicals.setAdapter(mVehicalAdapter);
    }

    @Override
    public void onClick(View view) {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Users").child("pNKj9fJScJeQB8rfgYqH0E6Gc902").child("ticket1");

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot dataSnapshot : snapshot.getChildren()){
                    Vehical vehical = dataSnapshot.getValue(Vehical.class);
                    mListVehicals.add(vehical);
                }
                mVehicalAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ActivityF.this, "Loi khong lay duoc du lieu", Toast.LENGTH_SHORT).show();
            }
        });
    }
}