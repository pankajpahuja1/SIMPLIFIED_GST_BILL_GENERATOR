package com.example.pankaj.practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class customer_detail extends AppCompatActivity {
    EditText et,et2,et3;
    String a,b="abc";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_detail);
        et=findViewById(R.id.editText);
        et2=findViewById(R.id.editText2);
        et3=findViewById(R.id.editText3);




        Intent i = getIntent();
        a= i.getStringExtra("GST_NO.");
        a=a.substring(0,2);






    }
    public void saave(View view)
    {
        Intent d=new Intent(customer_detail.this,HSN_NO.class);
        b=et.getText().toString();
        b=b.substring(0,2);

        d.putExtra("custGST_NO",b);
        d.putExtra("GST_NO.",a);
        startActivity(d);
    //et.setText(""+a);
       // a=findViewById(R.id.editText).toString();




    }


   /* public void check(View view){

        et2.setText(""+a);
    }*/
}
