package com.example.ryana.verticleprototype;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Calendar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar);
        Intent intent = getIntent();
        getWindow().getDecorView().setBackgroundColor(Color.LTGRAY);
    }

}