package com.example.proteintracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class CobaMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coba_menu);

        //CONTEXT MENU
        String ContMenu[] = {"1","2","3","4","5"};
        ListView lv = (ListView)findViewById(R.id.lstView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(CobaMenuActivity.this,android.R.layout.simple_list_item_1, ContMenu);
        lv.setAdapter(adapter);
        registerForContextMenu(lv);
        //**CONTEXT MENU
    }
    //OPTION MENU

    //nampilin icon titik tiga di kanan atas
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater(); //inflater sprti sub, bisa dipakai di activity lain
        inflater.inflate(R.menu.menu1,menu);
        return true;
    }

    //item selected option
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.item1){
            Toast.makeText(getApplicationContext(),"Item 1 Terpilih", Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId() == R.id.item2){
            Toast.makeText(getApplicationContext(),"Item 2 Terpilih", Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId() == R.id.item3){
            Toast.makeText(getApplicationContext(),"Item 3 Terpilih", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item); // bisa juga return true;
    }
    // **OPTION MENU

    //CONTEXT MENU :

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Silahkan Memilih");
        menu.add(0,v.getId(), 0, "Simpan"); //groupId, itemId, order, title
        menu.add(0,v.getId(), 0, "Tidak");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getTitle() == "Simpan"){
            Toast.makeText(getApplicationContext(),"Sedang Menyimpan",Toast.LENGTH_SHORT).show();
        }else if(item.getTitle() == "Tidak"){
            Toast.makeText(getApplicationContext(),"Tidak Jadi Menyimpan",Toast.LENGTH_SHORT).show();
        }else {return false;}

        return super.onContextItemSelected(item);
    }

    // **CONTEXT MENU
}
