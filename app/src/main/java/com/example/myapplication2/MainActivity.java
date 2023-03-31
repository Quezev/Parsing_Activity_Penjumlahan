package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edittext,edittext2;
    TextView textviews;
    Button buttonmasuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext = findViewById(R.id.edittext);
        edittext2 = findViewById(R.id.edittext2);
        textviews = findViewById(R.id.textviews);
        buttonmasuk = (Button) findViewById(R.id.buttonmasuk);

        buttonmasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nedittext = Integer.valueOf(edittext.getText().toString());
                int nedittexts = Integer.valueOf(edittext2.getText().toString());

                int Hasil = nedittext + nedittexts;
                buttonmasuk.setText(String.valueOf(Hasil));

                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("Nilai Pertama",edittext.getText().toString());
                i.putExtra("Nilai Kedua",edittext2.getText().toString());
                i.putExtra("Hasil",buttonmasuk.getText().toString());
                startActivity(i);

            }
        });
    }
}