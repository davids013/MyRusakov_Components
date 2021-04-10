package com.example.a5_androidcomponents;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.chip.Chip;

public class L3_ButtonActivity extends AppCompatActivity {

    boolean isRecord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l3__button);
        isRecord = false;
    }

    public void clickRecord(View view) {
        isRecord = !isRecord;
        Button btnRec = findViewById(R.id.buttonRecord);
        Switch sw = findViewById(R.id.switch1);
        Chip chip = findViewById(R.id.chip1);
        if (isRecord) {
            btnRec.setText("Stop");
            chip.setChipBackgroundColorResource(R.color.teal_200);
            btnRec.setTextColor(R.color.white);
            btnRec.setBackgroundColor(R.color.red);
            System.out.println("Record is running...");
        } else {
            btnRec.setText("Start");
            chip.setChipBackgroundColorResource(R.color.purple_700);
            btnRec.setTextColor(R.color.red);
            btnRec.setBackgroundColor(R.color.green);
            System.out.println("Record stopped.");
        }
        sw.setChecked(isRecord);
    }

    public void clickNextL4(View view) {
        Intent intentBackToL2 = new Intent(this, L2_EditTextActivity.class);
        startActivity(intentBackToL2);
    }
}