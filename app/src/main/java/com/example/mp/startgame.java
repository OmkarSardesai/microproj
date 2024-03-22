package com.example.mp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class startgame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startgame);
        ImageButton btn1 = (ImageButton) findViewById(R.id.btn1);
        ImageButton btn2 = (ImageButton) findViewById(R.id.btn2);
        ImageButton btn3 = (ImageButton) findViewById(R.id.btn3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wordsTest();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ParagraphTest();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SentenceTest();
            }
        });
    }
    public void wordsTest(){
        Intent intent = new Intent(this,WordsTesttyping.class);
        startActivity(intent);
    }
    public void ParagraphTest(){
        Intent intent = new Intent(this,ParagraphTesttyping.class);
        startActivity(intent);
    }
    public void SentenceTest(){
        Intent intent = new Intent(this,SentenceTesttying.class);
        startActivity(intent);
    }
}