package ru.netology.androidrandom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView number;
    Button buttonBack;
    Button buttonNext;
    int min = 1;
    int max = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number = findViewById(R.id.random_numb);
        buttonNext = findViewById(R.id.next);
        buttonBack = findViewById(R.id.back);
        buttonNext.setOnClickListener(clickNextListener);
        buttonBack.setOnClickListener(clickBackListener);
        int randNumb = min + (int)(((max-min)+min)*Math.random());
        number.setText(""+randNumb);
    }
    private View.OnClickListener clickNextListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);

        }
    };
    private View.OnClickListener clickBackListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };
}
