package com.example.testapp;

import android.util.Log;

public class SecondClass {

    private static final String TAG = "SecondClass";

    public int multiply(int x , int y){
        return x*y;
    }

    private int division(int x, int y){
        return y/x;
    }

    public void sub(int x, int y){
        int tot = y - x;
        printTot(tot);
    }

    private void printTot(int tot){
        Log.d(TAG,String.valueOf("Subtraction: "+tot));
    }
}
