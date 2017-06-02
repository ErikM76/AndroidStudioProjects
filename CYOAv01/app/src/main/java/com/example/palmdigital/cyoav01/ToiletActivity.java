package com.example.palmdigital.cyoav01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ToiletActivity extends AppCompatActivity implements View.OnClickListener{

    //buttons

    Button leftButton;
    Button rightButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toilet);

        // reffrences

        //TextView
        TextView textView_story    = (TextView) findViewById(R.id.textView_story);
        TextView textView_question = (TextView) findViewById(R.id.textView_question);


        textView_story.setText("As you pour the ooze into the toilet it backs up, gurgles, and explodes, covering you in radioactive waste.");
        textView_question.setText("Do you want to train to be a NINJA?  'Yes' or 'HECK YES'?");


        // buttons

        leftButton = (Button) findViewById(R.id.button_left);
        rightButton = (Button) findViewById(R.id.button_right);

        leftButton.setText("Yes");
        rightButton.setText("HECK YES");

        // set clickListeners
        leftButton.setOnClickListener(this);
        rightButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        //Yes
        if (view.getId() == R.id.button_left)
        {
            // send user Yes activity

            Intent i = new Intent(this, YesActivity.class);
            startActivity(i);

        }
        // HECK YES
        if (view.getId() == R.id.button_right)
        {
            // send user to HECK YES activity

            Intent i = new Intent(this, HECKYESActivity.class);
            startActivity(i);
        }
    } // end of onclick
    }

