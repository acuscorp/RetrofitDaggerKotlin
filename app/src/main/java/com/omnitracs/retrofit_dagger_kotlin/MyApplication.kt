package com.omnitracs.retrofit_dagger_kotlin

import android.app.Application
import com.omnitracs.retrofit_dagger_kotlin.common.composition.AppComponent
import com.omnitracs.retrofit_dagger_kotlin.common.composition.AppModule
import com.omnitracs.retrofit_dagger_kotlin.common.composition.DaggerAppComponent

class MyApplication: Application() {
    val appModule: AppComponent by lazy {
       DaggerAppComponent
           .builder()
           .appModule(AppModule(this))
           .build()
    }

    override fun onCreate() {
        super.onCreate()


    }

}