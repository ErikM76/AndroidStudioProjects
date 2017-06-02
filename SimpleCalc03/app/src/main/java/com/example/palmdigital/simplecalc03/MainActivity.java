package com.example.palmdigital.simplecalc03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageViewPlus;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageViewEqual;

    TextView textView1;
    TextView textView2;
    TextView textView3;

    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageViewPlus = (ImageView) findViewById(R.id.imageViewPlus);
        imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView6 = (ImageView) findViewById(R.id.imageView6);
        imageViewEqual = (ImageView) findViewById(R.id.imageViewEqual);




        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        //imageViewPlus.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);
        imageView6.setOnClickListener(this);
        imageViewEqual.setOnClickListener(this);




        textView1 = (TextView)findViewById(R.id.textView1);
        textView2 = (TextView)findViewById(R.id.textView2);
        textView3 = (TextView)findViewById(R.id.textView3);



    }
    public void onClick(View view) {
        if (view.getId() == R.id.imageView1) {
            textView1.setText("1");
            num1 = 1;
        } else if (view.getId() == R.id.imageView2) {
            textView1.setText("2");
            num1 = 2;
        } else if (view.getId() == R.id.imageView3) {
            textView1.setText("3");
            num1 = 3;
        } else if (view.getId() == R.id.imageView4) {
            textView2.setText("4");
            num2 = 4;
        } else if (view.getId() == R.id.imageView5) {
            textView2.setText("5");
            num2 = 5;
        } else if (view.getId() == R.id.imageView6) {
            textView2.setText("6");
            num2 = 6;
        }
        else if (view.getId() == R.id.imageViewEqual)
        {
            int sum = num1 + num2;
            textView3.setText("" + (num1 + num2));
        }
    }

}

