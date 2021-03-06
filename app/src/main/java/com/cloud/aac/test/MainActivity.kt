package com.cloud.aac.test

import android.content.Intent
import android.os.Bundle
import com.cloud.aac.test.databing_ktx.TestDataBingActivity
import com.cloud.aac.test.tab_ktx.TestTabActivity
import com.cloud.aac.test.core.TestVMActivity
import com.cloud.aac.core.base.BaseActivity
import com.cloud.aac.test.viewbing_ktx.TestViewBingActivity
import kotlinx.android.synthetic.main.activity_main.*

/** 示例Activity入口 */
class MainActivity : BaseActivity() {
    override fun initCrate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_main)
    }

    override fun initView() {
        btnBing.setOnClickListener {
            startActivity(Intent(this, TestDataBingActivity::class.java))
        }
        btnVm.setOnClickListener {
            startActivity(Intent(this, TestVMActivity::class.java))
        }
        btnViewBing.setOnClickListener {
            startActivity(Intent(this, TestViewBingActivity::class.java))
        }
        btnTab.setOnClickListener {
            startActivity(Intent(this, TestTabActivity::class.java))
        }
    }

}