package com.example.palmdigital.button3;

import android.graphics.Color;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject01 = (Button)findViewById(R.id.buttonMyButton1);
        Button buttonObject02 = (Button)findViewById(R.id.buttonMyButton2);
        buttonObject01.setText("The Blue Pill");
        buttonObject02.setText("The Red Pill");

        buttonObject01.setOnClickListener(this);
        buttonObject02.setOnClickListener(this);
        buttonObject01.setBackgroundColor(Color.BLUE);
        buttonObject02.setBackgroundColor(Color.RED);
    }
    public void onClick(View view)
    {
        if (view.getId() == R.id.buttonMyButton1) {
            Log.i("info", "Hey you pressed the button");
            Toast.makeText(this, "You took the blue pill", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Log.i("info", "You took the red pill");
            Toast.makeText(this, "You took the red pill!", Toast.LENGTH_SHORT).show();
        }
    }
}
