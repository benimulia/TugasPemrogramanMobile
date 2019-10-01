package com.example.proteintracker.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proteintracker.Model.MahasiswaKu;
import com.example.proteintracker.R;

import java.util.ArrayList;

public class MahasiswaKuAdapter extends RecyclerView.Adapter<MahasiswaKuAdapter.ViewHolder> {

    public MahasiswaKuAdapter(ArrayList<MahasiswaKu> mahasiswaKuArrayList) {
        this.mahasiswaKuArrayList = mahasiswaKuArrayList;
    }

    private ArrayList<MahasiswaKu> mahasiswaKuArrayList;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_view_mhsku,parent,false); //
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) { //gunanya utk memasukkan data
        holder.txtNamaku.setText(mahasiswaKuArrayList.get(position).getNamaku());
        holder.txtNimku.setText(mahasiswaKuArrayList.get(position).getNimku());
        holder.txtCita.setText(mahasiswaKuArrayList.get(position).getCita());
        holder.txtMotoHidup.setText(mahasiswaKuArrayList.get(position).getMotohidup());
        holder.txtHobi.setText(mahasiswaKuArrayList.get(position).getHobi());
        holder.imgFoto.setImageResource(mahasiswaKuArrayList.get(position).getFoto());
        holder.txtGender.setText(mahasiswaKuArrayList.get(position).getGender());
    }

    @Override
    public int getItemCount() { //berguna untuk menghitung jumlah data yang ada
        return (mahasiswaKuArrayList != null)? mahasiswaKuArrayList.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{ //utk menghubungkan dari txt
        private TextView txtNamaku, txtCita, txtGender, txtNimku, txtHobi, txtMotoHidup;
        private ImageView imgFoto;

        public ViewHolder(View view){
            super(view);
            txtNamaku = view.findViewById(R.id.txtNamaMhsKu);
            txtNimku = view.findViewById(R.id.txtNimMhsKu);
            txtCita = view.findViewById(R.id.txtCitaMhsKu);
            txtHobi = view.findViewById(R.id.txtHobiMhsKu);
            txtMotoHidup = view.findViewById(R.id.txtMotoMhsKu);
            imgFoto = view.findViewById(R.id.imageViewMhsKu);
            txtGender = view.findViewById(R.id.txtGender);
        }
    }
}
