package com.omnitracs.retrofit_dagger_kotlin.screen.common

import androidx.fragment.app.Fragment
import com.omnitracs.retrofit_dagger_kotlin.common.composition.FragmentCompositionRoot

open class BaseFragment: Fragment() {
    val compositionRoot by lazy {
        FragmentCompositionRoot((requireActivity() as BaseActivity).activityCompositionRoot)
    }
}
