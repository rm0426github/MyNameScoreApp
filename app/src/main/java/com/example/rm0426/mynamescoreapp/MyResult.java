package com.example.rm0426.mynamescoreapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class MyResult extends AppCompatActivity {

    private static final String STR_SCORE   = "'s score";
    private static final String STR_PT      = "pt !!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_result);

        Intent intent = getIntent();
        String myName = intent.getStringExtra(MyForm.EXTRA_NAME);
        TextView namelabel = (TextView) findViewById(R.id.namelabel);
        namelabel.setText(myName + STR_SCORE);

        Random randomGenerator = new Random();
        int score = randomGenerator.nextInt(101); //0-100

        TextView scorelabel = (TextView) findViewById(R.id.scorelabel);
        scorelabel.setText(String.valueOf(score) + STR_PT);

    }
}
