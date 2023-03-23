package com.example.phonedoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //going from main activity to frontcamera activity
    public void fc(View view) {
        Intent intent = new Intent(MainActivity.this, FontCamera.class);
        startActivity(intent);
    }

    public void fctxt(View view) {
        Intent intent = new Intent(MainActivity.this, FontCamera.class);
        startActivity(intent);
    }

    //main to bluettoth
    public void bt(View view) {
        Intent intent = new Intent(MainActivity.this, Bluetooth.class);
        startActivity(intent);
    }

    public void bttxt(View view) {
        Intent intent = new Intent(MainActivity.this, Bluetooth.class);
        startActivity(intent);
    }

    //main to Receiver

}