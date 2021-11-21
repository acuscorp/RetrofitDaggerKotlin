package com.omnitracs.retrofit_dagger_kotlin.common.di.fragment

import com.omnitracs.retrofit_dagger_kotlin.screen.CatImageFragment
import dagger.Component

@Component(modules = [FragmentModule::class])
interface FragmentComponent {

    fun inject(catImageFragment: CatImageFragment)

}