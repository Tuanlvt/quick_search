package com.framgia.quick_search.screen.favorite;

/**
 * Listens to user actions from the UI ({@link FavoriteActivity}), retrieves the data and updates
 * the UI as required.
 */
class FavoritePresenter : FavoriteContract.Presenter {

  private var mViewModel: FavoriteContract.ViewModel? = null

  override fun onStart() {}

  override fun onStop() {}

  override fun setViewModel(viewModel: FavoriteContract.ViewModel) {
    mViewModel = viewModel
  }
}
