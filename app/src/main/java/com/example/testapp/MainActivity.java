package com.example.testapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    SecondClass sd = new SecondClass();

    // create an object of a file that does not exist
    //ThirdClass td = new ThirdClass();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Print Hello World in the console
        Log.d(TAG, "Hello World");

        calculate(10,20);



    }

    public void calculate(int x , int y){

        // calling a private method in the same file
        Log.d(TAG,String.valueOf("Sum: "+sum(x,y)));

        //calling a public method in a separate file
        Log.d(TAG,String.valueOf("Multiply: "+sd.multiply(x,y)));

        //calling a private method in a separate file
        //Log.d(TAG,String.valueOf(sd.division(x,y)));

        // invoke a method that does not exist in a separate file
        //sd.divide();

        // invoke a public method which invokes a private method in a separate file
        sd.sub(x,y);

    }

    private int sum(int x , int y){
        return x+y;
    }


}