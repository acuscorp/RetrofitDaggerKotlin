package com.omnitracs.retrofit_dagger_kotlin.networking

import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FetchCatImageUseCase(private val theCatApiService: TheCatApiService) {
    sealed class Result {
        data class Success(val name: String, val imageUrl: String) : Result()
        object Failure : Result()
    }

    suspend fun getCatImageResponse(): Result {
        return withContext(Dispatchers.IO) {
            try {
                val response = theCatApiService.searchImages(1, "full")
                if (response.isSuccessful && response.body() != null) {
                    val imageUrl = response.body()?.firstOrNull()?.imageUrl ?: ""
                    val name = response.body()?.firstOrNull()?.breeds?.firstOrNull()?.name ?: "unknown"


                    return@withContext Result.Success(name = name, imageUrl = imageUrl)
                }else{
                    return@withContext Result.Failure
                }
            }catch (t: Throwable){
                if (t !is CancellationException) {
                    return@withContext Result.Failure
                } else {
                    throw t
                }
            }
        }
    }
}