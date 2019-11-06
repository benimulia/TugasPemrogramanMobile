package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
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

        Button settingButton = (Button)findViewById(R.id.btnSettingProTrack);
        settingButton.setOnClickListener(settingButtonListener);

        SharedPreferences prefs = ProteinTracker.this.getSharedPreferences("prefs_file",MODE_PRIVATE);
        String statusLogin = prefs.getString("isLogin",null); Button btnLogin = (Button)findViewById(R.id.btnLoginProTrack);
        btnLogin.setOnClickListener(myBtnLoginClick);

        if (statusLogin != null){
            btnLogin.setText("Logout");
        }else{
            btnLogin.setText("Login");
        }
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

    private View.OnClickListener settingButtonListener = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent intent = new Intent(ProteinTracker.this, SettingProteinTracker.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener myBtnLoginClick  = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            SharedPreferences prefs = ProteinTracker.this.getSharedPreferences("prefs_file",MODE_PRIVATE);

            String statusLogin = prefs.getString("isLogin",null);
            SharedPreferences.Editor edit = prefs.edit();

            Button btnLogin = (Button)findViewById(R.id.btnLoginProTrack);
            if (statusLogin != null){
                edit.putString("isLogin",null);
                btnLogin.setText("Login");
            }else{
                edit.putString("isLogin","Admin");
                btnLogin.setText("Logout");
            }
                edit.commit();
        }
    };
}
