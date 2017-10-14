package com.greenriver.it.sofiyaantonyuk.numberguessing;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class GuessingActivity extends AppCompatActivity {
    GuessingActivity activity;
    Button checkButton;
    EditText enterNumber;
    int randNumber;
    int low = 1;
    int high = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guessing);

        locateViews();
        bindFunctionality();

        //create random number
        randNumber = (int)(Math.random() * high + 1);
        Log.d("d", "Random number: " + String.valueOf(randNumber));
    }

    void locateViews() {
        checkButton = (Button) findViewById(R.id.checkButton);
        enterNumber = (EditText) findViewById(R.id.enterNumber);
    }

    void bindFunctionality() {
        checkButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //get the number
                String inputString = enterNumber.getText().toString();
                int inputInt = 0;

                //if there is no number toast to enter a number
                try {
                    inputInt = Integer.parseInt(inputString);
                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "Please enter a number",
                            Toast.LENGTH_SHORT).show();
                }

                //check the number
                if (randNumber == inputInt) {
                    //then it's correct then result correct
                    //open results activity

                    Intent intent = new Intent(getApplicationContext(), ResultsActivity.class);
                    startActivity(intent);
                }
                else if (randNumber > inputInt) {
                    //number is higher
                    Toast.makeText(getApplicationContext(), "Try again! The number is too low",
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Try again! The number is too high",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
