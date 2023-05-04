package com.example.phonedoctor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.example.phonedoctor.databinding.ActivityMainBinding;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        auth = FirebaseAuth.getInstance();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.logout:
                auth.signOut();
                Intent intent = new Intent(MainActivity.this , SignInActivity.class);
                startActivity(intent);
                break;
        }
        return true;
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