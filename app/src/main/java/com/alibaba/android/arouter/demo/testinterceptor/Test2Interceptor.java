package com.alibaba.android.arouter.demo.testinterceptor;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;

@Interceptor(name = "test2Interceptor",priority = 1)
public class Test2Interceptor implements IInterceptor {
    @Override
    public void process(Postcard postcard, InterceptorCallback callback) {
        callback.onContinue(postcard);
//        callback.onInterrupt(new Throwable("拦截"));
    }

    @Override
    public void init(Context context) {
        //TODO 做初始化，保证只会执行一次
    }
}
