package com.example.a5_androidcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class L5_RadioButtonActivity extends AppCompatActivity {

    String strOrder, strBread, strDrink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l5__radio_button);

        RadioGroup rgBread = findViewById(R.id.rg_bread);
        RadioGroup rgDrink = findViewById(R.id.rg_drink);
        strBread = "Хлеб: не нужен";
        strDrink = "Напиток: Чай";
        rgBread.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                strBread = "Хлеб: " + ((RadioButton)findViewById(checkedId)).getText().toString();
            }
        });
        rgDrink.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                strDrink = "Напиток: " + ((RadioButton)findViewById(checkedId)).getText().toString();
            }
        });
    }

    public void clickOrder(View view) {
        strOrder = "Ваш заказ: \n" + strBread + "\n" + strDrink;
        Intent intentOrder = new Intent(this, L5_2.class);
        intentOrder.putExtra("Order", strOrder);
        startActivity(intentOrder);
    }

    public void clickBackToL4(View view) {
        Intent intentBackToL4 = new Intent(this, L4_CheckBoxActivity.class);
        startActivity(intentBackToL4);
    }
}