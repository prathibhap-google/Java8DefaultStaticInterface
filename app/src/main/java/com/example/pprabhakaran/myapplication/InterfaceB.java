package com.example.pprabhakaran.myapplication;

import android.util.Log;

/**
 * Created by pprabhakaran on 3/29/17.
 */

public interface InterfaceB {

    default void sayHi(){
        Log.e("TAG","I am calling from InterfaceB");
    }
}
