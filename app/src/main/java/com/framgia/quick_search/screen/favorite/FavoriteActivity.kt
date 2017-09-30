package com.framgia.quick_search.screen.favorite;

import android.databinding.DataBindingUtil
import android.os.Bundle
import com.framgia.quick_search.R
import com.framgia.quick_search.databinding.ActivityFavoriteBinding
import com.framgia.quick_search.screen.BaseActivity
import com.framgia.quick_search.screen.MainApplication
import javax.inject.Inject

/**
 * Favorite Screen.
 */
class FavoriteActivity : BaseActivity(), FavoriteContract.ViewModel {

  @Inject
  internal lateinit var presenter: FavoriteContract.Presenter
  private lateinit var mFavoriteComponent: FavoriteComponent

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    mFavoriteComponent = DaggerFavoriteComponent.builder()
        .appComponent((application as MainApplication).appComponent)
        .favoriteModule(FavoriteModule(this))
        .build()
    mFavoriteComponent.inject(this)

    val binding = DataBindingUtil.setContentView<ActivityFavoriteBinding>(this,
        R.layout.activity_favorite)
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
