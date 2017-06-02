package com.example.palmdigital.cyoav01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ExploreActivity extends AppCompatActivity implements View.OnClickListener{

    //buttons

    Button leftButton;
    Button rightButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        // reffrences

        //TextView
        TextView textView_story    = (TextView) findViewById(R.id.textView_story);
        TextView textView_question = (TextView) findViewById(R.id.textView_question);


        textView_story.setText("You approach a glowing, green bucket of ooze. Worried that you will get in trouble, you pick up the bucket.");
        textView_question.setText("Do you want to pour the ooze into the 'backyard' or 'toilet'?");


        // buttons

        leftButton = (Button) findViewById(R.id.button_left);
        rightButton = (Button) findViewById(R.id.button_right);

        leftButton.setText("backyard");
        rightButton.setText("toilet");

        // set clickListeners
        leftButton.setOnClickListener(this);
        rightButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        //backyard
        if (view.getId() == R.id.button_left)
        {
            // send user backyard activity

            Intent i = new Intent(this, BackyardActivity.class);
            startActivity(i);

        }
        // toilet
        if (view.getId() == R.id.button_right)
        {
            // send user to toilet activity

            Intent i = new Intent(this, ToiletActivity.class);
            startActivity(i);
        }
    } // end of onclick
}
