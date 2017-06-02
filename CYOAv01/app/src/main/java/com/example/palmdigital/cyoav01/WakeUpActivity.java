package com.example.palmdigital.cyoav01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WakeUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wake_up);


        // reffrences

        //TextView
        TextView textView_story    = (TextView) findViewById(R.id.textView_story);


        textView_story.setText("You wake up and have a boring day. The end.");
    }
}
