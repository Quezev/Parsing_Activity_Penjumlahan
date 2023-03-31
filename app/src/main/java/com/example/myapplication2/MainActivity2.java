package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        result = findViewById(R.id.textresul);
        String Pertama =getIntent().getExtras().getString("Nilai Pertama");
        String kedua =getIntent().getExtras().getString("Nilai Kedua");
        String Hasil =getIntent().getExtras().getString("Hasil");

        result.setText(Pertama+"+"+kedua+"="+Hasil);
    }
}