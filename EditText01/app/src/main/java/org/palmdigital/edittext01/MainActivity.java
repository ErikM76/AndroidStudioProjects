package org.palmdigital.edittext01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        TextView result = (TextView) findViewById(R.id.text_view_result);
        EditText first = (EditText) findViewById(R.id.editText_first);
        EditText last = (EditText) findViewById(R.id.editText_last);

        String fName = "Your name is: ";
        fName += first.getText().toString(); // error!
        fName += last.getText().toString();

        result.setText(fName);

    }
}
