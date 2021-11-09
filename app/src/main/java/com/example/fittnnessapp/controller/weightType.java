package com.example.fittnnessapp.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fittnnessapp.R;

public class weightType extends AppCompatActivity {

    Button btn_next ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_type);

        btn_next = findViewById(R.id.btn_NextWeight);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getBaseContext(),signUp.class);
                startActivity(intent);
            }
        });
    }
}