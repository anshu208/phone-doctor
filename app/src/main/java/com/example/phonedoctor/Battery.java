package com.example.phonedoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Battery extends AppCompatActivity {

    private BroadcastReceiver batteryReceiver;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battery);

        // Create a BroadcastReceiver to listen for changes in the battery status
        batteryReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                // Get the battery level as an integer
                int batteryLevel = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
                // Get the battery scale to calculate the percentage
                int batteryScale = intent.getIntExtra(BatteryManager.EXTRA_SCALE, -1);
                // Calculate the battery percentage
                float batteryPercentage = (batteryLevel / (float)batteryScale) * 100;

                // Display the battery percentage using a Toast message
                Toast.makeText(context, "Battery percentage: " + batteryPercentage + "%", Toast.LENGTH_SHORT).show();
            }
        };
        // Register the BroadcastReceiver to listen for changes in the battery status
        IntentFilter filter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        registerReceiver(batteryReceiver, filter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Unregister the BroadcastReceiver when the activity is destroyed
        unregisterReceiver(batteryReceiver);
    }
}