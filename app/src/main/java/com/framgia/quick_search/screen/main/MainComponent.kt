package com.framgia.quick_search.screen.main;

import android.content.Context
import com.framgia.quick_search.screen.AppComponent
import com.framgia.quick_search.screen.utils.dagger.ActivityScope
import com.framgia.quick_search.screen.utils.rx.BaseSchedulerProvider
import dagger.Component

/**
 * This is a Dagger component. Refer to {@link com.framgia.quick_search.MainApplication} for the list of Dagger components
 * used in this application.
 */
@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class),
    modules = arrayOf(MainModule::class))
interface MainComponent {
  fun inject(mainActivity: MainActivity)
  fun applicationContext(): Context

  fun baseSchedulerProvider(): BaseSchedulerProvider
}
