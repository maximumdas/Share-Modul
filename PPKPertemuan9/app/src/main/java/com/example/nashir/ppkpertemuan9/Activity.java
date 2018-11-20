package com.example.nashir.ppkpertemuan9;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class Activity extends AppCompatActivity {

    String str = "";
    TextView text = findViewById(R.id.text_status);
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        str += "Aplikasi dalam fase onStart()\n";
        text.setText(str);
    }
//    @Override
//    protected void onStop() {
//        super.onStop();
//        this.str += "Aplikasi dalam fase onStop()\n";
//        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        this.str += "Aplikasi dalam fase onPause()\n";
//        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        this.str += "Aplikasi dalam fase onRestart()\n";
//        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        this.str += "Aplikasi dalam fase onStart()\n";
//        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
//    }
}
