package com.example.pprabhakaran.myapplication;

import android.util.Log;

/**
 * Created by pprabhakaran on 3/29/17.
 */

public interface InterfaceA {
    public void textme();

    default void sayHi(){
        Log.e("TAG","I am calling from Interface");
    }
    static void sayHello(){
        Log.e("TAG","I am calling from Interface");
    }
}
