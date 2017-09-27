package com.framgia.quick_search.screen

import android.app.Application
import com.crashlytics.android.Crashlytics
import io.fabric.sdk.android.Fabric

/**
 * Created by levutantuan on 9/26/17.
 */
class MainApplication : Application() {

  lateinit var appComponent: AppComponent

  override fun onCreate() {
    super.onCreate()
    appComponent = DaggerAppComponent.builder()
        .applicationModule(ApplicationModule(applicationContext))
        .build()
    Fabric.with(this, Crashlytics())
  }
}
