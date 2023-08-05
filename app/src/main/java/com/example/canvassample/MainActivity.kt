package com.example.canvassample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myCanvas =MyCanvas(this)
        myCanvas.systemUiVisibility=SYSTEM_UI_FLAG_FULLSCREEN
        myCanvas.contentDescription="This is my Canvas"
        setContentView(myCanvas)
    }
}