package com.example.palmdigital.cyoav01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    //buttons

    Button leftButton;
    Button rightButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // reffrences

        //TextView
        TextView textView_story    = (TextView) findViewById(R.id.textView_story);
        TextView textView_question = (TextView) findViewById(R.id.textView_question);


        textView_story.setText("One morning the tortoise woke up in a dream.");
        textView_question.setText("Do you want to 'wake up' or 'explore' the dream?");


        // buttons

        leftButton = (Button) findViewById(R.id.button_left);
        rightButton = (Button) findViewById(R.id.button_right);

        leftButton.setText("Wake Up");
        rightButton.setText("Explore");

        // set clickListeners
        leftButton.setOnClickListener(this);
        rightButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        //wake up
          if (view.getId() == R.id.button_left)
          {
              // send user wake up activity

              Intent i = new Intent(this, WakeUpActivity.class);
              startActivity(i);

          }
            // explore
        if (view.getId() == R.id.button_right)
        {
            // send user to explorer activity

            Intent i = new Intent(this, ExploreActivity.class);
            startActivity(i);
        }
    } // end of onclick
}
