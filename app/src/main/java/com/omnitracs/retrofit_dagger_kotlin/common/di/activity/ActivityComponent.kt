package com.omnitracs.retrofit_dagger_kotlin.common.di.activity

import androidx.appcompat.app.AppCompatActivity
import com.omnitracs.retrofit_dagger_kotlin.networking.TheCatApiService
import dagger.Component

@Component( modules = [ActivityModule::class])
interface ActivityComponent {


    fun activity():AppCompatActivity
    fun theCatApiService(): TheCatApiService
}