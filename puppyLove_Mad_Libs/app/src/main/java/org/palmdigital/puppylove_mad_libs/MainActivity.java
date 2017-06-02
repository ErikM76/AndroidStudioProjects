package org.palmdigital.puppylove_mad_libs.;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.palmdigital.puppylove_mad_libs.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void makeStory(View view)
    {
        EditText et_adj1 = (EditText)findViewById(R.id.adj1);
        EditText et_adj2 = (EditText)findViewById(R.id.adj2);
        EditText et_adj3 = (EditText)findViewById(R.id.adj3);
        EditText et_adj4 = (EditText)findViewById(R.id.adj4);
        EditText et_nationality1 = (EditText)findViewById(R.id.nationality1);
        EditText et_name1 = (EditText)findViewById(R.id.name1);
        EditText et_noun1 = (EditText)findViewById(R.id.noun1);
        EditText et_noun2 = (EditText)findViewById(R.id.noun2);
        EditText et_noun3 = (EditText)findViewById(R.id.noun3);
        TextView tv_story = (TextView)findViewById(R.id.text_view_story);



        String story = "Pizza was invented by an ";
        String story2 = " chef named ";
        String story3 = "To make pizza, you need to take a lump of ";
        String story4 = ", and make a thin round";
        String story5 = " Then you cover it with ";
        String story6 = ", cheese, and fresh chopped ";
        String str_Adj1 = et_adj1.getText().toString();
        String str_Adj2 = et_adj2.getText().toString();
        String str_Adj3 = et_adj3.getText().toString();
        String str_Adj4 = et_adj4.getText().toString();
        String str_Nationality1 = et_nationality1.getText().toString();
        String str_Name1 = et_name1.getText().toString();
        String str_Noun1 = et_noun1.getText().toString();
        String str_Noun2 = et_noun2.getText().toString();
        String str_Noun3 = et_noun3.getText().toString();
        story = story + str_Adj1 + " " + str_Nationality1 + story2 + str_Name1 + ". " +
                story3 + str_Noun1 + story4 +  " " + str_Adj2 + " " + str_Noun2 + "."
                + story5 + str_Adj3 + " sauce, " + str_Adj4 + story6 + str_Noun3;

        tv_story.setText(story);
    }
}
