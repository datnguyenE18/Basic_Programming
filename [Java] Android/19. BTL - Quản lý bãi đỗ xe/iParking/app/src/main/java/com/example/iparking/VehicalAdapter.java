package com.example.iparking;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VehicalAdapter extends RecyclerView.Adapter<VehicalAdapter.VehicalViewHolder>{

    private List<Vehical> mListVehicals;

    public VehicalAdapter(List<Vehical>mListVehical){
        this.mListVehicals = mListVehical;
    }

    @NonNull
    @Override
    public VehicalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_vehical, parent, false);
        return new VehicalViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull VehicalViewHolder holder, int position) {
        Vehical vehical = mListVehicals.get(position);
        if (vehical == null){
            return;
        }
        holder.tvhangxe.setText("Hang xe : " + vehical.getHangxe1());
        holder.tvbienso.setText("Bien so : " + vehical.getBienso1());
        holder.tvvitri.setText("Vi tri : " + vehical.getPlace1());
        holder.tvgiovao.setText("Gio vao : " + vehical.getTimestart1());
        holder.tvthoigiangui.setText("Thoi gian gui : "  + vehical.getTime1());
    }

    @Override
    public int getItemCount() {
        if (mListVehicals != null) {
            return mListVehicals.size();
        }
        return 0;
    }

    public class VehicalViewHolder extends RecyclerView.ViewHolder{

        private TextView tvhangxe, tvbienso, tvgiovao, tvthoigiangui, tvvitri;

        public VehicalViewHolder(@NonNull View itemView) {
            super(itemView);
            tvhangxe =itemView.findViewById(R.id.tv_hangxe);
            tvbienso =itemView.findViewById(R.id.tv_bienso);
            tvgiovao =itemView.findViewById(R.id.tv_giovao);
            tvvitri =itemView.findViewById(R.id.tv_vitri);
            tvthoigiangui =itemView.findViewById(R.id.tv_thoigiangui);
        }
    }
}
