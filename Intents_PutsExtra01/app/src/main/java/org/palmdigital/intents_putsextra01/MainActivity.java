package org.palmdigital.intents_putsextra01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void next01(View view)
    {
        //references
        EditText et_adj01 = (EditText)findViewById(R.id.edit_text_adj1);


        String str_adj01 = et_adj01.getText().toString();


        String story = "Pizza was invented by a " + str_adj01 + " chef.";


        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("STORY_SO_FAR", story);


        startActivity(i);
    }



}
