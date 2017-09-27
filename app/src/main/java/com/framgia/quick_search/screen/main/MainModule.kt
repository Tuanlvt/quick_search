package com.framgia.quick_search.screen.main;

import android.app.Activity
import com.framgia.quick_search.screen.utils.dagger.ActivityScope
import com.framgia.quick_search.screen.utils.rx.BaseSchedulerProvider
import dagger.Module
import dagger.Provides

/**
 * This is a Dagger module. We use this to pass in the View dependency to
 * the {@link MainPresenter}.
 */
@Module
class MainModule(private val activity: Activity) {

  @ActivityScope
  @Provides
  fun providePresenter(schedulerProvider: BaseSchedulerProvider): MainContract.Presenter {
    val presenter = MainPresenter()
    presenter.setViewModel(activity as MainContract.ViewModel)
    presenter.setSchedulerProvider(schedulerProvider)
    return presenter
  }
}
