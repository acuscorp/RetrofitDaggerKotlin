package com.omnitracs.retrofit_dagger_kotlin.common.di.application

import android.app.Application
import com.omnitracs.retrofit_dagger_kotlin.networking.TheCatApiService
import com.omnitracs.retrofit_dagger_kotlin.util.Constants
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
class AppModule(private val application: Application) {

    @Provides
     fun retrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Constants.baseUrl)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }


    @Provides
    fun application() = application

    @Provides
    fun theCatApiService(retrofit: Retrofit): TheCatApiService = retrofit.create(TheCatApiService::class.java)

}
