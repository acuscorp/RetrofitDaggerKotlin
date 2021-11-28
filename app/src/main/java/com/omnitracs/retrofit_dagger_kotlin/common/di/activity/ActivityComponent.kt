package com.omnitracs.retrofit_dagger_kotlin.common.di.activity

import com.omnitracs.retrofit_dagger_kotlin.common.di.presentation.PresentationComponent
import dagger.Subcomponent
@ActivityScope
@Subcomponent( modules = [ActivityModule::class])
interface ActivityComponent {
    fun newPresentationComponent(): PresentationComponent
}