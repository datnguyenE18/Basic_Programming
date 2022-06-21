package com.example.onthi1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.onthi1.R;
import com.example.onthi1.model.ViTri;

import java.util.List;

public class ViTriAdapter extends RecyclerView.Adapter<ViTriAdapter.ViewHolder>{
    Context context;
    List<ViTri> vitriList;

    public ViTriAdapter(Context context, List<ViTri> vitriList) {
        this.context = context;
        this.vitriList = vitriList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.vitri_layout, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if (vitriList != null && vitriList.size() > 0){
            ViTri vt = vitriList.get(position);

            holder.tv_id.setText(String.valueOf(vt.getId()));
            holder.tv_ten.setText(vt.getTen());
            holder.tv_mota.setText(vt.getMota());
        }
        else{
            return;
        }
    }

    @Override
    public int getItemCount() {
        return vitriList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tv_id, tv_ten, tv_mota;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_id = itemView.findViewById(R.id.tv_id);
            tv_ten = itemView.findViewById(R.id.tv_ten);
            tv_mota = itemView.findViewById(R.id.tv_mota);

        }
    }
}
