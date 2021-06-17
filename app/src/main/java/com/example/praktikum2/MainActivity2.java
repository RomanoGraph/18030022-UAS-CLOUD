package com.example.praktikum2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2<nama> extends AppCompatActivity {
    int skorA;
    int skorB;

    {
        skorA = 0;
        skorB = 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        TextView namaTimA = findViewById(R.id.textView2);
        TextView namaTimB = findViewById(R.id.textView4);
        String getNamaA = getIntent().getStringExtra("Tim A");
        String getNamaB = getIntent().getStringExtra("Tim B");
    }
    public void Tambah(View view) {
        if (view.getId() == R.id.button2) {
            skorA = skorA + 1;
        } else if (view.getId() == R.id.button4) {
            skorA = skorA + 2;
        } else if (view.getId() == R.id.button3) {
            skorA = skorA + 3;
        } else if (view.getId() == R.id.button6) {
            skorB = skorB + 1;
        } else if (view.getId() == R.id.button7) {
            skorB = skorB + 2;
        } else if (view.getId() == R.id.button8) {
            skorB = skorB + 3;
        }
        TextView skorTimA = findViewById(R.id.textView2);
        TextView skorTimB = findViewById(R.id.textView4);
        skorTimA.setText(String.valueOf(skorA));
        skorTimB.setText(String.valueOf(skorB));
    }
}