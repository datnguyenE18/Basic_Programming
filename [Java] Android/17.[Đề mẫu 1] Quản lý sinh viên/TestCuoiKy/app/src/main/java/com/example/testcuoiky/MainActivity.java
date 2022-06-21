package com.example.testcuoiky;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.testcuoiky.fragment.FragmentLop;
import com.example.testcuoiky.fragment.FragmentSinhvien;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    public static Sqlite sqlite ;
    private BottomNavigationView bottomNavigationView;
    private Fragment selectedFragment = null;
    private Fragment fragmentSinhvien;
    private Fragment fragmentLophoc;
    private Fragment fragmentSinhvienTheoLop;
    private int currentSelectedItemId = R.id.sinhvien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottomNavigation);
        fragmentSinhvien = new FragmentSinhvien();
        fragmentLophoc = new FragmentLop();
        sqlite = new Sqlite(MainActivity.this, "TestCuoiKy.sqlite", null, 1);
        sqlite.QueryData("CREATE TABLE IF NOT EXISTS Student(code INTEGER PRIMARY KEY AUTOINCREMENT,name VARCHAR(200),yearOfBirth VARCHAR(200),homeTown VARCHAR(200),schoolYear VARCHAR(200))");
        sqlite.QueryData("CREATE TABLE IF NOT EXISTS Class(code INTEGER PRIMARY KEY AUTOINCREMENT,name VARCHAR(200),described VARCHAR(200))");
        sqlite.QueryData("CREATE TABLE IF NOT EXISTS StudentByClass(studentcode INT NOT NULL,classcode INT NOT NULL,semester VARCHAR(200),credits INT NOT NULL,PRIMARY KEY (studentcode, classcode))");

//      sqlite.QueryData("INSERT INTO StudentByClass VALUES (1,1,'Hoc ky 2',3)");
//      sqlite.QueryData("INSERT INTO Class VALUES (null,'CNPM1','Lop Chon 1')");
//      Cursor cursor =  sqlite.getData("SELECT * FROM StudentByClass");
//      while (cursor.moveToNext()){
//          String ten = cursor.getString(1);
//          Toast.makeText(MainActivity.this,ten,Toast.LENGTH_SHORT).show();
//      }
        fragmentSelector();
    }

    private void fragmentSelector() {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_layout,fragmentSinhvien).commit();
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.sinhvien:
                        selectedFragment = fragmentSinhvien;
                        break;
                    case R.id.lophoc:
                        selectedFragment = fragmentLophoc;
                        break;
                }
                if(currentSelectedItemId != item.getItemId()) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_layout,selectedFragment).commit();
                }
                currentSelectedItemId = item.getItemId();
                return true;
            }
        });
    }
}