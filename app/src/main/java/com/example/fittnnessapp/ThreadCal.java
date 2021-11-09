package com.example.fittnnessapp;

import android.content.Intent;

public class ThreadCal extends Thread{

        public static String weight ;
        public static double ans ;

    public ThreadCal(String toString, String toString1, String toString2) {
    }


    @Override
        public void run(){

            ans = Integer.parseInt(weight) * 1.4 * 24 ;

        }
}
