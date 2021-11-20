package com.omnitracs.retrofit_dagger_kotlin.common.composition

import androidx.appcompat.app.AppCompatActivity
import com.omnitracs.retrofit_dagger_kotlin.networking.TheCatApiService

class ActivityCompositionRoot(
    val activity: AppCompatActivity,
    private val appCompositionRoot: AppCompositionRoot
) {

    val application = appCompositionRoot.application

    val theCatApiService: TheCatApiService = appCompositionRoot.theCatApiService
}
