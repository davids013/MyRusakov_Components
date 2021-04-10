package com.example.a5_androidcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickGetRandomNumber(View view) {
        int rnd = (int)(Math.random()*100 + 1);
        TextView numView = findViewById(R.id.numView);
        numView.setText("Random number: " + rnd);
    }

    public void clickNextLesson(View view) {
        Intent intent = new Intent(this, L2_EditTextActivity.class);
        startActivity(intent);
    }
}