package com.example.phonedoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

public class About extends AppCompatActivity {

    TextView model, brand, os, version, cpu, resolution, density;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        model = findViewById(R.id.tv_model);
        brand = findViewById(R.id.tv_brand);
        os = findViewById(R.id.tv_os);
        version = findViewById(R.id.tv_version);
        cpu = findViewById(R.id.tv_cpu);
        resolution = findViewById(R.id.tv_resolution);
        density = findViewById(R.id.tv_density);

        model.setText(Build.MODEL);
        brand.setText(Build.BRAND);
        os.setText(Build.VERSION.RELEASE);
        version.setText(Build.VERSION.SDK_INT + "");
        cpu.setText(Build.HARDWARE);
        resolution.setText(getResources().getDisplayMetrics().widthPixels + " x " + getResources().getDisplayMetrics().heightPixels);
        density.setText(getResources().getDisplayMetrics().densityDpi + " dpi");

    }
}