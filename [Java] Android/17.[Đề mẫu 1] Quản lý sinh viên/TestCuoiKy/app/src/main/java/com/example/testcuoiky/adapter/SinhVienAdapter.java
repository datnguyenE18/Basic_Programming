package com.example.testcuoiky.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.testcuoiky.R;
import com.example.testcuoiky.model.SinhVien;

import java.util.List;

public class SinhVienAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<SinhVien> listSinhVien;

    public SinhVienAdapter(Context context, int layout, List<SinhVien> listSinhVien) {
        this.context = context;
        this.layout = layout;
        this.listSinhVien = listSinhVien;
    }

    @Override
    public int getCount() {
        return listSinhVien.size();
    }
    @Override
    public Object getItem(int position) {
        return  listSinhVien.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    private class ViewHolder{
        TextView masinhvien,tensinhvien,ngaysinh,quequan,namhoc;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout,null);
            holder.masinhvien = convertView.findViewById(R.id.masinhvien);
            holder.tensinhvien = convertView.findViewById(R.id.tensinhvien);
            holder.ngaysinh = convertView.findViewById(R.id.ngaysinh);
            holder.quequan = convertView.findViewById(R.id.quequan);
            holder.namhoc = convertView.findViewById(R.id.namhoc);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        SinhVien sinhVien = listSinhVien.get(position);
        holder.masinhvien.setText(sinhVien.getMasinhvien()+"");
        holder.tensinhvien.setText(sinhVien.getTensinhvien());
        holder.ngaysinh.setText(sinhVien.getNgaysinh());
        holder.quequan.setText(sinhVien.getQuequan());
        holder.namhoc.setText(sinhVien.getNamhoc());
        return convertView;
    }
}
