package com.example.testcuoiky;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.testcuoiky.adapter.SinhVienAdapter;
import com.example.testcuoiky.model.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class StudentByClassActivity extends AppCompatActivity {

    ListView lvstudentbyclass;
    List<SinhVien> listSinhVien;
    SinhVienAdapter sinhVienAdapter ;
    String codeClass = null;
    String nameClass = null;
    ArrayList<Integer> listIdSv = null;
    Spinner spinner = null;
    int vitri = 0;
    int vitrispinner = 0;
    String sql = null;
    TextView total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_by_class);
        lvstudentbyclass = findViewById(R.id.lvStudentByClass);
        spinner = findViewById(R.id.spinnerStudentByClass);
        total = findViewById(R.id.total);
        codeClass = getIntent().getStringExtra("codeClass");
        nameClass = getIntent().getStringExtra("nameClass");

        getSupportActionBar().setTitle("List Student By Class " + nameClass);
        ArrayList<String> list = new ArrayList<>();
        list.add("Tất cả sinh viên trong lớp");
        list.add("Thống kê sinh viên trong lớp");
        ArrayAdapter arrayAdapter = new ArrayAdapter(StudentByClassActivity.this, android.R.layout.simple_spinner_item,list);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                vitrispinner = position;
                actionGetData();
                total.setText("Total : " + listSinhVien.size());
                if (vitrispinner == 1){
                    total.setVisibility(View.VISIBLE);
                }else{
                    total.setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        listSinhVien = new ArrayList<>();
        sinhVienAdapter = new SinhVienAdapter(StudentByClassActivity.this,R.layout.item_sinhvien,listSinhVien);
        lvstudentbyclass.setAdapter(sinhVienAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.item_toolbar_sinhvientheolop,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.addstudentbyclass) {
            DialogAddStudentByClass();
        }
        return true;
    }

    private void DialogAddStudentByClass() {
            Dialog dialog = new Dialog(StudentByClassActivity.this);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setContentView(R.layout.dialog_themsinhvienvaolop);
            Button btnthem = dialog.findViewById(R.id.themsvvaolop);
            Button btnhuy = dialog.findViewById(R.id.huysvvaolop);
            Spinner spinner = dialog.findViewById(R.id.spinner);

            getDataListIdStudent();
            ArrayAdapter arrayAdapter = new ArrayAdapter(StudentByClassActivity.this, android.R.layout.simple_spinner_item,listIdSv);
            spinner.setAdapter(arrayAdapter);
            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    vitri = position;
                }
                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            btnhuy.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                }
            });
            btnthem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        MainActivity.sqlite.QueryData("INSERT INTO StudentByClass VALUES ("+listIdSv.get(vitri)+","+ codeClass +",'Hoc ky 2',3)");
                        Toast.makeText(StudentByClassActivity.this,"Thêm thành công",Toast.LENGTH_SHORT).show();
                    }catch (SQLiteConstraintException e){
                        Toast.makeText(StudentByClassActivity.this,"Sinh viên này  đã có sẵn trong danh sách",Toast.LENGTH_SHORT).show();
                    }
                    dialog.dismiss();
                    actionGetData();
//
                }
            });
            dialog.show();
    }

    private void getDataListIdStudent(){
        listIdSv = new ArrayList<>();
        Cursor cursor =  MainActivity.sqlite.getData("SELECT * FROM Student");
        while (cursor.moveToNext()){
            int masinhvien = cursor.getInt(0);
            listIdSv.add(masinhvien);
        }
    }
    private void actionGetData() {
        listSinhVien.clear();
        if (vitrispinner == 0) {
            sql = "SELECT Student.* FROM StudentByClass,Student,Class WHERE StudentByClass.studentcode = Student.code AND StudentByClass.classcode = Class.code AND Class.code =" + codeClass + "";
        }else {
            sql = "SELECT Student.* FROM StudentByClass,Student,Class WHERE StudentByClass.studentcode = Student.code AND StudentByClass.classcode = Class.code AND Class.code =" + codeClass + " ORDER BY code DESC";
        }
        Cursor cursor = MainActivity.sqlite.getData(sql);

        while (cursor.moveToNext()){
            int masinhvien = cursor.getInt(0);
            String ten = cursor.getString(1);
            String ngaysinh = cursor.getString(2);
            String quequan = cursor.getString(3);
            String namhoc = cursor.getString(4);
            listSinhVien.add(new SinhVien(masinhvien,ten,ngaysinh,quequan,namhoc));
        }
        sinhVienAdapter.notifyDataSetChanged();
    }
}