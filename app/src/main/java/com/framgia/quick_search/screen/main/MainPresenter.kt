package com.framgia.quick_search.screen.main;

import com.framgia.quick_search.screen.utils.rx.BaseSchedulerProvider

/**
 * Listens to user actions from the UI ({@link MainActivity}), retrieves the data and updates
 * the UI as required.
 */
class MainPresenter : MainContract.Presenter {

  private var mViewModel: MainContract.ViewModel? = null
  private lateinit var mSchedulerProvider: BaseSchedulerProvider

  override fun onStart() {}

  override fun onStop() {}

  override fun setViewModel(viewModel: MainContract.ViewModel) {
    mViewModel = viewModel
  }

  fun setSchedulerProvider(schedulerProvider: BaseSchedulerProvider) {
    mSchedulerProvider = schedulerProvider
  }
}
