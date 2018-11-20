package com.example.nashir.luaspersegi;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.app.AlertDialog;

public class MainActivity extends AppCompatActivity {
    int panjang,lebar,luas;EditText Panjang,Lebar;
    TextView hasil;Button operasi,keluar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //codingan
        operasi=(Button)findViewById(R.id.OpButton);
        keluar=(Button)findViewById(R.id.ExitButton);
        hasil=(TextView)findViewById(R.id.textView3);
        Panjang=(EditText)findViewById(R.id.editText3);
        Lebar=(EditText)findViewById(R.id.editText5);

        operasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                panjang=Integer.parseInt(Panjang.getText().toString());
                lebar=Integer.parseInt(Lebar.getText().toString());
                luas=panjang*lebar;
                hasil.setText(String.valueOf(luas));
            }
        });
        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder keluar=new AlertDialog.Builder(MainActivity.this);
                keluar.setCancelable(false);
                keluar.setTitle("Konfirmasi");
                keluar.setMessage("Yakin ingin keluar?");
                keluar.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        MainActivity.this.finish();
                    }
                });

                keluar.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
            keluar.show();}
        });
    }
}
