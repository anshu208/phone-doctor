package com.example.phonedoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Storage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage);

        // setting action bar text
        getSupportActionBar().setTitle("Storage Test");
    }
}