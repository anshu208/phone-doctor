package com.example.phonedoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

public class CPU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpu);

        // Get references to TextView
        TextView cpuInfoTextView = findViewById(R.id.cpu_info_textview);

        // Get CPU information
        String manufacturer = Build.MANUFACTURER;
        String model = Build.MODEL;
        String cpuAbi = Build.CPU_ABI;

        // Display CPU information in TextView
        cpuInfoTextView.setText("Manufacturer: " + manufacturer + "\nModel: " + model + "\nCPU ABI: " + cpuAbi);

    }
}