package com.framgia.quick_search.screen.splash;

import com.framgia.quick_search.screen.BasePresenter;
import com.framgia.quick_search.screen.BaseViewModel;

/**
 * This specifies the contract between the view and the presenter.
 */
interface SplashContract {
  /**
   * View.
   */
  interface ViewModel : BaseViewModel

  /**
   * Presenter.
   */
  interface Presenter : BasePresenter<ViewModel>
}
