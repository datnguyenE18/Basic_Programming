package com.example.iparking;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VehicalAdapter1 extends RecyclerView.Adapter<VehicalAdapter1.VehicalViewHolder1> {

    private List<Vehical> mListVehicals1;

    public VehicalAdapter1(List<Vehical>mListVehical1){ this.mListVehicals1 = mListVehical1; }

    @NonNull
    @Override
    public VehicalAdapter1.VehicalViewHolder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_vehical1, parent, false);
        return new VehicalAdapter1.VehicalViewHolder1(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull VehicalViewHolder1 holder, int position) {
        Vehical vehical = mListVehicals1.get(position);
        if (vehical == null){
            return;
        }
        holder.tvhangxe1.setText("Hang xe : " + vehical.getHangxe1());
        holder.tvbienso1.setText("Bien so : " + vehical.getBienso1());
        holder.tvvitri1.setText("Vi tri : " + vehical.getPlace1());
        holder.tvgiovao1.setText("Gio vao : " + vehical.getTimestart1());
        holder.tvthoigiangui1.setText("Thoi gian gui : "  + vehical.getTime1());
    }

    @Override
    public int getItemCount() {
        if (mListVehicals1 != null) {
            return mListVehicals1.size();
        }
        return 0;
    }

    public class VehicalViewHolder1 extends RecyclerView.ViewHolder{

        private TextView tvhangxe1, tvbienso1, tvgiovao1, tvthoigiangui1, tvvitri1;

        public VehicalViewHolder1(@NonNull View itemView) {
            super(itemView);
            tvhangxe1 =itemView.findViewById(R.id.tv_hangxe1);
            tvbienso1=itemView.findViewById(R.id.tv_bienso1);
            tvgiovao1 =itemView.findViewById(R.id.tv_giovao1);
            tvvitri1 =itemView.findViewById(R.id.tv_vitri1);
            tvthoigiangui1 =itemView.findViewById(R.id.tv_thoigiangui1);
        }
    }
}
