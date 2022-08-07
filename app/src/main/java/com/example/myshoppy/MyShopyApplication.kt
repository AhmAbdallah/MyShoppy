package com.example.myshoppy

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyShopyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
    }
}