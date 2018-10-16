package com.moon.base.ui.activity

import com.moon.base.presenter.BasePresenter
import com.moon.base.presenter.view.BaseView

/**
 * Created by my.
 * Date: 2018/10/12.
 * Desc:
 */
open class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {
    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun onError() {
    }

    lateinit var mPresenter: T
}