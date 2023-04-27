package com.example.phonedoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.widget.TextView;

import java.io.File;

public class Storage extends AppCompatActivity {

    private TextView totalSpaceTextView, freeSpaceTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage);

        // setting action bar text
        getSupportActionBar().setTitle("Storage Test");

        totalSpaceTextView = findViewById(R.id.total_space);
        freeSpaceTextView = findViewById(R.id.free_space);

        File externalStorage = Environment.getExternalStorageDirectory();
        long totalSpace = externalStorage.getTotalSpace();
        long freeSpace = externalStorage.getFreeSpace();

        totalSpaceTextView.setText("Total Space: " + formatSize(totalSpace));
        freeSpaceTextView.setText("Free Space: " + formatSize(freeSpace));
    }

    private String formatSize(long size) {
        String suffix = null;

        if (size >= 1024) {
            suffix = "KB";
            size /= 1024;
            if (size >= 1024) {
                suffix = "MB";
                size /= 1024;
            }
        }

        StringBuilder resultBuffer = new StringBuilder(Long.toString(size));

        int commaOffset = resultBuffer.length() - 3;
        while (commaOffset > 0) {
            resultBuffer.insert(commaOffset, ',');
            commaOffset -= 3;
        }

        if (suffix != null) resultBuffer.append(suffix);
        return resultBuffer.toString();
    }
}