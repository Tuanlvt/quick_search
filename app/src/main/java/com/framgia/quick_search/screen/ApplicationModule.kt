package com.framgia.quick_search.screen

import android.content.Context
import com.framgia.quick_search.screen.utils.dagger.AppScope
import com.framgia.quick_search.screen.utils.rx.BaseSchedulerProvider
import com.framgia.quick_search.screen.utils.rx.SchedulerProvider
import dagger.Module
import dagger.Provides

/**
 * Created by levutantuan on 9/26/17.
 */
@Module
class ApplicationModule(private val mContext: Context) {

  @Provides
  @AppScope
  fun provideApplicationContext(): Context {
    return mContext
  }

  @Provides
  @AppScope
  fun provideBaseSchedulerProvider(): BaseSchedulerProvider {
    return SchedulerProvider.instance
  }
}
