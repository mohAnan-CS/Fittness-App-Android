package com.example.fittnnessapp.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.fittnnessapp.R;

public class signUp extends AppCompatActivity {

    private EditText userName;
    private EditText userEmail;
    private EditText userPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
         userName = findViewById(R.id.et_newUserName);
         userEmail = findViewById(R.id.et_userEmail);
         userPass = findViewById(R.id.et_newUserPass);



//        btnSignUp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                SharedPreferences preferences = getSharedPreferences("MYPRESS" ,MODE_PRIVATE );
//                String newUserName = userName.getText().toString();
//                String newEmail = userEmail.getText().toString();
//                String newPass = userPass.getText().toString();
//
//                SharedPreferences.Editor editor = preferences.edit();
//
//                editor.putString(newUserName + newPass + "data" , newUserName +"/n" + newEmail);
//                editor.commit();
//
//                Intent loginScreen = new Intent(signUp.this , MainActivity.class);
//                startActivity(loginScreen);
//
//
//            }
//        });



    }

    //ON click
    public void signUp(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("signup_pref",MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("email_signup",userEmail.getText().toString());
        editor.putString("username_signup",userName.getText().toString());
        editor.putString("pass_signup",userPass.getText().toString());

        editor.apply();

        Intent intent = new Intent(this,home.class);
        startActivity(intent);



    }
}