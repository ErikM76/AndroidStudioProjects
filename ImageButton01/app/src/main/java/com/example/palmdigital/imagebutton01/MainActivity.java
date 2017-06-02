package com.example.palmdigital.imagebutton01;

import android.graphics.Color;
import android.provider.CalendarContract;
import android.
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.palmdigital.imagebutton01.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton imageButtonObject01 = (ImageButton)findViewById(R.id.imageButton01);
        ImageButton imageButtonObject02 = (ImageButton)findViewById(R.id.imageButton02);

        imageButtonObject01.setOnClickListener(this);
        imageButtonObject02.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        if (view.getId() == R.id.imageButton01) {
            Log.i("info", "You selected the Left arrow!");
            Toast.makeText(this, "You selected the Left arrow!", Toast.LENGTH_SHORT).show();
        }
        else if (view.getId() == R.id.imageButton02)
        {
            Log.i("info", "You selected the Right arrow!");
            Toast.makeText(this, "You selected the Right arrow!", Toast.LENGTH_SHORT).show();
        }
    }
}
