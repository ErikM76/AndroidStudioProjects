package com.example.palmdigital.cyoav01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FaintActivity extends AppCompatActivity implements View.OnClickListener{

    Button leftButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faint);

        // reffrences

        //TextView
        TextView textView_story    = (TextView) findViewById(R.id.textView_story);


        textView_story.setText("You made a delicious soup! Yum! The end.");


        // buttons

        leftButton = (Button) findViewById(R.id.button_left);

        leftButton.setText("Click to start again!");

        // set clickListeners
        leftButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        if (view.getId() == R.id.button_left)
        {

            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);

        }
    } // end of onclick
}
