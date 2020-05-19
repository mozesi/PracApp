package com.example.pracapp

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import timber.log.Timber

class TimerClass(mainActivity: Lifecycle) :LifecycleObserver{
    init {
        mainActivity.addObserver(this)
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun start(){
        Timber.i("Onstart called in timer")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun stop(){
        Timber.i("Onstop called in timer")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun leave(): String ="Moses Msukwa"
}