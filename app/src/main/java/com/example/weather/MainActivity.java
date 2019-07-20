package com.example.weather;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MainPresenter presenter = MainPresenter.getInstance();
    private String value;
    private TextView city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String instanceState;
        if (savedInstanceState == null){
            instanceState = "Первый запуск!";
        }
        else{
            instanceState = "Повторный запуск!";
        }
        // выведем, какой это запуск
        Toast.makeText(getApplicationContext(), instanceState + " - onCreate()", Toast.LENGTH_SHORT).show();
       // final TextView textCounter = findViewById(R.id.textCounter); // Текст
        final MainPresenter presenter = MainPresenter.getInstance();
        // Получить презентер
   //     textCounter.setText(((Integer)presenter.getCounter()).toString());
        city = findViewById(R.id.MyCity);
        city.setText(value);
    }

    public void button2_onClick(View view) {
        Toast.makeText(this, "button2 onClick event!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Activity_Settings.class );
        startActivityForResult(intent,1);
    }


    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (data == null) {
            return;
        }
        value = data.getStringExtra("value");
        city.setText(value);
    }

}
