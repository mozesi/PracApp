package com.example.pracapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*
import timber.log.Timber

class Second : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        Timber.i("oncreate called")
        first_button.setOnClickListener {
            val intent = Intent()
            setResult(Activity.RESULT_OK,intent)
            finish()
        }

    }

    override fun onStart() {
        super.onStart()
        Timber.i("onStart called")
    }

    override fun onStop() {
        super.onStop()
        Timber.i("onStop called")
    }

    override fun onRestart() {
        super.onRestart()
        Timber.i("onRestart called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.i("onDestroy called")
    }
    override fun onResume() {
        super.onResume()
        Timber.i("onResume called")
    }
}
