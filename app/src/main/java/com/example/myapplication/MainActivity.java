package com.example.myapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.ColorStateList;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import android.content.Intent;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView totalQuestionsTextView;
    TextView questionTextView;
    Button ansA, ansB, ansC, ansD;
    Button submitBtn;
    Button endQuiz, backBtn, nextBtn;

    int score = 0;
    int totalQuestion = QuestionAnswer.question.length;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";
    int[] qmap = new int[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int[] mmap = new int[10];
        Random random = new Random();
        // Initialize the qmap
        for(int i=0; i<10 ; ) {
            int number = random.nextInt(10);
            boolean contains = false;
            for(int j=0; j<i; j++) {
                if(qmap[j] == number) contains = true;
            }
            if(contains) continue;
            qmap[i++] = number;
        }

        totalQuestionsTextView = findViewById(R.id.total_question);
        questionTextView = findViewById(R.id.question);
        ansA = findViewById(R.id.ans_A);
        ansB = findViewById(R.id.ans_B);
        ansC = findViewById(R.id.ans_C);
        ansD = findViewById(R.id.ans_D);
        submitBtn = findViewById(R.id.submit_btn);
        endQuiz = findViewById(R.id.end_btn);
        backBtn = findViewById(R.id.bck_btn);
        nextBtn = findViewById(R.id.skip_btn);


        ansA.setOnClickListener(this);
        ansB.setOnClickListener(this);
        ansC.setOnClickListener(this);
        ansD.setOnClickListener(this);
        submitBtn.setOnClickListener(this);
        endQuiz.setOnClickListener(this);
        backBtn.setOnClickListener(this);
        nextBtn.setOnClickListener(this);

        totalQuestionsTextView.setText("Question "+(currentQuestionIndex+1));

        loadNewQuestion();
    }

    @Override
    public void onClick(View view) {
        resetBackgroundColors();
        int index = qmap[currentQuestionIndex];
        Button clickedButton = (Button) view;
        int type = QuestionAnswer.type;
        if (clickedButton.getId() == R.id.submit_btn) {
            if (selectedAnswer.equals(QuestionAnswer.CorrectAnswers[type][index])) {
                score++;
            }
            QuestionAnswer.selected[index] = selectedAnswer;
            currentQuestionIndex++;
            loadNewQuestion();
        } else if (clickedButton.getId() == R.id.end_btn) {
            finishQuiz();
            return;
        } else if (clickedButton.getId() == R.id.bck_btn) {
            currentQuestionIndex--;
            loadNewQuestion();
            return;
        } else if (clickedButton.getId() == R.id.skip_btn) {
            currentQuestionIndex++;
            loadNewQuestion();
            return;
        } else {
            selectedAnswer = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(ContextCompat.getColor(this, R.color.text ));
        }
    }

    void loadNewQuestion() {
        int index = qmap[currentQuestionIndex];
        totalQuestionsTextView.setText("Question "+(index+1) + "("+(currentQuestionIndex+1)+" / "+totalQuestion + ")");
        if (currentQuestionIndex == totalQuestion-1) {
            finishQuiz();
            return;
        }
        int type = QuestionAnswer.type;

        questionTextView.setText(QuestionAnswer.Questions[type][index]);
        ansA.setText(QuestionAnswer.Choices[type][index][0]);
        ansB.setText(QuestionAnswer.Choices[type][index][1]);
        ansC.setText(QuestionAnswer.Choices[type][index][2]);
        ansD.setText(QuestionAnswer.Choices[type][index][3]);
        resetBackgroundColors();

        if(QuestionAnswer.selected[index].equals(QuestionAnswer.Choices[type][index][0])) ansA.setBackgroundColor(ContextCompat.getColor(this, R.color.text ));
        if(QuestionAnswer.selected[index].equals(QuestionAnswer.Choices[type][index][1])) ansB.setBackgroundColor(ContextCompat.getColor(this, R.color.text ));
        if(QuestionAnswer.selected[index].equals(QuestionAnswer.Choices[type][index][2])) ansC.setBackgroundColor(ContextCompat.getColor(this, R.color.text ));
        if(QuestionAnswer.selected[index].equals(QuestionAnswer.Choices[type][index][3])) ansD.setBackgroundColor(ContextCompat.getColor(this, R.color.text ));

        // Reset background colors on new question
        //submitBtn.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.white)));
    }

    void resetBackgroundColors() {
        ansA.setBackgroundColor(ContextCompat.getColor(this, R.color.other));
        ansB.setBackgroundColor(ContextCompat.getColor(this, R.color.other));
        ansC.setBackgroundColor(ContextCompat.getColor(this, R.color.other));
        ansD.setBackgroundColor(ContextCompat.getColor(this, R.color.other));
    }

    void finishQuiz() {
        String passStatus = "";

        // Check for pass or fail without changing the background color
        if (score > totalQuestion * 0.60) {
            passStatus = "Passed";
        } else {
            passStatus = "Failed";
        }

        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("Score is " + score + " out of " + totalQuestion)
                .setPositiveButton("Restart", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        restartQuiz();
                    }
                })
                .setCancelable(false)
                .show();
    }


    void restartQuiz() {
        score = 0;
        currentQuestionIndex = 0;
        Intent intent = new Intent(MainActivity.this, MainActivity3.class);
        resetBackgroundColors();
        startActivity(intent);
    }
}