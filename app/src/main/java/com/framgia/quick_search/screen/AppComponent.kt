package com.framgia.quick_search.screen

import android.content.Context
import com.framgia.quick_search.screen.utils.dagger.AppScope
import com.framgia.quick_search.screen.utils.rx.BaseSchedulerProvider
import dagger.Component

/**
 * Created by levutantuan on 9/26/17.
 */
@AppScope
@Component(
    modules = arrayOf(ApplicationModule::class))
interface AppComponent {

  fun applicationContext(): Context

  fun baseSchedulerProvider(): BaseSchedulerProvider
}
