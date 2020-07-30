package com.alibaba.android.arouter.demo.module1;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.base.IRouterConfig;

@Route(path = "/java/arouter/config")
public class ArouterConfig implements IRouterConfig {

    public static final String TESTMODULE1 = "/java/module/2";
    public static final String TESTMODULE2 = "/java/module/1";

    @Override
    public String getModule1Path() {
        return TESTMODULE1;
    }

    @Override
    public String getModule2Path() {
        return TESTMODULE2;
    }

    @Override
    public void init(Context context) {

    }
}
