package com.example.helloworldlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloworld.SayHelloWorld

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SayHelloWorld().s(this, "Hello World Library!")
    }
}