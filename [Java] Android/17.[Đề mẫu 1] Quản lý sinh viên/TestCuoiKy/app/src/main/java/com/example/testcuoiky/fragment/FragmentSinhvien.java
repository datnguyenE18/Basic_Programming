package com.example.testcuoiky.fragment;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.testcuoiky.MainActivity;
import com.example.testcuoiky.R;
import com.example.testcuoiky.adapter.SinhVienAdapter;
import com.example.testcuoiky.model.SinhVien;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class FragmentSinhvien extends Fragment {

    private View view;
    private ListView listViewSinhVien;
    Spinner spinnerSinhVien;
    private List<SinhVien> listSinhVien;
    private SinhVienAdapter sinhVienAdapter;
    int vitri = 0;
    String sql = null;
    int vitrithemsinhvien = 0;
    ArrayList<String> listTitle = null;
    DatePickerDialog.OnDateSetListener listener;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu,inflater);
        inflater.inflate(R.menu.item_toolbar_sinhvien,menu);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_sinhvien,container,false);
        listViewSinhVien = view.findViewById(R.id.listviewSinhVien);
        spinnerSinhVien = view.findViewById(R.id.spinnerSinhVien);
        getActivity().setTitle("List Student");

        spinner();


        return view;
    }

    private void spinner() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Tất cả sinh viên");
        list.add("Tên Nam học năm 2");
        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item,list);
        spinnerSinhVien.setAdapter(arrayAdapter);

        spinnerSinhVien.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                vitri = position;
                listSinhVien = new ArrayList<>();
                sinhVienAdapter = new SinhVienAdapter(getActivity(),R.layout.item_sinhvien,listSinhVien);
                listViewSinhVien.setAdapter(sinhVienAdapter);
                actionGetData();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

    private void actionGetData() {
        listSinhVien.clear();
        if (vitri == 0){
            sql = "SELECT * FROM Student";
        }else{
            sql = "SELECT * FROM Student WHERE name = 'Nam' AND schoolYear = 'Nam hai'";
        }
        Cursor cursor =  MainActivity.sqlite.getData(sql);
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

    public void DialogAddStudent(){
        Dialog dialog = new Dialog(getActivity());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_themsinhvien);
        Button btnthem = dialog.findViewById(R.id.themsv);
        Button btnhuy = dialog.findViewById(R.id.huysv);
        EditText ten = dialog.findViewById(R.id.addten);
        EditText namsinh = dialog.findViewById(R.id.addnamsinh);
        EditText quequan = dialog.findViewById(R.id.addquequan);
        Spinner snnamhoc = dialog.findViewById(R.id.spinnerStudent);
        listTitle = new ArrayList<>();
        listTitle.add("Nam nhat");
        listTitle.add("Nam hai");
        listTitle.add("Nam ba");
        listTitle.add("Nam bon");
        ArrayAdapter adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item,listTitle);
        snnamhoc.setAdapter(adapter);
        snnamhoc.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                vitrithemsinhvien = position;
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        Calendar calendar = Calendar.getInstance();
        final  int year = calendar.get(Calendar.YEAR);
        final  int month = calendar.get(Calendar.MONTH);
        final  int day = calendar.get(Calendar.DAY_OF_MONTH);

        namsinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar1 = Calendar.getInstance();
                int year = calendar1.get(Calendar.YEAR);
                DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
                        namsinh.setText(simpleDateFormat.format(calendar.getTime()));
                    }
                },year-18,01,01);
                datePickerDialog.show();
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
                String tenn  = ten.getText().toString().trim();
                String namsinhh = namsinh.getText().toString().trim();
                String quequann = quequan.getText().toString().trim();
//                String namhocc = namhoc.getText().toString().trim();
                String namhocc = listTitle.get(vitrithemsinhvien);
                if (tenn == null || namsinh == null || quequann == null  ||
                        TextUtils.isEmpty(tenn)|| TextUtils.isEmpty(namsinhh)||TextUtils.isEmpty(quequann)){
                    Toast.makeText(getActivity(), "Bạn hãy kiểm tra lại thông tin", Toast.LENGTH_SHORT).show();
                    dialog.dismiss();
                    return;
                }else{
                    MainActivity.sqlite.QueryData("INSERT INTO Student VALUES (null,'"+ tenn +"','"+namsinhh+"','"+quequann+"','"+namhocc+"')");
                    Toast.makeText(getActivity(),"Thêm thành công",Toast.LENGTH_SHORT).show();
                    dialog.dismiss();
                    actionGetData();

                }
            }
        });
        dialog.show();
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.addsinhvien) {
            DialogAddStudent();
        }
        return true;
    }
}
