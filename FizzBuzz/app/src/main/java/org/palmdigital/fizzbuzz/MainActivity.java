package org.palmdigital.fizzbuzz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Calculate(View v)
    {
        EditText eInput = (EditText) findViewById(R.id.editText);
        TextView eOutput = (TextView) findViewById(R.id.textView2);

        String strInput = eInput.getText().toString();

        int input = Integer.parseInt(strInput);



        if (eInput == null)
        {
            eOutput.setText("Please enter a number!");
        }

       else if (input%5 == 0)
        {
            if (input%3 == 0)
            {
                eOutput.setText("Fizz Buzz");
            }
            else
            {
                eOutput.setText("Buzz");
            }
        }
        else if (input% 3 == 0)
        {
            eOutput.setText("Fizz");
        }

        else
        {
            eOutput.setText(strInput);
        }

    }
}
