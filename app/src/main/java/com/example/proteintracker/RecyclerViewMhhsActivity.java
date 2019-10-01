package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.proteintracker.Adapter.MahasiswaAdapter;
import com.example.proteintracker.Adapter.MahasiswaKuAdapter;
import com.example.proteintracker.Model.MahasiswaKu;

import java.util.ArrayList;

public class RecyclerViewMhhsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaKuAdapter mahasiswaKuAdapter;
    private ArrayList<MahasiswaKu> mahasiswaKuArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_mhhs);
        tambahData();

        recyclerView = findViewById(R.id.rvMhsKu);
        mahasiswaKuAdapter = new MahasiswaKuAdapter(mahasiswaKuArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecyclerViewMhhsActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mahasiswaKuAdapter);

    }

    private void tambahData(){
        mahasiswaKuArrayList = new ArrayList<>();
        mahasiswaKuArrayList.add(new MahasiswaKu("Michael Gerardi Adjie","72170100", "Business Man", "Basket", "Jangan menyerah",R.drawable.michael,"Laki-laki"));
        mahasiswaKuArrayList.add(new MahasiswaKu("Nikolaus Aryawan R W","72170115", "Membanggakan dan membahagiakan ortu", "Barongsai", "Terus berproses meski itu berat",R.drawable.ary,"Laki-laki"));
        mahasiswaKuArrayList.add(new MahasiswaKu("Monica Carista","72170133", "Menjadi lebih berguna bagi keluarga", "Main game", "Don't Judge",R.drawable.monica,"Perempuan"));
        mahasiswaKuArrayList.add(new MahasiswaKu("Valeriana Tanesha","72170143", "Bahagia", "Baca Novel", "Pantang Mundur",R.drawable.val, "Perempuan"));
        mahasiswaKuArrayList.add(new MahasiswaKu("Grace Hutabarat","72170171", "Good Leader", "Tidur", "Be Your Self",R.drawable.grace, "Perempuan"));
        mahasiswaKuArrayList.add(new MahasiswaKu("Beni Mulia Tabarus","72170177", "Membanggakan Ortu", "Basket, Musik, Game", "Just Do It",R.drawable.foto,"Laki-laki"));
    }
}
