package com.example.admin.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        int value1 = intent.getIntExtra("VALUE1", 0);
        int value2 = intent.getIntExtra("VALUE2", 0);

        TextView textView = (TextView) findViewById(R.id.textView);

    //public void onClick(View v) {
        if (v.getId() == R.id.button1) {
            textView.setText(String.valueOf(value1 + value2));
        } else if (v.getId() == R.id.button2) {
            textView.setText(String.valueOf(value1 - value2));
        } else if (v.getId() == R.id.button3) {
            textView.setText(String.valueOf(value1 * value2));
        } else if (v.getId() == R.id.button4)
            textView.setText(String.valueOf(value1 / value2));

    }
}