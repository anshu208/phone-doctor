package com.example.phonedoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Connector extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connector);

        // setting action bar text
        getSupportActionBar().setTitle("Connector Test");
    }
}