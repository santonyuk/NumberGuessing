package com.greenriver.it.sofiyaantonyuk.numberguessing;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {
    TextView displayResult;
    Button playAgainButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        locateViews();
        bindFunctionality();

        //number of guesses will show up
        if (getIntent().hasExtra(GuessingActivity.intentTag)) {
            //set text to data paired with intent tag
            displayResult.setText(getIntent().getStringExtra(GuessingActivity.intentTag));
        }
    }

    void bindFunctionality() {
        playAgainButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //go back to Landing Activity
                Intent intent = new Intent(getApplicationContext(), LandingActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    void locateViews() {
        playAgainButton = (Button) findViewById(R.id.playAgainButton);
        displayResult = (TextView) findViewById(R.id.displayResult);
    }
}
