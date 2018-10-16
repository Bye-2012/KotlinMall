package com.moon.base.presenter

import com.moon.base.presenter.view.BaseView

/**
 * Created by my.
 * Date: 2018/10/12.
 * Desc:
 */
open class BasePresenter<T : BaseView> {
    lateinit var mView: T
}