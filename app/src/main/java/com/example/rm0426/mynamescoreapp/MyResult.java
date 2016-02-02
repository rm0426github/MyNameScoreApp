package com.example.rm0426.mynamescoreapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MyResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_result);

        Intent intent = getIntent();
        String myName = intent.getStringExtra(MyForm.EXTRA_NAME);
        TextView namelabel = (TextView) findViewById(R.id.namelabel);
        namelabel.setText(myName);
    }
}
