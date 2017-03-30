package com.example.pprabhakaran.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;



public class MainActivity extends AppCompatActivity implements  InterfaceA{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void textme() {
        Log.e("TAG", "I am calling from main activity");
    }

    @Override
    public void sayHi() {
        InterfaceA.super.sayHi();
    }


}
