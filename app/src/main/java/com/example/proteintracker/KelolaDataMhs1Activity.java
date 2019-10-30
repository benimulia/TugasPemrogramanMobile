package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class KelolaDataMhs1Activity extends AppCompatActivity {

    String[] mhs = {"Riyan Mozes Sahetapy","Brian Eldrin Sombuk", "Elias Aru F. Langer", "Aditya Halimawan",
    "Immanuel Harold Maga", "Eben Haezer Gultom", "Yosua Erick Gunawan", "Nana Eka Wulandari", "Eva Kristina", "Jonathan Prajna Marga Parama",
    "Emma Norren Cahya Putri", "Michael Gerardi Adji", "Cynthia Kumalasari", "Nikolaus Aryawan Ravato Wijaya", "Daniel Surya Nugraha",
    "Lionrico Sanjay Exauvida Jeipy", "Jonathan Alvin Ananto", "Monica Carista", "Didimus Candra Gased", "Valeriana Tanesha Indra S",
    "Ivan Bernov", "Friska F. Nainggolan", "Grace Hutabarat", "Beni Mulia Tabarus"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelola_data_mhs1);

        ListView lv = findViewById(R.id.lvMhs);

        lv.setAdapter(new ArrayAdapter<String>(KelolaDataMhs1Activity.this, android.R.layout.simple_list_item_1, mhs));
        /*lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) { //int i untuk tau urutan item
                Toast.makeText(KelolaDataMhs1Activity.this, "Anda memilih " + mhs[i], Toast.LENGTH_SHORT).show(); //length short durasi krg lbh 2 dtk
                //javascript:Alert, C#:MessageBox, JavaAndroid: Toast
            }
        });*/
        registerForContextMenu(lv);

        Button addMhsBtn = (Button)findViewById(R.id.btnTambahMhs);
        addMhsBtn.setOnClickListener(addMhsButtonListener);

        Button editBtn = (Button)findViewById(R.id.btnUpdateMhs);
        editBtn.setOnClickListener(editMhsButtonListener);
    }
    private View.OnClickListener addMhsButtonListener = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent intent = new Intent(KelolaDataMhs1Activity.this,MahasiswaAddActivity.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener editMhsButtonListener = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent intent = new Intent(KelolaDataMhs1Activity.this,MahasiswaEditActivity.class);
            startActivity(intent);
        }
    };

    //OPTION MENU

    //nampilin icon titik tiga di kanan atas
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater(); //inflater sprti sub, bisa dipakai di activity lain
        inflater.inflate(R.menu.menu_tugas,menu);
        return true;
    }

    //item selected option
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.itemFragment){
            Intent intent = new Intent(KelolaDataMhs1Activity.this,MahasiswaActivity.class);
            startActivity(intent);
        }
        else if(item.getItemId() == R.id.itemList){
            Intent intent = new Intent(KelolaDataMhs1Activity.this,ListActivity.class);
            startActivity(intent);
        }
        else if(item.getItemId() == R.id.itemProtein){
            Intent intent = new Intent(KelolaDataMhs1Activity.this,ProteinTracker.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item); // bisa juga return true;
    }
    // **OPTION MENU


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Silahkan Memilih");
        menu.add(0,v.getId(), 0, "Edit"); //groupId, itemId, order, title
        menu.add(0,v.getId(), 0, "Delete");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getTitle() == "Edit"){
            Intent intent = new Intent(KelolaDataMhs1Activity.this,MahasiswaEditActivity.class);
            startActivity(intent);
        }else if(item.getTitle() == "Delete"){
            Toast.makeText(getApplicationContext(),"Sedang Delete",Toast.LENGTH_SHORT).show();
        }else {return false;}

        return super.onContextItemSelected(item);
    }

    // **CONTEXT MENU
}
