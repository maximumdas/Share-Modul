package com.example.nashir.radiobutton;

import android.graphics.Typeface;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.*;

public class radioButton extends AppCompatActivity {
    RadioGroup Rg;Button button;CheckBox cbl,cbr;TextView text;
    String salam[]={"selamat malam","jangan lupa makan","makan mie cak","dan shalat tahajud","baru tidur"};
    int i=0;boolean miring=false,tebal=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        //codingan
        Rg=(RadioGroup)findViewById(R.id.Rcontaner);
        text=(TextView)findViewById(R.id.textView);
        Rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch(checkedId){
                    case R.id.rBl:
                        {text.setGravity(Gravity.LEFT);
                            break;
                        }
                    case R.id.rBr: {
                        text.setGravity(Gravity.RIGHT);
                        break;
                    }
                    case R.id.rBc:{
                        text.setGravity(Gravity.CENTER);
                        break;
                    }
                    default:text.setGravity(Gravity.CENTER);
                }
            }
        });
        button=(Button)findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i>salam.length)i=0;
                if (i<salam.length)
                    text.setText(salam[i]);
                else text.setText("Hello World!!");
                i++;
            }
        });
        cbl=(CheckBox)findViewById(R.id.CBm);
        cbl.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                miring=isChecked;
                if (miring && tebal) text.setTypeface(null, Typeface.BOLD_ITALIC);
                else if (miring) text.setTypeface(null,Typeface.ITALIC);
                else if (tebal) text.setTypeface(null,Typeface.BOLD);
                else text.setTypeface(null,Typeface.NORMAL);
            }
        });
        cbr=(CheckBox)findViewById(R.id.CBb);
        cbr.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                tebal=isChecked;
                if (miring && tebal) text.setTypeface(null, Typeface.BOLD_ITALIC);
                else if (miring) text.setTypeface(null,Typeface.ITALIC);
                else if (tebal) text.setTypeface(null,Typeface.BOLD);
                else text.setTypeface(null,Typeface.NORMAL);
            }
        });

    }
}
