package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.proteintracker.Adapter.MahasiswaAdapter;
import com.example.proteintracker.Model.Mahasiswa;

import java.util.ArrayList;

public class RecycleViewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private  MahasiswaAdapter mahasiswaAdapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        addData();

        recyclerView = findViewById(R.id.rvMahasiswa);
        mahasiswaAdapter = new MahasiswaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecycleViewActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mahasiswaAdapter);
    }

    private void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Beni Mulia Tabarus", "72170177", "088216152324"));
        mahasiswaArrayList.add(new Mahasiswa("Beni Mulia Tabarus", "72170177", "088216152324"));
        mahasiswaArrayList.add(new Mahasiswa("Beni Mulia Tabarus", "72170177", "088216152324"));
        mahasiswaArrayList.add(new Mahasiswa("Beni Mulia Tabarus", "72170177", "088216152324"));
        mahasiswaArrayList.add(new Mahasiswa("Beni Mulia Tabarus", "72170177", "088216152324"));
        mahasiswaArrayList.add(new Mahasiswa("Beni Mulia Tabarus", "72170177", "088216152324"));
        mahasiswaArrayList.add(new Mahasiswa("Beni Mulia Tabarus", "72170177", "088216152324"));
        mahasiswaArrayList.add(new Mahasiswa("Beni Mulia Tabarus", "72170177", "088216152324"));
        mahasiswaArrayList.add(new Mahasiswa("Beni Mulia Tabarus", "72170177", "088216152324"));
        mahasiswaArrayList.add(new Mahasiswa("Beni Mulia Tabarus", "72170177", "088216152324"));
        mahasiswaArrayList.add(new Mahasiswa("Beni Mulia Tabarus", "72170177", "088216152324"));
        mahasiswaArrayList.add(new Mahasiswa("Beni Mulia Tabarus", "72170177", "088216152324"));
        mahasiswaArrayList.add(new Mahasiswa("Beni Mulia Tabarus", "72170177", "088216152324"));
    }

}
