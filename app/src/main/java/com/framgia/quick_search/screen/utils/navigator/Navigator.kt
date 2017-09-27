package com.framgia.quick_search.screen.utils.navigator

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.text.TextUtils
import android.util.Patterns

/**
 * Created by levutantuan on 9/27/17.
 */
open class Navigator {
  private var mActivity: Activity
  private var mFragment: Fragment? = null

  constructor(activity: Activity) {
    mActivity = activity
  }

  constructor(fragment: Fragment) {
    mFragment = fragment
    mActivity = fragment.activity
  }

  private fun startActivity(intent: Intent) {
    mActivity.startActivity(intent)
  }

  fun startActivity(clazz: Class<out Activity>) {
    val intent = Intent(mActivity, clazz)
    startActivity(intent)
  }

  fun startActivity(clazz: Class<out Activity>, args: Bundle) {
    val intent = Intent(mActivity, clazz)
    intent.putExtras(args)
    startActivity(intent)
  }

  fun startActivityAtRoot(clazz: Class<out Activity>) {
    val intent = Intent(mActivity, clazz)
    intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
    startActivity(intent)
  }

  fun startActivityForResult(intent: Intent, requestCode: Int) {
    mActivity.startActivityForResult(intent, requestCode)
  }

  fun startActivityForResult(clazz: Class<out Activity>, args: Bundle,
      requestCode: Int) {
    val intent = Intent(mActivity, clazz)
    intent.putExtras(args)
    startActivityForResult(intent, requestCode)
  }

  fun startActivityForResultFromFragment(clazz: Class<out Activity>, requestCode: Int) {
    val intent = Intent(mActivity, clazz)
    mFragment!!.startActivityForResult(intent, requestCode)
  }


  fun finishActivity() {
    mActivity.finish()
  }

  fun finishActivityWithResult(intent: Intent, resultCode: Int) {
    mActivity.setResult(resultCode, intent)
    finishActivity()
  }

  fun finishActivityWithResult(resultCode: Int) {
    mActivity.setResult(resultCode)
    finishActivity()
  }

  fun openUrl(url: String) {
    if (TextUtils.isEmpty(url) || !Patterns.WEB_URL.matcher(url).matches()) {
      return
    }
    val intent = Intent(Intent.ACTION_VIEW).setData(Uri.parse(url))
    startActivity(intent)
  }
}
