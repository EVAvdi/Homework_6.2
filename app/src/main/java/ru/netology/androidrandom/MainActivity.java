package ru.netology.androidrandom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView number;
    Button buttonBack;
    Button buttonNext;
    int min = 1;
    int max = 100;
    int activityNumber = 0;
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
        activityNumber = randNumb;
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

    protected void onStart(){
        Log.d("Lifecicle", activityNumber + "onStart");
        Toast.makeText(this, "onStart "+activityNumber, Toast.LENGTH_SHORT).show();
        super.onStart();
    }
    protected void onPause(){
        Log.d("Lifecicle", activityNumber + "onPause");
        Toast.makeText(this, "onPause "+activityNumber, Toast.LENGTH_SHORT).show();
        super.onPause();
    }
    protected void onStop(){
        Log.d("Lifecicle", activityNumber + "onStop");
        Toast.makeText(this, "onStop "+activityNumber, Toast.LENGTH_SHORT).show();
        super.onStop();
    }
    protected void onDestroy(){
        Log.d("Lifecicle", activityNumber + "onDestroy");
        Toast.makeText(this, "onDestroy "+activityNumber, Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
    protected void onRestart(){
        Log.d("Lifecicle", activityNumber + "onRestart");
        Toast.makeText(this, "onRestart "+activityNumber, Toast.LENGTH_SHORT).show();
        super.onRestart();
    }
}
