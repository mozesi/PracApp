package com.example.pracapp

import android.app.Application
import timber.log.Timber

class PracApllication : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}