package com.omnitracs.retrofit_dagger_kotlin.networking.model

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.IdRes
import androidx.annotation.LayoutRes
import com.omnitracs.retrofit_dagger_kotlin.R
import com.omnitracs.retrofit_dagger_kotlin.image_handler.GlideImageLoader
import com.omnitracs.retrofit_dagger_kotlin.image_handler.ImageLoader


open class BaseMvc(
    private val layoutInflater: LayoutInflater,
    private val parent: ViewGroup?,
    @LayoutRes private val layoutId: Int)  {

    val rootView: View = layoutInflater.inflate(layoutId,parent,false)
    val context: Context = rootView.context
    fun <T : View?>  findViewById(@IdRes id: Int): T = rootView.findViewById<T>(id)
}

class CatImageMvc(
    private val layoutInflater: LayoutInflater,
    private val parent: ViewGroup?,
) : BaseMvc(layoutInflater, parent, R.layout.cat_images) {

    val imageLoader: ImageLoader by lazy { GlideImageLoader(context) }
    val agentBreedView: TextView by lazy { findViewById(R.id.main_agent_breed_value) }

    val profileImageView: ImageView by lazy { findViewById(R.id.main_profile_image) }


}