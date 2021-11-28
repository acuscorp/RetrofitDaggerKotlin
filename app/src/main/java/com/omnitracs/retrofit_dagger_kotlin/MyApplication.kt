package com.omnitracs.retrofit_dagger_kotlin

import android.app.Application
import com.omnitracs.retrofit_dagger_kotlin.common.di.application.AppComponent
import com.omnitracs.retrofit_dagger_kotlin.common.di.application.AppModule
import com.omnitracs.retrofit_dagger_kotlin.common.di.application.DaggerAppComponent

class MyApplication: Application() {
    val appComponent: AppComponent by lazy {
       DaggerAppComponent
           .builder()
           .appModule(AppModule(this))
           .build()
    }

    override fun onCreate() {
        super.onCreate()


    }

}