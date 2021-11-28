package com.omnitracs.retrofit_dagger_kotlin.common.di.application

import com.omnitracs.retrofit_dagger_kotlin.common.di.activity.ActivityComponent
import com.omnitracs.retrofit_dagger_kotlin.common.di.activity.ActivityModule
import dagger.Component

@AppScope
@Component(modules = [AppModule::class])
interface AppComponent {
    fun newActivityComponent(activityModule: ActivityModule):ActivityComponent
}