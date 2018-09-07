package com.example.pankaj.practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class addition extends AppCompatActivity {
    EditText ee1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);
        ee1= findViewById(R.id.ee1);

    }
    public void abc(View view)
    {
        Intent i=new Intent(addition.this,customer_detail.class);
        String a=ee1.getText().toString();
        i.putExtra("GST_NO.",a);
    startActivity(i);
    }
}

