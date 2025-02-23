package com.example.datadiri;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {
    private TextView namaDisplay, npmDisplay, bidangMinatDisplay;
    private Button okButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        // Initialize views
        namaDisplay = findViewById(R.id.namaDisplay);
        npmDisplay = findViewById(R.id.npmDisplay);
        bidangMinatDisplay = findViewById(R.id.bidangMinatDisplay);
        okButton = findViewById(R.id.okButton);

        // Get data from intent
        String nama = getIntent().getStringExtra("NAMA");
        String npm = getIntent().getStringExtra("NPM");
        String bidangMinat = getIntent().getStringExtra("BIDANG_MINAT");

        // Set data to views
        namaDisplay.setText(nama);
        npmDisplay.setText(npm);
        bidangMinatDisplay.setText(bidangMinat);

        // Set click listener for OK button
        okButton.setOnClickListener(v -> finishAffinity());
    }
}
