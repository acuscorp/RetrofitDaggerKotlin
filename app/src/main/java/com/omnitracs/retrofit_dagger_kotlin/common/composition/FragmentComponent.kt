package com.omnitracs.retrofit_dagger_kotlin.common.composition

import com.omnitracs.retrofit_dagger_kotlin.networking.FetchCatImageUseCase
import com.omnitracs.retrofit_dagger_kotlin.screen.CatImageFragment
import dagger.Component

@Component(modules = [FragmentModule::class])
interface FragmentComponent {

    fun inject(catImageFragment: CatImageFragment)

}