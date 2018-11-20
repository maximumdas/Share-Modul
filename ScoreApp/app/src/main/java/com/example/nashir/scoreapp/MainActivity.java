package com.example.nashir.scoreapp;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA=0,scoreB=0;
    private int foulsA=0,foulsB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button close=findViewById(R.id.close_button);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder popUpDialog=new AlertDialog.Builder(MainActivity.this);
                popUpDialog.setMessage("Are You Sure Want to Close This App?");
                popUpDialog.setCancelable(false);
                popUpDialog.setTitle("Confirm");
                popUpDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        MainActivity.this.finish();
                    }
                });
                popUpDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });popUpDialog.create().show();
            }
        });
    }
    public void addScoreA(View view){
        scoreA++;
        setScore(scoreA,1);
    }
    public void addScoreB(View view){
        scoreB++;
        setScore(scoreB,2);
    }
    public void addFoulsA(View view){
        foulsA++;
        setFouls(foulsA,1);
    }
    public void addFoulsB(View view){
        foulsB++;
        setFouls(foulsB,2);
    }
    public void setScore(int input, int id){
        TextView text;
        if(id==1){
            text=findViewById(R.id.team_a_score);
            text.setText(""+input);
        }else{
            text=findViewById(R.id.team_b_score);
            text.setText(""+input);
        }
    }
    public void setFouls(int input, int id){
        TextView text;
        if(id==1){
            text=findViewById(R.id.team_a_fouls);
            text.setText(""+input);
        }else{
            text=findViewById(R.id.team_b_fouls);
            text.setText(""+input);
        }
    }
    public void resetAll(View view){
        scoreA=0;scoreB=0;
        foulsA=0;foulsB=0;
        setFouls(foulsA,1);setFouls(foulsB,2);
        setScore(scoreA,1);setScore(scoreB,2);
    }
}
