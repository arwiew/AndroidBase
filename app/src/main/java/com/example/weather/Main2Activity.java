package com.example.weather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

       public void button_onClick(View view) {
            Toast.makeText(this, "button2 onClick event!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,MainActivity.class );
            startActivity(intent);
        }
}


