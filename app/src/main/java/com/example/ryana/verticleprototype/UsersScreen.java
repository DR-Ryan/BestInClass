package com.example.ryana.verticleprototype;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class UsersScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.users);
        Intent intent = getIntent();
        //getWindow().getDecorView().setBackgroundColor(Color.LTGRAY);
    }

    protected void AddUser(View view){
        Intent intent = new Intent(this, UserInformation.class);
        startActivity(intent);
    }

    protected void EditUser(View view){
        Intent intent = new Intent(this, UserInformation.class);
        startActivity(intent);
    }

    protected void DeleteUser(View view){
        Intent intent = new Intent(this, UserInformation.class);
        startActivity(intent);
    }

}
