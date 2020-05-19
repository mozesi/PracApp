package com.example.pracapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        second_btn.setOnClickListener {
            val intent = Intent(this, Second::class.java)
            startActivityForResult(intent, 1)
        }
        third_btn.setOnClickListener {
            val intent = Intent(this, Second::class.java)
            startActivityForResult(intent, 2)
        }

        //Observe the life cycle of mainactivity
        val timerClass = TimerClass(this.lifecycle)

        Timber.i("this modelview called again")
        mainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        mainViewModel.sendMessage(requestCode,this)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("on destroy called", "On destroy called in Main activity")
    }


}
