package com.example.phonedoctor;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import android.widget.TextView;



public class TouchScreen extends AppCompatActivity {

    private TextView touchResultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_touch_screen);

        // setting action bar text
        getSupportActionBar().setTitle("TouchScreen Test");

        touchResultTextView = findViewById(R.id.touchResultTextView);

        View touchView = findViewById(R.id.touchView);
        touchView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        touchResultTextView.setText("Touch down");
                        break;
                    case MotionEvent.ACTION_MOVE:
                        touchResultTextView.setText("Touch move");
                        break;
                    case MotionEvent.ACTION_UP:
                        touchResultTextView.setText("Touch up");
                        break;
                }
                return true;
            }
        });
    }
}