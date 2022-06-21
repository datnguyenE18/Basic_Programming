package com.example.a4listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        // Tạo ListView:
        final String[] students = {"Nam", "Lan", "Hoa", "Hanh", "Thanh",
                "Trung", "Son", "Dung", "Van", "Manh", "Thang"};

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1,
                        students);

        listView.setAdapter(adapter);

        // Bắt sự kiện khi  nhấn vào ListView:
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "position: " +
                        position + " - value: " + students[position], Toast.LENGTH_LONG
                ).show();
            }
        });

        // Đổi màu ActionBar:
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#6677B9")));
    }
}