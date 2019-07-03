package com.example.pankaj.practice;

import android.content.Context;
import android.content.Intent;
import android.graphics.pdf.PdfDocument;
import android.os.Build;
import android.print.PrintAttributes;
import android.print.pdf.PrintedPdfDocument;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String z,v,c;
    TextView tv1,tv2,tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // PrintedPdfDocument document = new PrintedPdfDocument(this ,PrintAttributes.Margins(50,50, 50,50));
       // PdfDocument.Page=document.startPage(0);
        tv1=findViewById(R.id.textView2);
        tv2=findViewById(R.id.textView6);
        tv3=findViewById(R.id.textView7);

        Intent l=getIntent();
        z=l.getStringExtra("Gstin");
        v=l.getStringExtra("email");
        c=l.getStringExtra("add");
        Log.d("gabbar",v+"");
        tv1.setText(z+"");
        tv2.setText(v+"");
        tv3.setText(c+"");


    }
}
