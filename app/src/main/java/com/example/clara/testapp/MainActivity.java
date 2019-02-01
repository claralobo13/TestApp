package com.example.clara.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     Button b;
     TextView txt,txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.btn);
        txt=findViewById(R.id.txt);
        txt2=findViewById(R.id.txt2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Add();
            }
        });
    }
    private void Add(){

        txt.setText("Pull request");
        txt2.setText("GITHUB Command");
        Intent i=new Intent(MainActivity.this,SecondActivity.class);
        startActivity(i);


    }
}
