package com.example.pracapp

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.ViewModel
import timber.log.Timber

class  MainViewModel : ViewModel(){
init {
Timber.i("this modelview called once")
}

    override fun onCleared() {
        super.onCleared()
        Timber.i("on clear called")
    }
    fun sendMessage(requestCode:Int,context:Context){
        when (requestCode) {
            1 -> {
                val name = "Please proceed"
                Toast.makeText(context, name, Toast.LENGTH_LONG).show()
            }
            2 -> {
                val name = "Request cancelled"
                Toast.makeText(context, name, Toast.LENGTH_LONG).show()
            }

        }
    }
}