package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ProteinTracker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.protein_tracker);

        Button resetButton = (Button)findViewById(R.id.btnReset);
        resetButton.setOnClickListener(resetButtonListener);
    }

    private View.OnClickListener resetButtonListener = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            AlertDialog.Builder builder = new AlertDialog.Builder(ProteinTracker.this);
            builder.setMessage("Apakah anda yakin untuk mereset nilai protein?")
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(ProteinTracker.this, "Tidak jadi reset", Toast.LENGTH_SHORT).show();}         })
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(ProteinTracker.this, "Melakukan RESET !!", Toast.LENGTH_SHORT).show();}         });

            AlertDialog dialog = builder.create(); dialog.show();
        }
    };
}
