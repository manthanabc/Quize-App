package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;


import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {
    ImageView sports, space, movies, science;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        sports = findViewById(R.id.sports);
        space = findViewById(R.id.space);
        movies = findViewById(R.id.movies);
        science = findViewById(R.id.science);

        sports.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this,
                        "Starting test",
                        Toast.LENGTH_LONG).show();
                QuestionAnswer.type=0;
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        space.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this,
                        "Starting test",
                        Toast.LENGTH_LONG).show();
                QuestionAnswer.type=1;
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        movies.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this,
                        "Starting test",
                        Toast.LENGTH_LONG).show();
                QuestionAnswer.type=2;
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        science.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this,
                        "Starting test",
                        Toast.LENGTH_LONG).show();
                QuestionAnswer.type=3;
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}