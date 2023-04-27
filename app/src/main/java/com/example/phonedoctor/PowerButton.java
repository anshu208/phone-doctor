package com.example.phonedoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PowerButton extends AppCompatActivity {

    private PowerManager powerManager;
    private PowerManager.WakeLock wakeLock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_power_button);

        powerManager = (PowerManager) getSystemService(Context.POWER_SERVICE);

        wakeLock = powerManager.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK,
                "MyApp::MyWakelockTag");

        Button powerButton = findViewById(R.id.power_button);
        powerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (powerManager.isInteractive()) {
                    Toast.makeText(getApplicationContext(), "Power button is working",
                            Toast.LENGTH_SHORT).show();
                } else {
                    wakeLock.acquire();
                    wakeLock.release();
                    Toast.makeText(getApplicationContext(), "Power button is not working",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}