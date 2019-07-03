package com.example.pankaj.practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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
    int q=0;
    double gst;
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
        Log.d("janeman",b+"");
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
    q= Integer.parseInt(et.getText().toString()) ;

    if(q==3406||q==4203||q==4421||q==4600||q==4817||q==4820||q==4819||q==4909||q==4911||q==4900||q==4910||q==6600||q==6601||q==8211||q==8517||q==9503||q==9608||q==9701)
    {
        gst=1.12;
        Intent c= new Intent(HSN_NO.this,calculator.class);
        String p= String.valueOf(gst);
        c.putExtra("GST_%", p);
        startActivity(c);
    }
    else if(q==4902||q==2500||q==4901||q==4903||q==7018||q==8400||q==0600||q==3304)
    {
        gst=1.0;
        Intent c= new Intent(HSN_NO.this,calculator.class);
        String p= String.valueOf(gst);
        c.putExtra("GST_%", p);
        startActivity(c);
    }
    else if(q==3923||q==3926||q==3900||q==3924||q==3907||q==4000||q==4202||q==4800||q==6912||q==6911||q==7018||q==7012)
    {
        gst=1.18;
        Intent c= new Intent(HSN_NO.this,calculator.class);
        String p= String.valueOf(gst);
        c.putExtra("GST_%", p);
        startActivity(c);
    }
    else if(q==1704)
    {
        gst=1.28;
        Intent c= new Intent(HSN_NO.this,calculator.class);
        String p= String.valueOf(gst);
        c.putExtra("GST_%", p);
        startActivity(c);
    }
    else{
        Toast toast= Toast.makeText(getApplicationContext(),"invalid hsn no.",Toast.LENGTH_LONG);
        toast.show();
    }




    Log.d("khalnayak",gst+"");


    // Intent i = new Intent(addition.this, customer_detail.class);
    //            String a = ee1.getText().toString();
  //  i.putExtra("GST_NO.", a);
    // startActivity(i);





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