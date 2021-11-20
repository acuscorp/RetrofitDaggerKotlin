package com.omnitracs.retrofit_dagger_kotlin.common.composition

import com.omnitracs.retrofit_dagger_kotlin.networking.FetchCatImageUseCase
import dagger.Component

@Component(modules = [FragmentModule::class])
interface FragmentComponent {

    fun fetchCatImageUsaCase(): FetchCatImageUseCase

}