package com.example.base;

import com.alibaba.android.arouter.facade.template.IProvider;

public interface IRouterConfig extends IProvider {
    String getModule1Path();
    String getModule2Path();
}
