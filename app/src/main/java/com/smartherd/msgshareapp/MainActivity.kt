package com.smartherd.msgshareapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            // Code
            Log.i("MainActivity", "Button was clicked !")

            Toast.makeText(this, "Button was clicked !", Toast.LENGTH_SHORT).show()
        }
    }
}