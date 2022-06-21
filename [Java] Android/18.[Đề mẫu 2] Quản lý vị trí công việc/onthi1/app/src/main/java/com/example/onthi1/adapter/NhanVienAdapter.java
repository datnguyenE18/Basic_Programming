package com.example.onthi1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.onthi1.R;
import com.example.onthi1.model.NhanVien;

import java.util.List;

public class NhanVienAdapter extends RecyclerView.Adapter<NhanVienAdapter.ViewHolder> {
    Context context;
    List<NhanVien> nhanVienList;

    public NhanVienAdapter(Context context, List<NhanVien> nhanVienList) {
        this.context = context;
        this.nhanVienList = nhanVienList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.nhanvien_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if(nhanVienList != null && nhanVienList.size() > 0){
            NhanVien nv = nhanVienList.get(position);

            holder.id_tv.setText(String.valueOf(nv.getId()));
            holder.ten_tv.setText(nv.getTen());
            holder.namsinh_tv.setText(String.valueOf(nv.getNamSinh()));
            holder.que_tv.setText(nv.getQue());
            holder.trinhdo_tv.setText(nv.getTrinhdo());
        }
        else{
            return;
        }
    }

    @Override
    public int getItemCount() {
        return nhanVienList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView id_tv,ten_tv,namsinh_tv,que_tv,trinhdo_tv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            id_tv = itemView.findViewById(R.id.id_tv);
            ten_tv = itemView.findViewById(R.id.ten_tv);
            namsinh_tv = itemView.findViewById(R.id.namsinh_tv);
            que_tv = itemView.findViewById(R.id.que_tv);
            trinhdo_tv = itemView.findViewById(R.id.trinhdo_tv);

        }
    }
}
