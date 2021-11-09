package com.example.fittnnessapp.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.fittnnessapp.R;
import com.example.fittnnessapp.ThreadCal;

public class Information extends AppCompatActivity {


    private EditText et_weight;
    private EditText et_height;
    private Spinner spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);


        et_weight = findViewById(R.id.et_weight);
        et_height = findViewById(R.id.et_height);
        spinner2 = findViewById(R.id.spinner2);


    }

    public void save_info(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("weight_pref",MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("weight",et_weight.getText().toString());
        editor.putString("height",et_height.getText().toString());
        editor.putString("select_spinner",spinner2.getSelectedItem().toString());


        ThreadCal th = new ThreadCal(spinner2.getSelectedItem().toString(),et_weight.getText().toString(),et_height.getText().toString());
        th.start();

        editor.putString("bmi",String.valueOf(th.ans));

        editor.apply();


        Intent intent = new Intent(this,signUp.class);
        startActivity(intent);


    }
}