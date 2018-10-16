package com.moon.usercenter.presenter

import com.moon.base.presenter.BasePresenter
import com.moon.usercenter.presenter.view.RegisterView

/**
 * Created by my.
 * Date: 2018/10/12.
 * Desc:
 */
class RegisterPresenter : BasePresenter<RegisterView>() {

    fun register(mobile: String, vCode: String) {
        mView.onRegisterResult(true)
    }
}
