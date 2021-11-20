package com.omnitracs.retrofit_dagger_kotlin

import android.app.Application
import com.omnitracs.retrofit_dagger_kotlin.common.composition.AppCompositionRoot

class MyApplication: Application() {
    lateinit var appCompositionRoot: AppCompositionRoot

    override fun onCreate() {
        super.onCreate()
        appCompositionRoot = AppCompositionRoot(this)
    }

}