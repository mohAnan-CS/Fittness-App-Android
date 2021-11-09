package com.example.fittnnessapp.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fittnnessapp.R;

public class MainActivity extends AppCompatActivity {

    private Button btn_signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        btn_signUp = findViewById(R.id.btn_signUpLog);




    }

    public void signup_nextPage(View view) {
        Intent intent = new Intent(this,signUp.class);
        startActivity(intent);
    }
}