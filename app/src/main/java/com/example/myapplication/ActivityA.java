package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ActivityA extends AppCompatActivity implements View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set Action Bar Tittle
        ActionBar barTitle = getSupportActionBar();
        barTitle.setTitle("ALC 4.0 Phase 1");

        Button gotoALC = findViewById(R.id.button_b);
        Button gotoProfile = findViewById(R.id.button_c);

        gotoALC.setOnClickListener(this);
        gotoProfile.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button_b:
                Intent intent = new Intent(this, ActivityB.class);
                startActivity(intent);
                break;
            case R.id.button_c:
                Intent profile = new Intent(this, ActivityC.class);
                startActivity(profile);
                break;
            default:
                break;

        }
    }
}
