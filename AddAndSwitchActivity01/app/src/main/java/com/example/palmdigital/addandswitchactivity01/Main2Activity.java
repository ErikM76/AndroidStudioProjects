package com.example.palmdigital.addandswitchactivity01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wake_up);


        Button buttonSwitch = (Button) findViewById(R.id.button_switch);
        buttonSwitch.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
            // here's the screen-switching code
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
    }
}

