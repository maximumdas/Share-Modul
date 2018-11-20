package com.example.nashir.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button btn  = findViewById(R.id.button_kembali);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            Intent upIntent = NavUtils.getParentActivityIntent(this);
            if (NavUtils.shouldUpRecreateTask(this,upIntent)){
                TaskStackBuilder.create(this).addNextIntentWithParentStack(upIntent).startActivities();
            }else{
                NavUtils.navigateUpTo(this, upIntent);
            }
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e("SecondActivity", "Aplikasi dalam keadaan onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("SecondActivity", "Aplikasi dalam keadaan onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("SecondActivity", "Aplikasi dalam keadaan onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("SecondActivity", "Aplikasi dalam keadaan onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("SecondActivity", "Aplikasi dalam keadaan onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("SecondActivity", "Aplikasi dalam keadaan onDestroy");
    }
}
