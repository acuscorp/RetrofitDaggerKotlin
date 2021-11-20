package com.omnitracs.retrofit_dagger_kotlin.screen.common

import androidx.appcompat.app.AppCompatActivity
import com.omnitracs.retrofit_dagger_kotlin.MyApplication
import com.omnitracs.retrofit_dagger_kotlin.common.composition.ActivityCompositionRoot

open class BaseActivity:AppCompatActivity() {
    private val appCompositionRoot = (application as MyApplication).appCompositionRoot

    val activityCompositionRoot by lazy {
        ActivityCompositionRoot(this, appCompositionRoot)
    }
}