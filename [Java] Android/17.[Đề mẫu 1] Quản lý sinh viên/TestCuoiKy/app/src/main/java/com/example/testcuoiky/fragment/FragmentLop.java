package com.example.testcuoiky.fragment;

import android.app.Dialog;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.testcuoiky.adapter.LopAdapter;
import com.example.testcuoiky.MainActivity;
import com.example.testcuoiky.R;
import com.example.testcuoiky.model.Lop;

import java.util.ArrayList;
import java.util.List;

public class FragmentLop extends Fragment {
    private View view;
    private ListView listViewLop;
    private List<Lop> listLop;
    private LopAdapter lopAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_lop,container,false);
        listViewLop = view.findViewById(R.id.listviewlop);
        getActivity().setTitle("List Class");

        listLop = new ArrayList<>();
        lopAdapter = new LopAdapter(getActivity(),R.layout.item_lop,listLop);
        listViewLop.setAdapter(lopAdapter);
        actiongetData();

        return view;
    }

    private void actiongetData() {
        listLop.clear();
        Cursor cursor =  MainActivity.sqlite.getData("SELECT * FROM Class");
        while (cursor.moveToNext()){
            int malop = cursor.getInt(0);
            String tenlop = cursor.getString(1);
            String mota = cursor.getString(2);
            listLop.add(new Lop(malop,tenlop,mota,"Danh sách SV"));
        }
        lopAdapter.notifyDataSetChanged();
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu,inflater);
        inflater.inflate(R.menu.item_toolbar_lop,menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.addlop) {
            DialogAddlop();
        }
        return true;
    }

    private void DialogAddlop() {
        Dialog dialog = new Dialog(getActivity());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_themlop);
        Button btnthem = dialog.findViewById(R.id.themlop);
        Button btnhuy = dialog.findViewById(R.id.huylop);
        EditText ten = dialog.findViewById(R.id.addtenlop);
        EditText mota = dialog.findViewById(R.id.addmota);

        btnhuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        btnthem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tenn = ten.getText().toString().trim();
                String motaa = mota.getText().toString().trim();
                if (tenn == null || motaa == null  || TextUtils.isEmpty(tenn) || TextUtils.isEmpty(motaa)){
                    Toast.makeText(getActivity(), "Bạn hãy kiểm tra lại thông tin", Toast.LENGTH_SHORT).show();
                    dialog.dismiss();
                    return;
                }else{
                    MainActivity.sqlite.QueryData("INSERT INTO Class VALUES (null,'"+ tenn +"','"+motaa+"')");
                    Toast.makeText(getActivity(),"Thêm thành công",Toast.LENGTH_SHORT).show();
                    dialog.dismiss();
                    actiongetData();
                }
            }
        });
        dialog.show();

    }
}
