package com.example.nashir.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

public class PotatoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.potato_head);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final CheckBox body = findViewById(R.id.bodyCheckBox);
        CheckBox hands = findViewById(R.id.handCheckBox);
        CheckBox shoes = findViewById(R.id.shoesCheckBox);
        final CheckBox mouth = findViewById(R.id.mouthCheckBox);
        CheckBox nose = findViewById(R.id.noseCheckBox);
        CheckBox musthache = findViewById(R.id.mustacheCheckBox);
        CheckBox eye = findViewById(R.id.eyeCheckBox);
        CheckBox eyeBrow = findViewById(R.id.eyeBrowCheckBox);
        CheckBox glass = findViewById(R.id.glassCheckBox);
        CheckBox hat  = findViewById(R.id.hatCheckBox);
        final CheckBox ears = findViewById(R.id.earsCheckBox);

        final ImageView bodyImage = findViewById(R.id.bodyImage);
        bodyImage.setVisibility(View.GONE);

        final ImageView handImage = findViewById(R.id.handImage);
        handImage.setVisibility(View.GONE);

        final ImageView shoesImage = findViewById(R.id.shoeImage);
        shoesImage.setVisibility(View.GONE);

        final ImageView mouthImage = findViewById(R.id.mouthImage);
        mouthImage.setVisibility(View.GONE);

        final ImageView noseImage = findViewById(R.id.noseImage);
        noseImage.setVisibility(View.GONE);

        final ImageView eyeImage = findViewById(R.id.eyeImage);
        eyeImage.setVisibility(View.GONE);

        final ImageView eyeBrowImage = findViewById(R.id.eyeBrowImage);
        eyeBrowImage.setVisibility(View.GONE);

        final ImageView glassImage = findViewById(R.id.glassImage);
        glassImage.setVisibility(View.GONE);

        final ImageView hatImage = findViewById(R.id.hatImage);
        hatImage.setVisibility(View.GONE);

        final ImageView earsImage = findViewById(R.id.earImage);
        earsImage.setVisibility(View.GONE);

        final ImageView mustacheImage = findViewById(R.id.mustacheImage);
        mustacheImage.setVisibility(View.GONE);

        body.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true){
                    bodyImage.setVisibility(View.VISIBLE);
                }else{
                    bodyImage.setVisibility(View.GONE);
                }
            }
        });
        eye.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b == true){
                    eyeImage.setVisibility(View.VISIBLE);
                }else{
                    eyeImage.setVisibility(View.GONE);
                }
            }
        });

        shoes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b == true){
                    shoesImage.setVisibility(View.VISIBLE);
                }else{
                    shoesImage.setVisibility(View.GONE);
                }
            }
        });

        hands.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true){
                    handImage.setVisibility(View.VISIBLE);
                }else{
                    handImage.setVisibility(View.GONE);
                }
            }
        });
        mouth.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b==true){
                    mouthImage.setVisibility(View.VISIBLE);
                }else{
                    mouthImage.setVisibility(View.GONE);
                }
            }
        });
        nose.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true){
                    noseImage.setVisibility(View.VISIBLE);
                }else{
                    noseImage.setVisibility(View.GONE);
                }
            }
        });
        musthache.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true){
                    mustacheImage.setVisibility(View.VISIBLE);
                }else{
                    mustacheImage.setVisibility(View.GONE);
                }
            }
        });
        eyeBrow.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true){
                    eyeBrowImage.setVisibility(View.VISIBLE);
                }else{
                    eyeBrowImage.setVisibility(View.GONE);
                }
            }
        });
        glass.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true){
                    glassImage.setVisibility(View.VISIBLE);
                }else{
                    glassImage.setVisibility(View.GONE);
                }
            }
        });
        ears.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true){
                    earsImage.setVisibility(View.VISIBLE);
                }else{
                    earsImage.setVisibility(View.GONE);
                }
            }
        });
        hat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true){
                    hatImage.setVisibility(View.VISIBLE);
                }else{
                    hatImage.setVisibility(View.GONE);
                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            Intent upIntent = NavUtils.getParentActivityIntent(this);
            if (NavUtils.shouldUpRecreateTask(this, upIntent)){
                TaskStackBuilder.create(this).addNextIntentWithParentStack(upIntent).startActivities();
            }else{
                NavUtils.navigateUpTo(this, upIntent);
                }
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
