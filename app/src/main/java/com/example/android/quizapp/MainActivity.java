package com.example.android.quizapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswer(View view) {
        score = 0;

        String quiz1Message = getQuiz1ResultMessage();
        String quiz2Message = getQuiz2ResultMessage();
        String quiz3Message = getQuiz3ResultMessage();
        String quiz4Message = getQuiz4ResultMessage();

        // toast message
        Context context = getApplicationContext();

        String toastMessage = "Result";
        toastMessage += "\nScore: " + score;
        toastMessage += "\nQuiz1: " + quiz1Message;
        toastMessage += "\nQuiz2: " + quiz2Message;
        toastMessage += "\nQuiz3: " + quiz3Message;
        toastMessage += "\nQuiz4: " + quiz4Message;

        CharSequence text = toastMessage;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    private String getQuiz4ResultMessage() {
        // checkbox
        CheckBox checkLarryPage = (CheckBox) findViewById(R.id.check_larry_page);
        CheckBox checkBoxSergeyBrin = (CheckBox) findViewById(R.id.check_sergey_brin);
        CheckBox checkBoxSteveJobs = (CheckBox) findViewById(R.id.check_steve_jobs);

        boolean hasLarryPage = checkLarryPage.isChecked();
        boolean hasBoxSergeyBrin = checkBoxSergeyBrin.isChecked();
        boolean hasBoxSteveJobs = checkBoxSteveJobs.isChecked();
        boolean quizResult;

        if ((hasLarryPage == true) && (hasBoxSergeyBrin == true) && (hasBoxSteveJobs == false)) {
            score += 1;
            quizResult = true;
        } else {
            quizResult = false;
        }

        String quizMessage = "";
        if (quizResult) {
            quizMessage += "Quiz4 is right!";
        } else {
            quizMessage += "Quiz4 is wrong!";
        }
        return quizMessage;
    }

    private String getQuiz3ResultMessage() {
        // radio button
        RadioButton radioButtonLinear = (RadioButton) findViewById(R.id.radio_linear);
        RadioButton radioButtonRelative = (RadioButton) findViewById(R.id.radio_relative);

        boolean hasLinear = radioButtonLinear.isChecked();
        boolean hasRelative = radioButtonRelative.isChecked();

        boolean quizResult;
        if ((hasLinear == true) && (hasRelative == false)) {
            score += 1;
            quizResult = true;
        } else {
            quizResult = false;
        }

        String quizMessage = "";
        if (quizResult) {
            quizMessage += "Quiz3 is right!";
        } else {
            quizMessage += "Quiz3 is wrong!";
        }
        return quizMessage;
    }

    private String getQuiz2ResultMessage() {
        // radio button
        RadioButton radioButtonLollipop = (RadioButton) findViewById(R.id.radio_lollipop);
        RadioButton radioButtonMarshmallow = (RadioButton) findViewById(R.id.radio_marshmallow);
        RadioButton radioButtonNougat = (RadioButton) findViewById(R.id.radio_nougat);

        boolean hasLollipop = radioButtonLollipop.isChecked();
        boolean hasMarshmallow = radioButtonMarshmallow.isChecked();
        boolean hasNougat = radioButtonNougat.isChecked();
        boolean quizResult;
        if ((hasLollipop == false) && (hasMarshmallow == false) && (hasNougat == true)) {
            score += 1;
            quizResult = true;
        } else {
            quizResult = false;
        }

        String quizMessage = "";
        if (quizResult) {
            quizMessage += "Quiz2 is right!";
        } else {
            quizMessage += "Quiz2 is wrong!";
        }
        return quizMessage;
    }

    private String getQuiz1ResultMessage() {
        // checkbox
        CheckBox checkBoxPenguin = (CheckBox) findViewById(R.id.check_penguin);
        CheckBox checkBoxOstrich = (CheckBox) findViewById(R.id.check_ostrich);
        CheckBox checkBoxEagle = (CheckBox) findViewById(R.id.check_eagle);

        boolean hasPenguin = checkBoxPenguin.isChecked();
        boolean hasOstrich = checkBoxOstrich.isChecked();
        boolean hasEagle = checkBoxEagle.isChecked();
        boolean quizResult;

        if ((hasPenguin == true) && (hasOstrich == true) && (hasEagle == false)) {
            score += 1;
            quizResult = true;
        } else {
            quizResult = false;
        }

        String quizMessage = "";
        if (quizResult) {
            quizMessage += "Quiz1 is right!";
        } else {
            quizMessage += "Quiz1 is wrong!";
        }
        return quizMessage;
    }
}
