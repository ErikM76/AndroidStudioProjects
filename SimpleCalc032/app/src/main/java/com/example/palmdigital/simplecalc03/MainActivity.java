package com.example.palmdigital.simplecalc03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity  implements View.OnClickListener{


    ImageView imageView0;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;
    ImageView imageView9;
    ImageView imageViewPlus;
    ImageView imageViewMinus;
    ImageView imageView00;
    ImageView imageView01;
    ImageView imageView02;
    ImageView imageView03;
    ImageView imageView04;
    ImageView imageView05;
    ImageView imageView06;
    ImageView imageView07;
    ImageView imageView08;
    ImageView imageView09;
    ImageView imageViewEquals;


    TextView textView1;
    TextView textView2;
    TextView textView3;

    int operator;

    int num1, num2;
    int solved;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);







        imageView0 = (ImageView)findViewById(R.id.imageView0);
        imageView1 = (ImageView)findViewById(R.id.imageView1);
        imageView2 = (ImageView)findViewById(R.id.imageView2);
        imageView3 = (ImageView)findViewById(R.id.imageView3);
        imageView4 = (ImageView)findViewById(R.id.imageView4);
        imageView5 = (ImageView)findViewById(R.id.imageView5);
        imageView6 = (ImageView)findViewById(R.id.imageView6);
        imageView7 = (ImageView)findViewById(R.id.imageView7);
        imageView8 = (ImageView)findViewById(R.id.imageView8);
        imageView9 = (ImageView)findViewById(R.id.imageView9);
        imageViewPlus = (ImageView)findViewById(R.id.imageViewPlus);
        imageViewMinus = (ImageView)findViewById(R.id.imageViewMinus);
        imageView00 = (ImageView)findViewById(R.id.imageView00);
        imageView01 = (ImageView)findViewById(R.id.imageView01);
        imageView02 = (ImageView)findViewById(R.id.imageView02);
        imageView03 = (ImageView)findViewById(R.id.imageView03);
        imageView04 = (ImageView)findViewById(R.id.imageView04);
        imageView05 = (ImageView)findViewById(R.id.imageView05);
        imageView06 = (ImageView)findViewById(R.id.imageView06);
        imageView07 = (ImageView)findViewById(R.id.imageView07);
        imageView08 = (ImageView)findViewById(R.id.imageView08);
        imageView09 = (ImageView)findViewById(R.id.imageView09);
        imageViewEquals = (ImageView)findViewById(R.id.imageViewEqual);






        imageView0.setOnClickListener(this);
        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);
        imageView6.setOnClickListener(this);
        imageView7.setOnClickListener(this);
        imageView8.setOnClickListener(this);
        imageView9.setOnClickListener(this);
        imageViewPlus.setOnClickListener(this);
        imageViewMinus.setOnClickListener(this);
        imageView00.setOnClickListener(this);
        imageView01.setOnClickListener(this);
        imageView02.setOnClickListener(this);
        imageView03.setOnClickListener(this);
        imageView04.setOnClickListener(this);
        imageView05.setOnClickListener(this);
        imageView06.setOnClickListener(this);
        imageView07.setOnClickListener(this);
        imageView08.setOnClickListener(this);
        imageView09.setOnClickListener(this);
        imageViewEquals.setOnClickListener(this);



        textView1 = (TextView)findViewById(R.id.textView1);
        textView2 = (TextView)findViewById(R.id.textView2);
        textView3 = (TextView)findViewById(R.id.textView3);


    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.imageView0)
        {
            textView1.setText("0");
            num1 = 0;
        }
      else if (view.getId() == R.id.imageView1)
        {
            textView1.setText("1");
            num1 = 1;
        }
        else if (view.getId() == R.id.imageView2)
        {
            textView1.setText("2");
            num1 = 2;
        }
        else if (view.getId() == R.id.imageView3)
        {
            textView1.setText("3");
            num1 = 3;
        }
        else if (view.getId() == R.id.imageView4)
        {
            textView1.setText("4");
            num1 = 4;
        }
        else if (view.getId() == R.id.imageView5)
        {
            textView1.setText("5");
            num1 = 5;
        }
        else if (view.getId() == R.id.imageView6)
        {
            textView1.setText("6");
            num1 = 6;
        }
        else if (view.getId() == R.id.imageView7)
        {
            textView1.setText("7");
            num1 = 7;
        }
        else if (view.getId() == R.id.imageView8)
        {
            textView1.setText("8");
            num1 = 8;
        }
        else if (view.getId() == R.id.imageView9)
        {
            textView1.setText("9");
            num1 = 9;
        }
        if (view.getId() == R.id.imageView00)
        {
            textView2.setText("0");
            num2 = 0;
        }
        else if (view.getId() == R.id.imageView01)
        {
            textView2.setText("1");
            num2 = 1;
        }
        else if (view.getId() == R.id.imageView02)
        {
            textView2.setText("2");
            num2 = 2;
        }
        else if (view.getId() == R.id.imageView03)
        {
            textView2.setText("3");
            num2 = 3;
        }
        else if (view.getId() == R.id.imageView04)
        {
            textView2.setText("4");
            num2 = 4;
        }
        else if (view.getId() == R.id.imageView05)
        {
            textView2.setText("5");
            num2 = 5;
        }
        else if (view.getId() == R.id.imageView06)
        {
            textView2.setText("6");
            num2 = 6;
        }
        else if (view.getId() == R.id.imageView07)
        {
            textView2.setText("7");
            num2 = 7;
        }
        else if (view.getId() == R.id.imageView08)
        {
            textView2.setText("8");
            num2 = 8;
        }
        else if (view.getId() == R.id.imageView09)
        {
            textView2.setText("9");
            num2 = 9;
        }
        if (view.getId() == R.id.imageViewPlus)
        {
            operator = 0;
            imageViewPlus.setBackgroundColor(0xff00ffff);
            imageViewMinus.setBackgroundColor(0);
        }
        else if (view.getId() == R.id.imageViewMinus)
        {
            operator  = 1;
            imageViewPlus.setBackgroundColor(0);
            imageViewMinus.setBackgroundColor(0xff00ffff);
        }
        if (view.getId() == R.id.imageViewEqual)
        {
            textView3.setText("" + solved);
            if (operator ==0)
            {
                solved = num1 + num2;
            }
            else if (operator ==1)
            {
                solved = num1 - num2;
            }
        }

    }
}
