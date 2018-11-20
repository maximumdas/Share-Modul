package com.example.nashir.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.logging.Logger;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    String str = "";
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        str ="Aplikasi dalam keadaan onCreate()";
        Log.w("MainActivity",str);

        Button btn = findViewById(R.id.next_button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
        Button pBtn = findViewById(R.id.potato_button);
        pBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(MainActivity.this, PotatoActivity.class);
                startActivity(intent);
            }
        });


        Retrofit retrofit = new Retrofit.Builder().baseUrl(Api.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        Api api = retrofit.create(Api.class);
        Call<List<Hero>> call = api.getHeroes();

        call.enqueue(new Callback<List<Hero>>() {
            @Override
            public void onResponse(Call<List<Hero>> call, Response<List<Hero>> response) {
                List<Hero> heroes = response.body();
                TextView text = findViewById(R.id.text_status);
                String str = "";
                for (Hero h:heroes){
                    str+=h.getName()+"\n";
                }
                text.setText(str);
            }

            @Override
            public void onFailure(Call<List<Hero>> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        text = findViewById(R.id.text_status);
        Log.e("MainActivity", "Aplikasi dalam keadaan onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("MainActivity", "Aplikasi dalam keadaan onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("MainActivity", "Aplikasi dalam keadaan onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("MainActivity", "Aplikasi dalam keadaan onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("MainActivity", "Aplikasi dalam keadaan onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("MainActivity", "Aplikasi dalam keadaan onDestroy");
    }
}
