package com.example.admin.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mEditText1;
    EditText mEditText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText1 = (EditText) findViewById(R.id.editText1);
        //textView.setText("VALUE1");

        mEditText2 = (EditText) findViewById(R.id.editText2);
        //textView.setText("VALUE2");


        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("VALUE1", mEditText1);
        intent.putExtra("VALUE2", mEditText2);
        startActivity(intent);
    }
}
