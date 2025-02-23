package com.example.datadiri;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText namaInput, npmInput, bidangMinatInput;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        namaInput = findViewById(R.id.namaInput);
        npmInput = findViewById(R.id.npmInput);
        bidangMinatInput = findViewById(R.id.bidangMinatInput);
        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(v -> {
            String nama = namaInput.getText().toString().trim();
            String npm = npmInput.getText().toString().trim();
            String bidangMinat = bidangMinatInput.getText().toString().trim();

            if (nama.isEmpty() || npm.isEmpty() || bidangMinat.isEmpty()) {
                Toast.makeText(this, "Semua field harus diisi!", Toast.LENGTH_SHORT).show();
                return;
            }

            Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
            intent.putExtra("NAMA", nama);
            intent.putExtra("NPM", npm);
            intent.putExtra("BIDANG_MINAT", bidangMinat);
            startActivity(intent);
        });
    }
}
