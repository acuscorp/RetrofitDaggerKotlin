package com.omnitracs.retrofit_dagger_kotlin.common.composition

import android.app.Application
import com.omnitracs.retrofit_dagger_kotlin.networking.TheCatApiService
import com.omnitracs.retrofit_dagger_kotlin.util.Constants
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory




class AppCompositionRoot(val application: Application) {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(Constants.baseUrl)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }


    val theCatApiService: TheCatApiService by lazy { retrofit.create(TheCatApiService::class.java) }

}
