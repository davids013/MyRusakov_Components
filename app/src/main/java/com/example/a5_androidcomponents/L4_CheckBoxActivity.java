package com.example.a5_androidcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class L4_CheckBoxActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    
    ArrayList<CheckBox> checkBoxes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l4__check_box);

        RelativeLayout layout = findViewById(R.id.layout);
        int count = layout.getChildCount();
        for (int i = 0; i < count; i++) {
            View v = layout.getChildAt(i);
            if (v instanceof CheckBox) {
                checkBoxes.add((CheckBox) v);
                ((CheckBox) v).setOnCheckedChangeListener(this);
            }
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        String result = "Выполнено: \n";
        int baseResLen = result.length();
        for (CheckBox c : checkBoxes) {
            if (c.isChecked()) result += c.getText() + ", \n";
        }
        if (result.length() > baseResLen) result = result.substring(0, result.length() - 2);
            else result = "";
        System.out.println(result);
        TextView tvres = findViewById(R.id.textView_result);
        tvres.setText(result);
    }
}