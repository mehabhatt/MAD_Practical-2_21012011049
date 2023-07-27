package com.example.mad_practical_2_21012011049

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("onCreate method is called.")
    }

    override fun onStart() {
        super.onStart()
        showMessage("onStart method is called.")
    }

    override fun onResume() {
        super.onResume()
        showMessage("onResume method is called.")
    }

    override fun onPause() {
        super.onPause()
        showMessage("onPause method is called.")
    }

    override fun onStop() {
        super.onStop()
        showMessage("onStop method is called.")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage("onDestroy method is called.")
    }
    fun showMessage(message:String){
        Log.i(TAG, message)
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}