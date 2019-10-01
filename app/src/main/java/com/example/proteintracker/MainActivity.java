package com.example.proteintracker;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView)findViewById(R.id.mainActivityTextView);
        textView.setText(R.string.test_untuk_update_view); //

        Button myBtn = (Button)findViewById(R.id.button1);
        myBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText myEditText =(EditText)findViewById(R.id.editText1);
                Log.d("ProteinTracker",myEditText.getText().toString());
            }
        });

        Button helpBtn = (Button)findViewById(R.id.helpButton);
        helpBtn.setOnClickListener(helpButtonListener);

        Button testBtn = (Button)findViewById(R.id.btnTest);
        testBtn.setOnClickListener(testButtonListener);

        Button relativeBtn = (Button)findViewById(R.id.btnRelative);
        relativeBtn.setOnClickListener(relativeButtonListener);

        Button proteinBtn = (Button)findViewById(R.id.btnProtein);
        proteinBtn.setOnClickListener(proteinButtonListener);

        Button fragmentBtn = (Button)findViewById(R.id.btnFragment);
        fragmentBtn.setOnClickListener(fragmentButtonListener);

        Button mhsFragmentBtn = (Button)findViewById(R.id.btnFragmenMhs);
        mhsFragmentBtn.setOnClickListener(mhsFragmentButtonListener);

        Button listBtn = (Button)findViewById(R.id.btnList);
        listBtn.setOnClickListener(listButtonListener);

        Button kelolaBtn = (Button)findViewById(R.id.btnKelolaMhs);
        kelolaBtn.setOnClickListener(kelolaMhsButtonListener);

        Button cardViewBtn = (Button)findViewById(R.id.btnCardViewMhs);
        cardViewBtn.setOnClickListener(cardViewMhsButtonListener);

        if(savedInstanceState != null){
            Log.d("ProteinTracker", savedInstanceState.getString("abc"));
        }

        Button layoutBtn = (Button)findViewById(R.id.btnLayout);
        layoutBtn.setOnClickListener(layoutButtonListener);
    }
    /*private View.OnClickListener helpButtonListener = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent intent = new Intent(MainActivity.this,HelpActivity.class);
            startActivity(intent);
        }
    };*/

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }

    @Override
    protected void onSaveInstanceState (Bundle outState){
        super.onSaveInstanceState(outState);

        outState.putString("abc","test");
        super.onSaveInstanceState(outState);
    }

    private View.OnClickListener helpButtonListener = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent intent = new Intent(MainActivity.this,HelpActivity.class);

            Bundle b = new Bundle();

            EditText myEditText = (EditText)findViewById(R.id.editText1);

            b.putString("helpString",myEditText.getText().toString());
            intent.putExtras(b);

            startActivity(intent);
        }
    };

    private View.OnClickListener layoutButtonListener = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener testButtonListener = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent intent = new Intent(MainActivity.this,TestActivity.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener relativeButtonListener = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent intent = new Intent(MainActivity.this,RelativeActivity.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener proteinButtonListener = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent intent = new Intent(MainActivity.this,ProteinTracker.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener fragmentButtonListener = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent intent = new Intent(MainActivity.this,Main3FragmentActivity.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener mhsFragmentButtonListener = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent intent = new Intent(MainActivity.this,MahasiswaActivity.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener listButtonListener = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent intent = new Intent(MainActivity.this,ListActivity.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener kelolaMhsButtonListener = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent intent = new Intent(MainActivity.this,KelolaDataMhs1Activity.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener cardViewMhsButtonListener = new OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,RecyclerViewMhhsActivity.class);
            startActivity(intent);
        }
    };


}
