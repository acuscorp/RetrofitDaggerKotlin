package com.omnitracs.retrofit_dagger_kotlin.common.composition

import android.app.Application
import com.omnitracs.retrofit_dagger_kotlin.networking.TheCatApiService
import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {
    fun application(): Application
    fun theCatApiService(): TheCatApiService
}