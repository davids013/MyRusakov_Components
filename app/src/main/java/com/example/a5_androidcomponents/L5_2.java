package com.example.a5_androidcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class L5_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l5_2);

        Intent intent1 = getIntent();
        String order = intent1.getStringExtra("Order");

        TextView tv = findViewById(R.id.textView_order);
        tv.setText(order);
    }

    public void clickBackToOrder(View view) {
        Intent intentBackToOrder = new Intent(this, L5_RadioButtonActivity.class);
        startActivity(intentBackToOrder);
    }
}