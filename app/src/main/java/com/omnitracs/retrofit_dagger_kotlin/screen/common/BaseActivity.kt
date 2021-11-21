package com.omnitracs.retrofit_dagger_kotlin.screen.common

import androidx.appcompat.app.AppCompatActivity
import com.omnitracs.retrofit_dagger_kotlin.MyApplication
import com.omnitracs.retrofit_dagger_kotlin.common.composition.ActivityComponent
import com.omnitracs.retrofit_dagger_kotlin.common.composition.ActivityModule
import com.omnitracs.retrofit_dagger_kotlin.common.composition.DaggerActivityComponent

open class BaseActivity:AppCompatActivity() {
    private val appComponent = (application as MyApplication).appModule

    val activityComponent: ActivityComponent by lazy {
        DaggerActivityComponent
            .builder()
            .activityModule(ActivityModule(this,appComponent))
            .build()
    }
}