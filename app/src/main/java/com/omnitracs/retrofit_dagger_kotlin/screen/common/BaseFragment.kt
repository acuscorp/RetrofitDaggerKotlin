package com.omnitracs.retrofit_dagger_kotlin.screen.common

import androidx.fragment.app.Fragment
import com.omnitracs.retrofit_dagger_kotlin.common.composition.FragmentModule

open class BaseFragment: Fragment() {
    val compositionRoot by lazy {
        FragmentModule((requireActivity() as BaseActivity).activityCompositionRoot)
    }
}
