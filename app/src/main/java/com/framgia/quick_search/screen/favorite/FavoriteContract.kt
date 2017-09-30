package com.framgia.quick_search.screen.favorite;

import com.framgia.quick_search.screen.BasePresenter;
import com.framgia.quick_search.screen.BaseViewModel;

/**
 * This specifies the contract between the view and the presenter.
 */
interface FavoriteContract {
  /**
   * View.
   */
  interface ViewModel : BaseViewModel

  /**
   * Presenter.
   */
  interface Presenter : BasePresenter<ViewModel>
}
