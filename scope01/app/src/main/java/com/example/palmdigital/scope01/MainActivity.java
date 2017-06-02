package com.example.palmdigital.scope01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

// we are outside the MainActivity class
// we are outside any methods

// Understanding how scope works is very important!

public class MainActivity extends AppCompatActivity
{


    //fields, have class wide scopes-- any code can see and use these variables

    String myString;

    double enemyHealth;



    // in the MainActivity class, but I'm outside any methods

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // here, we are inside the onCreate() method, which is inside
        // the MainActivity class

        // when we declare 'declare' or 'define' a variable, we use the following format:
        // dataType variableName; <--- this is a variable declaration/definition
        // some examples
        int myInt; // <-- this is declaring a variable of dataType 'int' and named 'myInt'
        double myDouble; // <--- this is declaring a variable of dataType 'double' named 'myDouble'
        TextView textView_story; // <--- this is declaring variable of dataType 'textView' named
                    //textView_story
        ImageView imageView_ex; // <--- this is declaring variable of dataType 'textView' named
                    //textView_ex

        // assigning a value to a declared variable
        // after we declare a variable, we can assign a value to it
        //variableName = someValueOfTheSameDataTypeAsTheVariable;
        //some examples:

        myInt = 10; // <--- setting the value of myInt to 10, myInt has dataType 'Int' & 10 is an int
        myDouble = 20.12; //myDouble gets the value 20.12
        textView_story = (TextView) findViewById(R.id.textView_st); // set the value of
                                                                //textView_story to the UI element
                                                                // R.id.textView_st

        imageView_ex = (ImageView) findViewById(R.id.imageView_android_guy);

       // you know you can declare and assign in the same stop
        // dataType variableName = someValueOfTheSameDataTypeAsTheVariable;
        //some examples:
        int myInt2 = 25; // <--- this a declaration AND assignment
        myInt2 = 50; // <--- this is only an assignment
        // THE DIFFERENCE IS the dataType!!!!!! 'int'
        myString = "this is a string"; //deceleration and assignment
        myString = "this is another string"; // just an assignment

        enemyHealth = 25.15;

        // declare a variable and determines it's scope
        // code in onCreate() cen see it... let's prove this...

    } // end of onCreate
    public void myAwesomeMethod01()
    {
        myString = "what's going on";

        enemyHealth = 1.14;

    } // end of myAwesomeMethod01()

    public void  myAwesomeMethod02()
    {
        enemyHealth = 6.18;

    }
}   // end of class
