package com.alibaba.android.arouter.demo.kotlin

import android.app.Activity
import android.content.Context
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.base.ILogin

@Route(path = "/kotlin/login")
class LoginServiceImpl : ILogin {

    override fun login(activity: Activity?, userName: String?, password: String) {
        getHandler().post {
            Toast.makeText(activity, "${userName}登陆成功", Toast.LENGTH_SHORT).show()
        }
    }

    override fun loginout(activity: Activity?) {
        getHandler().post {
            Toast.makeText(activity, "退出登陆", Toast.LENGTH_SHORT).show()
        }
    }

    override fun init(context: Context?) {
    }

    fun getHandler(): Handler = Handler(Looper.getMainLooper())
}