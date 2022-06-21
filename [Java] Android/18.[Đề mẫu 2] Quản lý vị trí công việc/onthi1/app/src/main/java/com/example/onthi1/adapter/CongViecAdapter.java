package com.example.onthi1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.onthi1.R;
import com.example.onthi1.model.CongViec;
import com.example.onthi1.model.NhanVien;

import java.util.List;

public class CongViecAdapter extends RecyclerView.Adapter<CongViecAdapter.ViewHolder> {
    Context context;
    List<CongViec> cvList;

    public CongViecAdapter(Context context, List<CongViec> cvList) {
        this.context = context;
        this.cvList = cvList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.congviec_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if (cvList != null && cvList.size() > 0){
            CongViec cv = cvList.get(position);
            holder.tv_id.setText(String.valueOf(cv.getId()));
            holder.tv_maNV.setText(String.valueOf(cv.getIdNV()));
            holder.tv_maVT.setText(String.valueOf(cv.getIdVT()));
            holder.tv_time.setText(cv.getTime());
            holder.tv_mota.setText(cv.getMota());
        }
        else{
            return;
        }
    }

    @Override
    public int getItemCount() {
        return cvList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tv_id, tv_maNV, tv_maVT, tv_time, tv_mota;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_id = itemView.findViewById(R.id.tv_id);
            tv_maNV = itemView.findViewById(R.id.tv_maNV);
            tv_maVT = itemView.findViewById(R.id.tv_maVT);
            tv_time = itemView.findViewById(R.id.tv_time);
            tv_mota = itemView.findViewById(R.id.tv_mota);
        }
    }
}
