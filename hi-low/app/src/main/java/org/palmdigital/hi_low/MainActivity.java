package org.palmdigital.hi_low;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int randomInt = NumberUtils.getRandomInt(1, 10000);
        for (int i = 0; i < 15; i++)
        {
            int guess = MessageBox.askForNumericalInput("What is your guess?");
            Random myRandom = myRandom;
            if (guess == answer)
            {
                Sound.playBeep();
                MessageBox.showMessage("You won the game");
                System.exit(0);
            }
            else if (guess > answer)
            {
                MessageBox.showMessage("Too high!");
            }
            else
            {
                MessageBox.showMessage("Too low!");
            }
        }
        MessageBox.showMessage("You lost");
    }
    }
}
