package com.example.pankaj.practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Integer.parseInt;

public class calculator extends AppCompatActivity {
    TextView tv1;
    Button bn9,bn10,bn11,bn12,bn5,bn6,bn7,bn30,bn15;
    String b;
    int r=0/*for operators*/,o=0;
    float p=0,q=0,s,gt;
    boolean g;//for decimal button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        tv1=findViewById(R.id.tv1);
        bn9=findViewById(R.id.bn9);
        bn10=findViewById(R.id.bn10);
        bn11=findViewById(R.id.bn11);
        bn12=findViewById(R.id.bn12);
        bn5=findViewById(R.id.bn5);
        bn6=findViewById(R.id.bn6);
        bn7=findViewById(R.id.bn7);
        bn9=findViewById(R.id.bn8);
        bn30=findViewById(R.id.bn30);
        bn15=findViewById(R.id.bn15);














    }
    public void show(View view)
    {

       int id= view.getId();

        if(id==R.id.bn6){


            if(r==0)
            {
                p=(p*10)+1;

                if(g){p=p/10;
                tv1.setText(""+p);}
                else{tv1.setText(""+p);}

            }
            else
            {
                q=(q*10)+1;
                if(g){q=q/10;
                tv1.setText(""+q);}
                else{tv1.setText(""+q);}}

        }

        if(id==R.id.bn7){
            if(r==0){
                p=(p*10)+2;
                if(g){p=p/10;
                tv1.setText(""+p);}
                else{tv1.setText(""+p);}}
            else{
                q=(q*10)+2;
                if(g){q=q/10;
                tv1.setText(""+q);}
                else{tv1.setText(""+q);}}

        }
        if(id==R.id.bn8){
            if(r==0){
                p=(p*10)+3;
                if(g){p=p/10;
                tv1.setText(""+p);}
                else{tv1.setText(""+p);}}
            else{
                q=(q*10)+3;
                if(g){q=q/10;tv1.setText(""+q);}
                else{tv1.setText(""+q);}}

        }


        if(id==R.id.bn17){
            if(r==0){
                p=(p*10)+4;
                if(g){p=p/10;
                tv1.setText(""+p);}
                else{tv1.setText(""+p);}}
            else{
                q=(q*10)+4;
                if(g){q=q/10;tv1.setText(""+q);}
                else{tv1.setText(""+q);}}

        }

        if(id==R.id.bn18){
            if(r==0){
                p=(p*10)+5;
                if(g){p=p/10;
                tv1.setText(""+p);}
                else{tv1.setText(""+p);}}
            else
            { q=(q*10)+5;
                if(g){q=q/10;tv1.setText(""+q);}
                else{tv1.setText(""+q);}}

        }
        if(id==R.id.bn19){
            if(r==0) {
                p = (p * 10) + 6;
                if(g){p=p/10;
                tv1.setText(""+p);}
                else{tv1.setText(""+p);}
            }
            else{
                q=(q*10)+6;
                if(g){q=q/10;tv1.setText(""+q);}
                else{tv1.setText(""+q);}}

        }

        if(id==R.id.bn20){
            if(r==0){
                p=(p*10)+7;
                if(g){p=p/10;
                tv1.setText(""+p);}
                else{tv1.setText(""+p);}}
            else{
                q=(q*10)+7;
                if(g){q=q/10;tv1.setText(""+q);}
                else{tv1.setText(""+q);}}

        }

        if(id==R.id.bn21){
            if(r==0){
                p=(p*10)+8;
                if(g){p=p/10;
                    tv1.setText(""+p);}
                else{tv1.setText(""+p);}}
            else{
                q=(q*10)+8;

                if(g){q=q/10;
                tv1.setText(""+q);}
                else{tv1.setText(""+q);}}

        }
        if(id==R.id.bn22){
            if(r==0){
                p=(p*10)+9;
                if(g){p=p/10;
                tv1.setText(""+p);}
                else{tv1.setText(""+p);}}
            else{
                q=(q*10)+9;
                if(g){q=q/10;tv1.setText(""+q);}
                else{tv1.setText(""+q);}}

        }





        if(id==R.id.bn23) {
            if (r == 0) {
                p = (p * 10) + 0;
                if(g){p=p/10;
                tv1.setText(""+p);}
                else{tv1.setText(""+p);}
            } else {
                q = (q * 10) + 0;
                if(g){q=q/10;tv1.setText(""+q);}
                else{tv1.setText(""+q);}
            }
        }
        if(id==R.id.bn24) {
           float k= Float.parseFloat(tv1.getText().toString())*100;
           tv1.setText(""+k);
        }



            if(id==R.id.bn25) {

                    g=true;
                  //  p = (p * 10) + 0;
                    //p= p/10;
                    //tv1.setText(p + ".");
               // } else {
                    //q = (q * 10) + 0;
                    //q=q/10;
                    //tv1.setText(q + ".");

            }















        if(id==R.id.bn30){

            Intent i = getIntent();

           b=i.getStringExtra("GST_%");
            Log.d("before",b+"");
            float f=0;
             String g= tv1.getText().toString();

            f=Float.parseFloat(g);
            Float k= Float.parseFloat(b);
            f=f * k ;
            Log.d("before",f+"");

            tv1.setText(""+f);

        }
        if(id==R.id.btn31){

            Intent i = getIntent();

            b=i.getStringExtra("GST_%");
            Log.d("before",b+"");
            float f=0;
            String g= tv1.getText().toString();

            f=Float.parseFloat(g);
            Float k= Float.parseFloat(b);
            f=f/k ;
            Log.d("before",f+"");

            tv1.setText(""+f);

        }


      //  Intent d = getIntent();
      //  b=d.getStringExtra("custGST_NO");

        if(id==R.id.bn15) {
            Intent i= new Intent(calculator.this,MainActivity.class);
            startActivity(i);
        }



        if(id==R.id.bn13)//for GT
        {
            if(gt==0) {
                gt = s;
                s = 0;
                p = 0;
                q = 0;
                r = 0;
                o=0;
                g=false;
                tv1.setText("GT =" + gt);
            }
            else
            {
              switch(r) {

                  case 1: s=s+gt;
                      break;
                  case 2:s=s-gt;
                      break;
                  case 3:s=s*gt;
                      break;
                  case 4:s=s/gt;
                      break;
              }

              gt=0;
              tv1.setText("grand total is" +s);
            }

        }









        if(id==R.id.bn9)//operators
        {
            r=1;
            g=false;

        }
        if(id==R.id.bn10){
            r=2;
            g=false;

        }
        if(id==R.id.bn11){
        r=3;
            g=false;
        }

        if(id==R.id.bn12){
        r=4;
            g=false;


        } //operator ends

        if(id==R.id.bn14)//for cancel
        {
        r=0;
        p=0;
        q=0;
        s=0;
        gt=0;
        o=0;
            g=false;
        tv1.setText(""+s);
    }
        if(id==R.id.bn5)
        //for =
            {
            switch (r){
                case 0:
                   s=0;
                   tv1.setText(""+s);
                    break;


                case 1:if(o>0){
                    s=s+q;}
                else{
                s =p+q;}
                break;


                case 2:if(o>0){
                    s=s-q;}
                else
                    s =p+q;
                    break;


                case 3:if(o>0){
                        s =s*q;}
                else{
                    s=p*q;}

                    break;


                case 4: try{
                    if(o>0)
                s =s/q;
                else
                    s=p/q;}
                    catch(Exception e)
                    {
                        tv1.setText("divide by zero(0) not defined");
                    }

                    break;

            }
            g=false;
            q=0;
            o++;
            tv1.setText("Ans is "+ s);
        }
    }
}
