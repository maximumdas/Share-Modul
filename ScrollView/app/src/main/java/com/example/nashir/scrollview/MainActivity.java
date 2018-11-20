package com.example.nashir.scrollview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.*;
import android.widget.*;


import java.text.ChoiceFormat;

public class MainActivity extends AppCompatActivity {
    Spinner spinner; TextView text;
    String makanan[]={"ayam","apel","anggur","tidak ada"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner=(Spinner)findViewById(R.id.spinner);
        text=(TextView)findViewById(R.id.textView);
        SpinnerAdapter adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,makanan);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplication(),"Anda memilih "+makanan[position],Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }
}
