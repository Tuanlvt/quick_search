package com.framgia.quick_search.screen.favorite;

import android.app.Activity
import com.framgia.quick_search.screen.utils.dagger.ActivityScope
import dagger.Module
import dagger.Provides

/**
 * This is a Dagger module. We use this to pass in the View dependency to
 * the {@link FavoritePresenter}.
 */
@Module
class FavoriteModule(private val activity: Activity) {

  @ActivityScope
  @Provides
  fun providePresenter(): FavoriteContract.Presenter {
    val presenter = FavoritePresenter()
    presenter.setViewModel(activity as FavoriteContract.ViewModel)
    return presenter
  }
}
