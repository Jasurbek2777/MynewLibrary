package com.example.mynewlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylibrary.LiblaryClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var library = LiblaryClass
        library.show(this, "bla bla bla")
        library.makeFullSceen(window)
    }
}