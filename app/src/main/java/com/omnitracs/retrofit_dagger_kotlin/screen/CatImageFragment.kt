package com.omnitracs.retrofit_dagger_kotlin.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.omnitracs.retrofit_dagger_kotlin.networking.FetchCatImageUseCase
import com.omnitracs.retrofit_dagger_kotlin.screen.common.BaseFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import javax.inject.Inject


class CatImageFragment : BaseFragment() {
    private val coroutineScope = CoroutineScope(SupervisorJob() + Dispatchers.Main.immediate)
    private lateinit var viewMvc: CatImageMvc
    @Inject lateinit var fetchCatImageUseCase: FetchCatImageUseCase

    override fun onCreate(savedInstanceState: Bundle?) {
        injector.inject(this)
        super.onCreate(savedInstanceState)
        /*fetchCatImageUseCase = compositionRoot.fetchCatImageUsaCase // using dagger*/
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewMvc = CatImageMvc(inflater, container)
        return viewMvc.rootView
    }

    override fun onStart() {
        super.onStart()
        fetchCats()
    }

    private fun fetchCats(){
        coroutineScope.launch {
            val response: FetchCatImageUseCase.Result = fetchCatImageUseCase.getCatImageResponse()
            when(response){
                FetchCatImageUseCase.Result.Failure -> {

                }
                is FetchCatImageUseCase.Result.Success -> {
                    viewMvc.agentBreedView.text = response.name
                    viewMvc.imageLoader.loadImage(response.imageUrl,viewMvc.profileImageView)
                }
            }
        }
    }

}
