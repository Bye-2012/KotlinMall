package com.moon.usercenter.ui.activity

import android.os.Bundle
import com.moon.base.ui.activity.BaseMvpActivity
import com.moon.usercenter.R
import com.moon.usercenter.presenter.RegisterPresenter
import com.moon.usercenter.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.toast

class RegisterActivity : BaseMvpActivity<RegisterPresenter>(), RegisterView {

    override fun onRegisterResult(isSuccess: Boolean) {
        toast("注册成功")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        mPresenter = RegisterPresenter()
        mPresenter.mView = this

        mRegisterBtn.setOnClickListener {
            mPresenter.register("", "")
        }
    }
}
