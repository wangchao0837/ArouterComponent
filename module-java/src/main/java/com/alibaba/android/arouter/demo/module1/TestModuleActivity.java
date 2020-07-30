package com.alibaba.android.arouter.demo.module1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.base.ILogin;
import com.example.base.IRouterConfig;

@Route(path = ArouterConfig.TESTMODULE2)
public class TestModuleActivity extends Activity {

    private ILogin navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_module);
        navigation = ARouter.getInstance().navigation(ILogin.class);
    }

    public void loginout(View view) {
        navigation.loginout(this);
    }

    public void login(View view) {
        navigation.login(this,"张三","12345");
    }


}
