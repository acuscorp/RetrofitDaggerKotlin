package com.omnitracs.retrofit_dagger_kotlin.screen

import android.os.Bundle
import com.omnitracs.retrofit_dagger_kotlin.R
import com.omnitracs.retrofit_dagger_kotlin.screen.common.BaseActivity

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_frame)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.frame_content, CatImageFragment())
                .commit()
        }
    }
}