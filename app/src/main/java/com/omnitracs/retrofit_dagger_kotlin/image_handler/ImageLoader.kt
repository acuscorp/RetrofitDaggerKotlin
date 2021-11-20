package com.omnitracs.retrofit_dagger_kotlin.image_handler

import android.widget.ImageView

interface ImageLoader {
    fun loadImage(imageUrl: String, imageView: ImageView)
}

