package com.example.base;

import android.app.Activity;

import com.alibaba.android.arouter.facade.template.IProvider;

public interface ILogin extends IProvider {
    void login(Activity activity,String userName,String password);
    void loginout(Activity activity);
}
