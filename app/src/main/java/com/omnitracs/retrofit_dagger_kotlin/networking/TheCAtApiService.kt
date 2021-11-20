package com.omnitracs.retrofit_dagger_kotlin.networking

import com.omnitracs.retrofit_dagger_kotlin.networking.model.ImageResultData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TheCatApiService {
    @GET("images/search")
    suspend fun searchImages(
        @Query("limit") limit: Int,
        @Query("size") format: String
    ) : Response<List<ImageResultData>>
}