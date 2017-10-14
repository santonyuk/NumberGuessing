package com.greenriver.it.sofiyaantonyuk.numberguessing;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LandingActivity extends AppCompatActivity {
    LandingActivity activity;
    Button startButton;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        locateViews();
        bindFunctionality();
    }

    void bindFunctionality() {
    startButton.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(activity.getApplicationContext(), GuessingActivity.class);
            activity.startActivity(intent);
        }
    });
    }

    // locate views
    void locateViews() {
        startButton = (Button) findViewById(R.id.startButton);
    }


}
