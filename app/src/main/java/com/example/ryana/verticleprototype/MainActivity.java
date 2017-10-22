package com.example.ryana.verticleprototype;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class MainActivity extends AppCompatActivity {
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().getDecorView().setBackgroundColor(Color.LTGRAY);

        MobileAds.initialize(getApplicationContext(),
                "ca-app-pub-3940256099942544~3347511713");

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    protected void MedicationScreen(View view){
        Intent intent = new Intent(this, Medication.class);
        startActivity(intent);
    }

    protected void NextReminderScreen(View view){
        Intent intent = new Intent(this, NextReminder.class);
        startActivity(intent);
    }

    protected void CalendarScreen(View view){
        Intent intent = new Intent(this, Calendar.class);
        startActivity(intent);
    }

    protected void StoreLocatorScreen(View view){
        Intent intent = new Intent(this, StoreLocator.class);
        startActivity(intent);
    }

    protected void UsersScreen(View view){
        Intent intent = new Intent(this, UsersScreen.class);
        startActivity(intent);
    }
}
