package com.framgia.quick_search.screen.splash;

import android.app.Activity
import com.framgia.quick_search.screen.utils.dagger.ActivityScope
import dagger.Module
import dagger.Provides

/**
 * This is a Dagger module. We use this to pass in the View dependency to
 * the {@link SplashPresenter}.
 */
@Module
class SplashModule(private val activity: Activity) {

  @ActivityScope
  @Provides
  fun providePresenter(): SplashContract.Presenter {
    val presenter = SplashPresenter()
    presenter.setViewModel(activity as SplashContract.ViewModel)
    return presenter
  }
}
