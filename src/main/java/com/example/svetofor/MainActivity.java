package com.example.svetofor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setRedGround(View view){
        View svetBG = findViewById(R.id.layout);
        svetBG.setBackgroundColor(getResources().getColor(R.color.bg_red));
    }

    public void setGreenGround(View view){
        View svetBG = findViewById(R.id.layout);
        svetBG.setBackgroundColor(getResources().getColor(R.color.bg_green));
    }

    public void setYellowGround(View view){
        View svetBG = findViewById(R.id.layout);
        svetBG.setBackgroundColor(getResources().getColor(R.color.bg_yellow));
    }
}