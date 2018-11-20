package com.example.nashir.pembacaanstring;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;
import android.app.AlertDialog;

public class ActivityUtama extends AppCompatActivity {
    Button button1,button2;
    EditText getext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);

        button1=(Button)findViewById(R.id.button);
        getext=(EditText)findViewById(R.id.editText);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(),"Halo "+getext.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder baru=new AlertDialog.Builder(ActivityUtama.this);
                baru.setCancelable(false);
                baru.setTitle("Konfirmasi");
                baru.setMessage("Apakah anda yakin ingin keluar?");
                baru.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ActivityUtama.this.finish();
                    }
                });
                baru.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                baru.show();
            }
        });
    }
}
