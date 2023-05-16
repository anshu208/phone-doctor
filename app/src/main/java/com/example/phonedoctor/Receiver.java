package com.example.phonedoctor;

import android.content.Context;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Receiver extends AppCompatActivity {

    private AudioManager audioManager;
    private ToneGenerator toneGenerator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);

        // Get the AudioManager
        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

        // Create a ToneGenerator to play a beep sound
        toneGenerator = new ToneGenerator(AudioManager.STREAM_MUSIC, 100);

        // Check if the speaker is working
        if (audioManager.isSpeakerphoneOn()) {
            // If the speaker is on, play a beep sound through the speaker
            toneGenerator.startTone(ToneGenerator.TONE_PROP_BEEP2, 500);
            Toast.makeText(this, "Speaker is not working", Toast.LENGTH_SHORT).show();
        } else {
            // If the speaker is off, turn it on and play a beep sound through the speaker
            audioManager.setSpeakerphoneOn(true);
            toneGenerator.startTone(ToneGenerator.TONE_PROP_BEEP2, 500);
            audioManager.setSpeakerphoneOn(false);
            Toast.makeText(this, "Speaker is  working", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        // Release the ToneGenerator
        toneGenerator.release();
    }
}
