package com.omnitracs.retrofit_dagger_kotlin.common.composition

import com.omnitracs.retrofit_dagger_kotlin.networking.FetchCatImageUseCase
import com.omnitracs.retrofit_dagger_kotlin.networking.TheCatApiService
import dagger.Module
import dagger.Provides


@Module
class FragmentModule(private val activityComponent: ActivityComponent) {

    @Provides
    fun activity() = activityComponent.activity()

    @Provides
    fun theCatApiService() = activityComponent.theCatApiService()

    @Provides
    fun fetchCatImageUsaCase(theCatApiService: TheCatApiService) = FetchCatImageUseCase(theCatApiService)

}
