package com.example.helloworld

import android.content.Context
import android.widget.Toast

class SayHelloWorld {
    fun s(c: Context, message: String) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();
    }
}