package com.omnitracs.retrofit_dagger_kotlin.common.composition

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import com.omnitracs.retrofit_dagger_kotlin.networking.TheCatApiService
import dagger.Component

@Component( modules = [ActivityModule::class])
interface ActivityComponent {


    fun activity():AppCompatActivity
    fun theCatApiService(): TheCatApiService
}