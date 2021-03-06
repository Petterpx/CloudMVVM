package com.cloud.aac.core.base

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.cloud.aac.core.ktx.CloudConfig
import com.cloud.aac.core.ktx.getAppViewModelProvider
import com.cloud.aac.core.expand.IBarExpand

/**
 * @Author petterp
 * @Date 2020/8/10-11:16 AM
 * @Email ShiyihuiCloud@163.com
 * @Function 基础BaseActivity
 */
abstract class BaseActivity : FragmentActivity(), IBarExpand {

    val mHandler by lazy {
        CloudConfig.HANDLER
    }

    open fun initView() {}

    open fun initData() {}

    /** 用于加载contentView */
    abstract fun initCrate(savedInstanceState: Bundle?)


    /** 获取指定ViewModel */
    inline fun <reified VM : ViewModel> getViewModel(): VM =
        ViewModelProvider(this).get(VM::class.java)

    fun appViewModelProvider(): ViewModelProvider = getAppViewModelProvider(application)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initCrate(savedInstanceState)
        initView()
        initData()
    }

    override fun onResume() {
        super.onResume()
        updateBar()
    }

}