package com.example.nashir.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;
import android.app.*;

public class MainActivity extends AppCompatActivity {
    private TextView Text;
    String[] arr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Text=(TextView)findViewById(R.id.tv_toy);
        arr=Toys.getToy();
        for(String toy:arr){
            Text.append(toy+"\n\n\n");
        }
    }
}
