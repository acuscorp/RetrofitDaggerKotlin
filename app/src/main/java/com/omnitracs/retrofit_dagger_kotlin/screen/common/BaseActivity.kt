package com.omnitracs.retrofit_dagger_kotlin.screen.common

import androidx.appcompat.app.AppCompatActivity
import com.omnitracs.retrofit_dagger_kotlin.MyApplication
import com.omnitracs.retrofit_dagger_kotlin.common.di.activity.ActivityComponent
import com.omnitracs.retrofit_dagger_kotlin.common.di.activity.ActivityModule
import com.omnitracs.retrofit_dagger_kotlin.common.di.DaggerActivityComponent

open class BaseActivity:AppCompatActivity() {
    private val appComponent get() = (application as MyApplication).appComponent

    val activityComponent: ActivityComponent by lazy {
        DaggerActivityComponent
            .builder()
            .activityModule(ActivityModule(this,appComponent))
            .build()
    }
}