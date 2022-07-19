package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button1);
        button.setOnClickListener(this);
    }
    @Override
    public void onClick(View arg0){
        Intent i = new Intent(MainActivity.this, KonversiActivity.class);
        startActivity(i);
    }

    public void profile(View arg0){
        Intent i = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(i);
    }

    public void kembali(View view){
        finish();
    }
}