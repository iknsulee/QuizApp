package com.example.android.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswer(View view) {
        Context context = getApplicationContext();

        String toastMessage = "Result";
        toastMessage += "\nQuiz1: correct";
        toastMessage += "\nQuiz2: wrong answer";
        toastMessage += "\nQuiz3: correct";
        toastMessage += "\nQuiz4: wrong answer";
        toastMessage += "\nQuiz5: correct";

        CharSequence text = toastMessage;
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
