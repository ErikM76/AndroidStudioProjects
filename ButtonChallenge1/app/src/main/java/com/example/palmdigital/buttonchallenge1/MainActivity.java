package com.example.palmdigital.buttonchallenge1;

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

        Button buttonObject01 = (Button)findViewById(R.id.button1);
        Button buttonObject02 = (Button)findViewById(R.id.button2);
        Button buttonObject03 = (Button)findViewById(R.id.button3);

        buttonObject01.setText("Contacts");
        buttonObject02.setText("Email");
        buttonObject03.setText("Messages");


        buttonObject01.setOnClickListener(this);
        buttonObject02.setOnClickListener(this);
        buttonObject03.setOnClickListener(this);
        buttonObject01.setBackgroundColor(Color.BLUE);
        buttonObject02.setBackgroundColor(Color.GREEN);
        buttonObject03.setBackgroundColor(Color.RED);
    }
    public void onClick(View view)
    {
        if (view.getId() == R.id.button1) {
            Log.i("info", "You selected Contacts!");
            Toast.makeText(this, "You selected Contacts!", Toast.LENGTH_SHORT).show();
        }
        else if (view.getId() == R.id.button2)
        {
            Log.i("info", "You selected Email!");
            Toast.makeText(this, "You selected Email!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Log.i("info", "You selected Message!");
            Toast.makeText(this, "You selected Messages!", Toast.LENGTH_SHORT).show();

        }
    }
}
