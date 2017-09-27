package com.framgia.quick_search.screen

/**
 * Created by levutantuan on 9/26/17.
 */
interface BasePresenter<T : BaseViewModel> {

  fun onStart()

  fun onStop()

  fun setViewModel(viewModel: T)
}
