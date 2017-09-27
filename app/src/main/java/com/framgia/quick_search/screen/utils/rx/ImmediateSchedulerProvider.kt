package com.framgia.quick_search.screen.utils.rx

import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers

/**
 * Created by levutantuan on 9/26/17.
 */
open class ImmediateSchedulerProvider : BaseSchedulerProvider {

  override fun computation(): Scheduler {
    return Schedulers.trampoline()
  }

  override fun io(): Scheduler {
    return Schedulers.trampoline()
  }

  override fun ui(): Scheduler {
    return Schedulers.trampoline()
  }
}
