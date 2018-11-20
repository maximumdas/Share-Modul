package com.example.nashir.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.util.SparseBooleanArray;
import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {
    //String macamNegara[];
    //String macamIbukota[];
    String music[];TextView text;
    ListView negara;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //codingan
        //macamNegara= getResources().getStringArray(R.array.negara);
        text=(TextView)findViewById(R.id.textView);
        //macamIbukota=getResources().getStringArray(R.array.keunikan);
        music=getResources().getStringArray(R.array.music);
        negara=(ListView)findViewById(R.id.ListNegara);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_checked,music);
        negara.setAdapter(adapter);
        negara.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        negara.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String hasil="";int i;
                SparseBooleanArray pilih=negara.getCheckedItemPositions();//getCheckeditemPosition jenis kembalian integer dar item ist yang di cek
                for (i=0;i<pilih.size();i++) {//pilih.size() mengembalikan nilai ukuran dari array adapter

                    boolean nilai=pilih.get(pilih.keyAt(i));
                    if (nilai)
                        hasil =hasil + music[i]+" ";
                }
                Toast.makeText(getApplication(),hasil,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
