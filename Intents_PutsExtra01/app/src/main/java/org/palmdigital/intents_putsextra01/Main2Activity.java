package org.palmdigital.intents_putsextra01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity
{
    String newString;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //references

        if (savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if (extras == null)
            {
                newString = null;
            }
            else
            {
                newString = extras.getString("STORY_SO_FAR");
            }
        }
        else
        {
            newString = (String) savedInstanceState.getSerializable("STORY_SO_FAR");
        }



    }
}
