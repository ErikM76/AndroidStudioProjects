package com.example.palmdigital.scope2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


//4) Inside each of the methods, declare 5 different variables of the following types:
//  a) int, double, String, TextView, ImageView, Button

// 5) Try to assign values to them inside the same method.

// 6) Try to assign values to them inside a different method

        //7) Then, declare some fields at the top of the MainActivity class write a comment 'fields'

        //8) Make 6 different variable declarations (no assignments though) of 6 different types (see what
        //other types Android has available).

        //9) Then assign each of the fields (classwide variables) different values

        //Add class comment…


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void myAwesomeMethod01()
    {
        int myInt;
        myInt = 1;
        double myDouble;
        myDouble = 1.0;
        String myString;
        myString = "1";
        TextView myTextView_1;
        myTextView_1 = (TextView)findViewById(R.id.textView_1);
        ImageView myImageView_1;
        myImageView_1 = (ImageView) findViewById(R.id.imageView_1);
        Button myButton_1;
        myButton_1 = (Button)findViewById(R.id.button_1);
    }

    public void myAwesomeMethod02()
    {
        int myInt;
        myInt = 2;
        double myDouble;
        myDouble = 2.0;
        String myString;
        myString = "2";
        TextView myTextView_1;
        myTextView_1 = (TextView)findViewById(R.id.textView_1);
        ImageView myImageView_1;
        myImageView_1 = (ImageView) findViewById(R.id.imageView_1);
        Button myButton_1;
        myButton_1 = (Button)findViewById(R.id.button_1);
    }

    public void myAwesomeMethod03()
    {
        int myInt;
        myInt = 3;
        double myDouble;
        myDouble = 3.0;
        String myString;
        myString = "3";
        TextView myTextView_1;
        myTextView_1 = (TextView)findViewById(R.id.textView_1);
        ImageView myImageView_1;
        myImageView_1 = (ImageView) findViewById(R.id.imageView_1);
        Button myButton_1;
        myButton_1 = (Button)findViewById(R.id.button_1);
    }

    public void myAwesomeMethod04()
    {
        int myInt;
        myInt = 4;
        double myDouble;
        myDouble = 4.0;
        String myString;
        myString = "4";
        TextView myTextView_1;
        myTextView_1 = (TextView)findViewById(R.id.textView_1);
        ImageView myImageView_1;
        myImageView_1 = (ImageView) findViewById(R.id.imageView_1);
        Button myButton_1;
        myButton_1 = (Button)findViewById(R.id.button_1);
    }

    public void myAwesomeMethod05()
    {
        int myInt;
        myInt = 5;
        double myDouble;
        myDouble = 5.0;
        String myString;
        myString = "5";
        TextView myTextView_1;
        myTextView_1 = (TextView)findViewById(R.id.textView_1);
        ImageView myImageView_1;
        myImageView_1 = (ImageView) findViewById(R.id.imageView_1);
        Button myButton_1;
        myButton_1 = (Button)findViewById(R.id.button_1);
    }
}
