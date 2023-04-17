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

    //main to bluettoth
    public void bt(View view) {
        Intent intent = new Intent(MainActivity.this, Bluetooth.class);
        startActivity(intent);
    }

    //main to receiver
    public void receiver(View view) {
        Intent intent = new Intent(MainActivity.this, Receiver.class);
        startActivity(intent);
    }

    //main to compass
    public void about(View view) {
        Intent intent = new Intent(MainActivity.this, About.class);
        startActivity(intent);
    }

    //main to cpu
    public void cpuu(View view) {
        Intent intent = new Intent(MainActivity.this, CPU.class);
        startActivity(intent);
    }

    //main to fingerprint
    public void fp(View view) {
        Intent intent = new Intent(MainActivity.this, Fingerprint.class);
        startActivity(intent);
    }

    //main to Gyroscope
    public void gyro(View view) {
        Intent intent = new Intent(MainActivity.this, Gyroscope.class);
        startActivity(intent);
    }

     //main to storage
    public void storage(View view) {
        Intent intent = new Intent(MainActivity.this,Storage.class );
        startActivity(intent);
    }

    //main to battery
    public void battery(View view) {
        Intent intent = new Intent(MainActivity.this, Battery.class);
        startActivity(intent);
    }

    //main to GPS
    public void gpss(View view) {
        Intent intent = new Intent(MainActivity.this, GPS.class);
        startActivity(intent);
    }

    //main to Microphone
    public void microphne(View view) {
        Intent intent = new Intent(MainActivity.this, Microphone.class);
        startActivity(intent);
    }

    //main to network
    public void netwrk(View view) {
        Intent intent = new Intent(MainActivity.this, Network.class);
        startActivity(intent);
    }

    //main to Power button
    public void powerbtn(View view) {
        Intent intent = new Intent(MainActivity.this, PowerButton.class);
        startActivity(intent);
    }

    //main to volume butoon
    public void volumebtn(View view) {
        Intent intent = new Intent(MainActivity.this, VolumeButton.class);
        startActivity(intent);
    }

    //main to screen
    public void scren(View view) {
        Intent intent = new Intent(MainActivity.this, Screen.class);
        startActivity(intent);
    }

    //Main to Flashlight
    public void flash(View view) {
        Intent intent = new Intent(MainActivity.this, FlashLight.class);
        startActivity(intent);
    }

    //main to touchscreen
    public void touch(View view) {
        Intent intent = new Intent(MainActivity.this, TouchScreen.class);
        startActivity(intent);
    }

    //main to Connector
    public void usb(View view) {
        Intent intent = new Intent(MainActivity.this, Connector.class);
        startActivity(intent);
    }

    //main to Vibrate
    public void vibratee(View view) {
        Intent intent = new Intent(MainActivity.this, Vibrate.class);
        startActivity(intent);
    }

    //main to wifi
    public void wifii(View view) {
        Intent intent = new Intent(MainActivity.this, Wifi.class);
        startActivity(intent);
    }

    //main to Back camera
    public void bcamera(View view) {
        Intent intent = new Intent(MainActivity.this, BackCamera.class);
        startActivity(intent);
    }



}