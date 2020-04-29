package com.zj.test

import android.content.Context
import android.content.Intent

/**
 * 版权：渤海新能 版权所有
 * @author zhujiang
 * 版本：1.5
 * 创建日期：2020/4/27
 * 描述：AndroidAOP
 *
 */

inline fun <reified T> startActivity(context: Context,block: Intent.() -> Unit){
    val intent = Intent(context, T::class.java)
    intent.block()
    context.startActivity(intent)
}