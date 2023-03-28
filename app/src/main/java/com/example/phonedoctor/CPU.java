package com.example.phonedoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CPU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpu);

        // setting action bar text
        getSupportActionBar().setTitle("CPU Test");
    }
}