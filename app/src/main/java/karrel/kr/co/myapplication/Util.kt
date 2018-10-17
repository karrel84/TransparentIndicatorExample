package karrel.kr.co.myapplication

import android.content.Context

/**
 * Created by Rell on 2018. 10. 17..
 */

fun statusBarHeight(context: Context): Int {
    val resourceId = context.resources.getIdentifier("status_bar_height", "dimen", "android")

    return if (resourceId > 0) context.resources.getDimensionPixelSize(resourceId)
    else 0
}