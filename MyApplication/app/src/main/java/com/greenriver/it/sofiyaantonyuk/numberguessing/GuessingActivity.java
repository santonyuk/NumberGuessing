package com.greenriver.it.sofiyaantonyuk.numberguessing;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
                //if random number == inputNumber
                //then it's correct then result correct
                //open results activity

                //Intent intent = new Intent(getApplicationContext(), GuessingActivity.class);
                //startActivity(intent);

                //if random numer >< inputNumber
                //then not correct then result incorrect try again
                //display toast to user that input is >< number
            }
        });
    }
}
