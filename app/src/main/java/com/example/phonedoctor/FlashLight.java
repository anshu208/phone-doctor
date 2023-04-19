package com.example.phonedoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class FlashLight extends AppCompatActivity {

    private CameraManager cameraManager;
    private String cameraId;
    private boolean isFlashlightOn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash_light);

        // setting action bar text
        getSupportActionBar().setTitle("FlashLight Test");

        // Check if the device has a flashlight
        PackageManager pm = getPackageManager();
        if (!pm.hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH)) {
            // Flashlight not available
            Toast.makeText(getApplicationContext(), "Sorry, your device doesn't have a flashlight.", Toast.LENGTH_SHORT).show();
            return;
        }

        // Get the CameraManager
        cameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);

        try {
            // Get the ID of the back camera
            cameraId = cameraManager.getCameraIdList()[0];
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }

        // Set up the toggle button to turn on/off the flashlight
        Button flashlightButton = findViewById(R.id.flashlight_button);

        flashlightButton.setOnClickListener(v->{
            if (!isFlashlightOn) {
                // Turn on the flashlight
                try {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        cameraManager.setTorchMode(cameraId, true);
                    }
                    isFlashlightOn = true;
                    flashlightButton.setText("Turn Off");
                    Toast.makeText(getApplicationContext(), "Flashlight turned on.", Toast.LENGTH_SHORT).show();
                } catch (CameraAccessException e) {
                    e.printStackTrace();
                }
            } else {
                // Turn off the flashlight
                try {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        cameraManager.setTorchMode(cameraId, false);
                    }
                    isFlashlightOn = false;
                    flashlightButton.setText("Turn On");
                    Toast.makeText(getApplicationContext(), "Flashlight turned off.", Toast.LENGTH_SHORT).show();
                } catch (CameraAccessException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}