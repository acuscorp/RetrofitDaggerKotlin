package com.omnitracs.retrofit_dagger_kotlin.screen.common

import androidx.fragment.app.Fragment
import com.omnitracs.retrofit_dagger_kotlin.common.di.DaggerFragmentComponent
import com.omnitracs.retrofit_dagger_kotlin.common.di.fragment.FragmentComponent
import com.omnitracs.retrofit_dagger_kotlin.common.di.fragment.FragmentModule

open class BaseFragment: Fragment() {

    private val fragmentComponent: FragmentComponent by lazy {
        DaggerFragmentComponent
            .builder()
            .fragmentModule(FragmentModule((requireActivity() as BaseActivity).activityComponent))
            .build()

    }


    val injector get() = fragmentComponent
}
