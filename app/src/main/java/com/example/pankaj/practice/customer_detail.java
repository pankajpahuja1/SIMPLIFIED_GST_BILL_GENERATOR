package com.example.pankaj.practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class customer_detail extends AppCompatActivity {
    EditText et,et2,et3;
    String a,b="abc",r,t,y;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_detail);
        et=findViewById(R.id.editText);
        et2=findViewById(R.id.ed1);
        et3=findViewById(R.id.editText3);




        Intent i = getIntent();
        a= i.getStringExtra("GST_NO.");
        a=a.substring(0,2);






    }
    public void saave(View view)
    {
        et=findViewById(R.id.editText);
       et2=findViewById(R.id.ed1);
        et3=findViewById(R.id.editText3);

        Intent d=new Intent(customer_detail.this,HSN_NO.class);
        b=et.getText().toString();
        Intent l=new Intent(customer_detail.this,MainActivity.class);
        if(et.getText().toString().equals("")||et2.getText().toString().equals("")||et3.getText().toString().equals("")) {
            Toast toast= Toast.makeText(getApplicationContext(),"All fields are necessary",Toast.LENGTH_LONG);
            toast.show();

            //et.setText(""+a);
            // a=findViewById(R.id.editText).toString();


        }
        else{




            r = et.getText().toString();
            t = et2.getText().toString();
            y = et3.getText().toString();

            l.putExtra("Gstin", r);
            l.putExtra("email", t);
            l.putExtra("add", y);


            if (b.charAt(0)=='0'||b.charAt(0)=='1'||b.charAt(0)=='2'||b.charAt(0)=='3'||b.charAt(0)=='4'||b.charAt(0)=='5'||b.charAt(0)=='6'||b.charAt(0)=='7'||b.charAt(0)=='8'||b.charAt(0)=='9'&&b.charAt(1)=='0'||b.charAt(1)=='1'||b.charAt(1)=='2'||b.charAt(1)=='3'||b.charAt(1)=='4'||b.charAt(1)=='5'||b.charAt(1)=='6'||b.charAt(1)=='7'||b.charAt(1)=='8'||b.charAt(1)=='9') {
                b = b.substring(0, 2);

                d.putExtra("custGST_NO", b);
                d.putExtra("GST_NO.", a);
                startActivity(d);

            } else {
                Toast toast = Toast.makeText(getApplicationContext(), "invalid GST no", Toast.LENGTH_SHORT);
                toast.show();
            }

        }

    }


   /* public void check(View view){

        et2.setText(""+a);
    }*/
}
