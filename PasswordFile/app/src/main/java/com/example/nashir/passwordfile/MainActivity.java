package com.example.nashir.passwordfile;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.app.AlertDialog;
import android.view.*;

public class MainActivity extends AppCompatActivity {
    EditText pass,pass2;
    Button button,keluar;
    TextView text;AutoCompleteTextView email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        pass=(EditText)findViewById(R.id.pass);
        pass2=(EditText)findViewById(R.id.pass2);
        button=(Button)findViewById(R.id.button);
        keluar=(Button)findViewById(R.id.button2);
        text=(TextView)findViewById(R.id.textView);

        email=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        String negara[];
        negara=getResources().getStringArray(R.array.negara);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,negara);
        email.setThreshold(1);
        email.setText("");
        email.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail=email.getText().toString();
                String password=pass.getText().toString();
                String confirm=pass2.getText().toString();

                if (mail.trim().equals("")){
                    Toast.makeText(getApplication(),"Email tidak boleh kosong",Toast.LENGTH_SHORT).show();
                    email.requestFocus();
                }else if (password.trim().length()<6){
                    Toast.makeText(getApplication(),"Password harus lebih dari 5 karakter",Toast.LENGTH_SHORT).show();
                    pass.requestFocus();
                }else if (confirm.trim().length()<6){
                    Toast.makeText(getApplication(),"re-Type password harus lebih dari 5 karakter",Toast.LENGTH_SHORT).show();
                    pass2.requestFocus();
                }else if (password.equals(confirm)){
                    Toast.makeText(getApplication(),"Pembuatan password sukses",Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(getApplication(), "password harus sama persis!!", Toast.LENGTH_SHORT).show();
                    pass2.requestFocus();
                }
            }
        });

        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder out=new AlertDialog.Builder(MainActivity.this);
                out.setCancelable(false);
                out.setTitle("Konfirmasi");
                out.setMessage("Yakin ingin keluar");
                out.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        MainActivity.this.finish();
                    }
                });
                out.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
            out.create().show();}
        });

    }
}
