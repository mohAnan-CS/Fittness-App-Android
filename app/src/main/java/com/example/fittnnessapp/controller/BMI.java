package com.example.fittnnessapp.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import com.example.fittnnessapp.R;

public class BMI extends AppCompatActivity {

    private TextView bmi_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        bmi_txt = findViewById(R.id.bmi_txt);

        SharedPreferences sharedPreferences = getSharedPreferences("weight_pref",MODE_PRIVATE);
        String bmi = sharedPreferences.getString("bmi","");

        bmi_txt.setText("BMI = " + bmi);
    }
}