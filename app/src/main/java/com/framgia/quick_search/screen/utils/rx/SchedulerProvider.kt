package com.framgia.quick_search.screen.utils.rx

import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by levutantuan on 9/26/17.
 */
class SchedulerProvider private constructor() : BaseSchedulerProvider {

  override fun computation(): Scheduler {
    return Schedulers.computation()
  }

  override fun io(): Scheduler {
    return Schedulers.io()
  }

  override fun ui(): Scheduler {
    return AndroidSchedulers.mainThread()
  }

  private object SchedulerProvider {
    val instance = SchedulerProvider()
  }

  companion object {
    val instance: com.framgia.quick_search.screen.utils.rx.SchedulerProvider by lazy { SchedulerProvider.instance }
  }
}
