package com.framgia.quick_search.screen.splash;

/**
 * Listens to user actions from the UI ({@link SplashActivity}), retrieves the data and updates
 * the UI as required.
 */
class SplashPresenter : SplashContract.Presenter {

  private var mViewModel: SplashContract.ViewModel? = null

  override fun onStart() {}

  override fun onStop() {}

  override fun setViewModel(viewModel: SplashContract.ViewModel) {
    mViewModel = viewModel
  }
}
