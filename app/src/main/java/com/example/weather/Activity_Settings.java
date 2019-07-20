package com.example.weather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;


public class Activity_Settings extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    public void button_onClick(View view) {
        Intent intent = new Intent();
        setResult(RESULT_CANCELED, intent);
        finish();
    }

    public void onCheckboxClicked(View view) {
        // Получаем флажок
        CheckBox checkBox = (CheckBox) view;
        String value = String.valueOf(checkBox.getText());
        // Получаем, отмечен ли данный флажок
        boolean checked = checkBox.isChecked();
        Intent intent = new Intent();
        intent.putExtra("value", value);
        setResult(RESULT_OK, intent);
        finish();

        }
    }






