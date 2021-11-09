package com.example.fittnnessapp.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.fittnnessapp.R;

public class home extends AppCompatActivity {

    private TextView username_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        username_title = findViewById(R.id.username_title);

        SharedPreferences sharedPreferences = getSharedPreferences("signup_pref", MODE_PRIVATE);
        String username = sharedPreferences.getString("username_signup","");
        username_title.setText(username);
    }

    public void bmi_page(View view) {
        Intent intent = new Intent(this, BMI.class);
        startActivity(intent);
    }
}