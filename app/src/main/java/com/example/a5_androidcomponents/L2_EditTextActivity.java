package com.example.a5_androidcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class L2_EditTextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l2_edit_text_activity);

        Intent intent1 = getIntent();
    }

    public void clickInverseText(View view) {
        EditText et = findViewById(R.id.editTextTextPersonName);
        String str1 = et.getText().toString();
        StringBuilder sb = new StringBuilder();
        for (int i = str1.length()-1; i >= 0; i--) {
            sb.append(str1.charAt(i));
        }
        String str2 = sb.toString();
        TextView tv = findViewById(R.id.textView_invStr);
        tv.setText(str2);
    }

    public void clickBackToMain(View view) {
        Intent intentBack = new Intent(this, MainActivity.class);
        startActivity(intentBack);
    }

    public void clickToNextL3(View view) {
        Intent intentNextToL3 = new Intent(this, L3_ButtonActivity.class);
        startActivity(intentNextToL3);
    }
}