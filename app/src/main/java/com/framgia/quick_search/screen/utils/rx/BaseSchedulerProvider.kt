package com.framgia.quick_search.screen.utils.rx

import io.reactivex.Scheduler

/**
 * Created by levutantuan on 9/26/17.
 */
interface BaseSchedulerProvider {

  fun computation(): Scheduler

  fun io(): Scheduler

  fun ui(): Scheduler
}
