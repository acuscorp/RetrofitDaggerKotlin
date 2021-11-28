package com.omnitracs.retrofit_dagger_kotlin.screen.common

import androidx.fragment.app.Fragment
import com.omnitracs.retrofit_dagger_kotlin.common.di.presentation.PresentationComponent

open class BaseFragment: Fragment() {

    private val presentationComponent: PresentationComponent by lazy {
        (requireActivity() as BaseActivity).activityComponent.newPresentationComponent()
    }


    val injector get() = presentationComponent
}
