package com.framgia.quick_search.screen.favorite;

import android.content.Context
import com.framgia.quick_search.screen.AppComponent
import com.framgia.quick_search.screen.utils.dagger.ActivityScope
import dagger.Component

/**
 * This is a Dagger component. Refer to {@link com.framgia.quick_search.MainApplication} for the list of Dagger components
 * used in this application.
 */
@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class),
    modules = arrayOf(FavoriteModule::class))
interface FavoriteComponent {
  fun inject(favoriteActivity: FavoriteActivity)

  fun applicationContext(): Context

}
