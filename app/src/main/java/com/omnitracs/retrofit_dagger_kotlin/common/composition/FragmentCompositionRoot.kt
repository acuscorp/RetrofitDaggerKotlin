package com.omnitracs.retrofit_dagger_kotlin.common.composition

import com.omnitracs.retrofit_dagger_kotlin.networking.FetchCatImageUseCase
import com.omnitracs.retrofit_dagger_kotlin.networking.TheCatApiService



class FragmentCompositionRoot(private val activityCompositionRoot: ActivityCompositionRoot) {

    private val theCatApiService : TheCatApiService = activityCompositionRoot.theCatApiService

    val activity = activityCompositionRoot.activity
    val fetchCatImageUsaCase get() = FetchCatImageUseCase(theCatApiService)

}
