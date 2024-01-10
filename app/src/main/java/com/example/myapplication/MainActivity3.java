package com.example.myapplication;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Button;
import android.graphics.Color;


public class MainActivity3 extends AppCompatActivity {


    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        // Assuming you have some data representing questions and options
        String[] questions = {"What is the capital of France?", "What is the largest planet in our solar system?"};
        String[][] options = {{"Option 1", "Option 2", "Option 3"}, {"Option A", "Option B", "Option C"}};

        // Get the ScrollView
        ScrollView scrollView = findViewById(R.id.scrollview);

        // Get the layout inside the ScrollView
        LinearLayout linearLayout = findViewById(R.id.llview);
        back = findViewById(R.id.bck_btn);
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Launch the second activity
                Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        // Iterate through questions and options
        for (int i = 0; i < QuestionAnswer.Questions[QuestionAnswer.type].length; i++) {
            // Create a TextView for the question
            TextView questionTextView = new TextView(this);
            questionTextView.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));
            questionTextView.setText(QuestionAnswer.Questions[QuestionAnswer.type][i]);
            questionTextView.setTextSize(18);
            linearLayout.addView(questionTextView);

            // Create a RadioGroup for options
            RadioGroup optionsRadioGroup = new RadioGroup(this);
            optionsRadioGroup.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));
            optionsRadioGroup.setOrientation(LinearLayout.VERTICAL);
            linearLayout.addView(optionsRadioGroup);

            // Iterate through options for the current question
            for (int j = 0; j < QuestionAnswer.Choices[QuestionAnswer.type][i].length; j++) {
                // Create a RadioButton for each option
                RadioButton optionRadioButton = new RadioButton(this);
                optionRadioButton.setLayoutParams(new RadioGroup.LayoutParams(
                        RadioGroup.LayoutParams.WRAP_CONTENT,
                        RadioGroup.LayoutParams.WRAP_CONTENT));
                optionRadioButton.setText(QuestionAnswer.Choices[QuestionAnswer.type][i][j]);
                if(QuestionAnswer.selected[i].equals(QuestionAnswer.Choices[QuestionAnswer.type][i][j]))
                    optionRadioButton.setBackgroundColor(Color.parseColor("#FFD700")); // Example: Gold color
                if(QuestionAnswer.CorrectAnswers[QuestionAnswer.type][i].equals(QuestionAnswer.Choices[QuestionAnswer.type][i][j]))
                    optionRadioButton.setBackgroundColor(Color.parseColor("#00AA00")); // Example: Gold color

                optionsRadioGroup.addView(optionRadioButton);
            }
        }
    }
}