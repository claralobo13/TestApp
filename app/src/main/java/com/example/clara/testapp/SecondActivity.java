package com.example.clara.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements Calculator {
TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txt1=findViewById(R.id.txt1);
    }

    @Override
    public void calculation(double d1, double d2) {
        double c=d1+d2;
        txt1.setText("Result is "+c);
    }
}
