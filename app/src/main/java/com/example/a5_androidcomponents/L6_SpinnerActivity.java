package com.example.a5_androidcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class L6_SpinnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l6__spinner);

        TextView tv = findViewById(R.id.textView_for_spinner);
        Spinner spinner = findViewById(R.id.spinner1);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String str = parent.getItemAtPosition(position).toString();
                System.out.println("Выбран цвет: " + str);
                tv.setText(str);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                tv.setText("Did'n choose");
            }
        });
    }

    public void clickBackToL5(View view) {
        startActivity(new Intent(this, L5_RadioButtonActivity.class));
    }
}