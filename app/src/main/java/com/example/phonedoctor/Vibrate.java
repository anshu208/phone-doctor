package com.example.phonedoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Vibrate extends AppCompatActivity {
    private void performVibrationTest() {
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        if (vibrator != null && vibrator.hasVibrator()) {
            // Vibrate for 500 milliseconds
            vibrator.vibrate(500);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(Vibrate.this, "Vibration test complete", Toast.LENGTH_SHORT).show();
                }
            }, 500);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibrate);

        // setting action bar text
        getSupportActionBar().setTitle("Vibrate Test");
        Button vibrationTestButton = findViewById(R.id.button);
        vibrationTestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performVibrationTest();
            }
    });

    }
}