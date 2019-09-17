package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3FragmentActivity extends AppCompatActivity
    implements BlankFragment.SendMessage {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_fragment);

        Button btnPress = findViewById(R.id.btnTesFragment);
        btnPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                BlankFragment blankFragment = BlankFragment.newInstance("Hai", "Kamu");
                ft.replace(R.id.mhsFrame, blankFragment);
                ft.commit();
                //4 baris wajib jika ingin memnbuat fragment
            }
        });
    }

    @Override
    public void SendData(String Message) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Protein2Fragment protein2Fragment = Protein2Fragment.newInstance(Message, "Kamu");
        ft.replace(R.id.mhsFrame, protein2Fragment);
        ft.commit();
    }
}
