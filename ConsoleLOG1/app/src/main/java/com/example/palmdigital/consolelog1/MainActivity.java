package com.example.palmdigital.consolelog1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int myInt = 4;
        double myDouble = 4.5;
        float myFloat = 4.4f;

        String myString = "hey I'm a string";

        System.out.println(myInt);
        System.out.println(myDouble);

        Log.i("info", "myInt - " + myInt); // info myInt = 4
        Log.i("info", "myDouble = " + myDouble);
        Log.i("info", "myFloat = " + myFloat);
        Log.i("info", "myString = " + myString);

        if (myInt == 10)
        {
            Log.i("info", "the test is true")
        }
        else
        {
            Log.i("info", "the test is false")

        }
    }
}
