package com.framgia.fbook.utils.binding

import android.databinding.BindingAdapter
import android.support.v7.widget.PopupMenu
import android.support.v7.widget.RecyclerView
import android.view.View
import com.framgia.quick_search.R


/**
 * Created by le.quang.dao on 20/03/2017.
 */

object BindingUtils {
  /**
   * setAdapter For RecyclerView
   */
  @BindingAdapter("recyclerAdapter")
  fun setAdapterForRecyclerView(recyclerView: RecyclerView,
      adapter: RecyclerView.Adapter<*>) {
    recyclerView.adapter = adapter
  }

  @BindingAdapter("showPopupMenuSort")
  fun showPopupMenuSort(view: View,
      listener: PopupMenu.OnMenuItemClickListener) {
    view.setOnClickListener {
      val popupMenu = PopupMenu(view.context, view)
      val menuInflater = popupMenu.menuInflater
      menuInflater.inflate(R.menu.menu, popupMenu.menu)
      popupMenu.setOnMenuItemClickListener(listener)
      popupMenu.show()
    }
  }
}
