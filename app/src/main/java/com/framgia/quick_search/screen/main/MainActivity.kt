package com.framgia.quick_search.screen.main;

import android.databinding.DataBindingUtil
import android.os.Bundle
import com.framgia.quick_search.R
import com.framgia.quick_search.databinding.ActivityMainBinding
import com.framgia.quick_search.screen.BaseActivity
import com.framgia.quick_search.screen.MainApplication
import javax.inject.Inject

/**
 * Main Screen.
 */
class MainActivity : BaseActivity(), MainContract.ViewModel {

  @Inject
  internal lateinit var presenter: MainContract.Presenter
  private lateinit var mainComponent: MainComponent

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    mainComponent = DaggerMainComponent.builder()
        .appComponent((application as MainApplication).appComponent)
        .mainModule(MainModule(this))
        .build()
    mainComponent.inject(this)

    val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,
        R.layout.activity_main)
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

  fun getMainComponent(): MainComponent {
    return mainComponent
  }
}
