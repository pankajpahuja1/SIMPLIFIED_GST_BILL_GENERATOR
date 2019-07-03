package com.example.pankaj.practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

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



            Intent i = new Intent(addition.this, customer_detail.class);
            String a = ee1.getText().toString();



            if(a.charAt(0)=='0'||a.charAt(0)=='1'||a.charAt(0)=='2'||a.charAt(0)=='3'||a.charAt(0)=='4'||a.charAt(0)=='5'||a.charAt(0)=='6'||a.charAt(0)=='7'||a.charAt(0)=='8'||a.charAt(0)=='9'&&a.charAt(1)=='0'||a.charAt(1)=='1'||a.charAt(1)=='2'||a.charAt(1)=='3'||a.charAt(1)=='4'||a.charAt(1)=='5'||a.charAt(1)=='6'||a.charAt(1)=='7'||a.charAt(1)=='8'||a.charAt(1)=='9')
            {

                i.putExtra("GST_NO.", a);
                startActivity(i);
            }
            else {
                Toast  toast=Toast.makeText(getApplicationContext(),"invalid GST no",Toast.LENGTH_SHORT);
                toast.show();
            }

      //  else
       // {
        //    Toast.makeText();
        // }
    }
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("message");
   // myRef.setValue("Hello, World!");
}

