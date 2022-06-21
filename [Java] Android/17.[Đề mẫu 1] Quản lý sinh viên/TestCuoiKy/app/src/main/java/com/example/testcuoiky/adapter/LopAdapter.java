package com.example.testcuoiky.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.testcuoiky.R;
import com.example.testcuoiky.StudentByClassActivity;
import com.example.testcuoiky.model.Lop;

import java.util.List;

public class LopAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Lop> listLop;

    public LopAdapter(Context context, int layout, List<Lop> listLop) {
        this.context = context;
        this.layout = layout;
        this.listLop = listLop;
    }

    @Override
    public int getCount() {
        return listLop.size();
    }

    @Override
    public Object getItem(int position) {
        return listLop.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class ViewHolder{
        TextView malop,tenlop,motalop,danhsachsv;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout,null);
            holder.malop = convertView.findViewById(R.id.malop);
            holder.tenlop = convertView.findViewById(R.id.tenlop);
            holder.motalop = convertView.findViewById(R.id.motalop);
            holder.danhsachsv = convertView.findViewById(R.id.dssinhvien);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        Lop lop = listLop.get(position);
        holder.malop.setText(lop.getMaLop()+"");
        holder.tenlop.setText(lop.getTenLop());
        holder.motalop.setText(lop.getMota());
        holder.danhsachsv.setText("Danh sách SV");
        holder.danhsachsv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, StudentByClassActivity.class);
                intent.putExtra("codeClass",lop.getMaLop() + "");
                intent.putExtra("nameClass",lop.getTenLop());
                context.startActivity(intent);
            }
        });
        return convertView;
    }
}
