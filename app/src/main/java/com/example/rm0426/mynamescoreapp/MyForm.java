package com.example.rm0426.mynamescoreapp;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.Toast;

public class MyForm extends AppCompatActivity {

    private static String STR_NONE       = "";
    private static String STR_INPUT_NAME = "Input your name !";
    private static String STR_ERROR      = "Error !";
    private static String STR_OK         = "OK";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_form);
    }

    public void getScore(View view) {
        // EditTextを取得.
        EditText myEditText = (EditText) findViewById(R.id.myEditText);

        // EditTextの中身を取得.
        String myName = myEditText.getText().toString().trim();

        // 中身を見て条件分岐.
        if(myName.equals(STR_NONE)) {
            // エラー処理.

            /*
            エラー処理種類.
            1. setError
            2. Toast
            3. Dialog
             */

            myEditText.setError(STR_INPUT_NAME);

            //Toast.makeText(MyForm.this,
            //        "Please enter your name!",
            //        Toast.LENGTH_SHORT).show();


            //AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            //alertDialogBuilder
            //        .setTitle(STR_ERROR)
            //        .setMessage(STR_INPUT_NAME)
            //       .setPositiveButton(STR_OK, null);
            //AlertDialog alertDialog = alertDialogBuilder.create();
            //alertDialog.show();

        }
        else {
            // 次の画面(Activity)へ遷移.
        }

    }
}
