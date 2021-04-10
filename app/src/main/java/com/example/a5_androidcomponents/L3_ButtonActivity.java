package com.example.a5_androidcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class L3_ButtonActivity extends AppCompatActivity {

    boolean isRecord1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l3__button);
    }

    public void clickRecord(View view) {
        boolean isRecord = false;
        isRecord1 = !isRecord1;
        Button btnRec = findViewById(R.id.buttonRecord);
        if (isRecord1) {
            btnRec.setText("Stop");
            Toast.makeText(this, "true", Toast.LENGTH_SHORT).show();
        } else {
            btnRec.setText("Start");
            Toast.makeText(this, "false", Toast.LENGTH_SHORT).show();
        }
    }
}