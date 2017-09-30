package com.framgia.quick_search.screen.splash;

import android.databinding.DataBindingUtil
import android.os.Bundle
import com.framgia.quick_search.R
import com.framgia.quick_search.databinding.ActivitySplashBinding
import com.framgia.quick_search.screen.BaseActivity
import com.framgia.quick_search.screen.MainApplication
import javax.inject.Inject

/**
 * Splash Screen.
 */
class SplashActivity : BaseActivity(), SplashContract.ViewModel {

  @Inject
  internal lateinit var presenter: SplashContract.Presenter
  private lateinit var mSplashComponent: SplashComponent

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    mSplashComponent = DaggerSplashComponent.builder()
        .appComponent((application as MainApplication).appComponent)
        .splashModule(SplashModule(this))
        .build()
    mSplashComponent.inject(this)

    val binding = DataBindingUtil.setContentView<ActivitySplashBinding>(this,
        R.layout.activity_splash)
    binding.viewModel = this
  }

  override fun onStart() {
    super.onStart()
    presenter.onStart()
  }

  override fun onStop() {
    presenter.onStop()
    super.onStop()
  }
}
