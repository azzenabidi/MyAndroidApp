package com.example.epi2.myapplication;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.backtom: {
                finish();
                break;
            }
            case R.id.gotoc: {

                Intent myInten = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(myInten);
                break;
            }


            default: {
                finish();
                break;
            }
        }}

            @Override
            protected void onCreate (Bundle savedInstanceState){
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main2);
                Button gotoc = (Button) findViewById(R.id.gotoc);
                Button backtom = (Button) findViewById(R.id.backtom);
                gotoc.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent myInten = new Intent(Main2Activity.this, Main3Activity.class);
                        startActivity(myInten);
                    }
                });
                backtom.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        finish();
                    }
                });

            }
}


