package com.omnitracs.retrofit_dagger_kotlin.model

import com.squareup.moshi.Json

data class UserData(
    @field:Json(name = "fn") val firstName: String,
    @field:Json(name = "last") val lastName: String

)
