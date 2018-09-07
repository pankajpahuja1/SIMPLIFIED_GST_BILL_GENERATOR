package com.example.pankaj.practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class HSN_NO extends AppCompatActivity {
    String a,b,data="qwe";
    Boolean c;
    EditText et;
    TextView t;
    private String file = "mydata";

    //String d="soejef";
    //byte x=11;
    //long g;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hsn__no);
        et=findViewById(R.id.editText4);
        t=findViewById(R.id.textView5);

        Intent d = getIntent();
        b=d.getStringExtra("custGST_NO");
        a= d.getStringExtra("GST_NO.");
        c=a.equals(b);
        if(c){
            t.setText("SGST/CGST APPLICABLE");
        }
        else{
            t.setText("IGST APPLICABLE");

        }
       /* File f=new File(getFilesDir(),"baa.txt");
        try {
            //f.createNewFile();
            //g=false;
            //g=f.exists();

           FileOutputStream fout =new FileOutputStream(file,true);
            fout.write(d.getByteExtra("dasdfff",x));

            fout.close();
            g=file.length();



        }catch(Exception e){t.setText("guilty");}



        //et.setText(""+c);*/

    }

public  void calc(View view)
{
    Intent c= new Intent(HSN_NO.this,calculator.class);
    startActivity(c);
   //et.setText(""+g);
    /*try {
        FileOutputStream fOut = openFileOutput(file,MODE_APPEND);
        fOut.write(data.getBytes());
        fOut.close();
        Toast.makeText(getBaseContext(),"file saved",Toast.LENGTH_SHORT).show();
    }
    catch (Exception e) {

        t.setText("error");
    }*/

   /* try{
        FileInputStream fin = openFileInput(file);
        int c;
        String temp="";
        while( (c = fin.read()) != -1){ temp = temp + Character.toString((char)c);
    }
        getFilesDir();
        t.setText(temp);
        Toast.makeText(getBaseContext(),"file read",Toast.LENGTH_SHORT).show();
    }

        catch(Exception e){
        t.setText("guilty");
    }*/
}
}