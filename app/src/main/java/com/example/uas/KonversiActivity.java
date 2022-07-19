package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

public class KonversiActivity extends AppCompatActivity {
EditText tcelcius, tfahrenheit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konversi);
        tcelcius=findViewById(R.id.celcius);
        tfahrenheit=findViewById(R.id.fahrenheit);
    }

    public void konversi (View view){
        double celcius, fahrenheit;
        try {
            celcius=Double.parseDouble(tcelcius.getText().toString());
            fahrenheit=(1.8 * celcius) + 32;
            tfahrenheit.setText(""+fahrenheit);
        } catch (Exception e){
            Context context = getApplicationContext();
            CharSequence error = "Nilai tidak boleh kosong";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, error, duration);
            toast.show();
        }
    }

    public void bersih (View view){
        tcelcius.setText("");
        tfahrenheit.setText("");
    }

    public void kembali(View view){
        finish();
    }
}