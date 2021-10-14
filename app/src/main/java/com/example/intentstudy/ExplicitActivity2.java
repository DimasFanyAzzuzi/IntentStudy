package com.example.intentstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ExplicitActivity2 extends AppCompatActivity {
    TextView txtHello;
    private String nama;
    private String KET_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit2);
        txtHello = (TextView) findViewById(R.id.txtHello);
        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KET_NAME);
        txtHello.setText("Hello, " + nama + " !");
    }
}