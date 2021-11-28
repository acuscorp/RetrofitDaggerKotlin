package com.omnitracs.retrofit_dagger_kotlin.common.di.activity

import androidx.appcompat.app.AppCompatActivity
import com.omnitracs.retrofit_dagger_kotlin.common.di.application.AppComponent
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(
    private val activity: AppCompatActivity
) {
    @Provides
    fun activity() = activity
}
