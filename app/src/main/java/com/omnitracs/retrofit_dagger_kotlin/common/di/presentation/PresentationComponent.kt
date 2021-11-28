package com.omnitracs.retrofit_dagger_kotlin.common.di.presentation

import com.omnitracs.retrofit_dagger_kotlin.screen.CatImageFragment
import dagger.Subcomponent

@PresentationScope()
@Subcomponent()
interface PresentationComponent {
    fun inject(catImageFragment: CatImageFragment)

}