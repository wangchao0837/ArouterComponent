package com.alibaba.android.arouter.demo.kotlin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.base.IRouterConfig;

@Route(path = "/kotlin/main")
public class TestNormalActivity extends AppCompatActivity {

    private IRouterConfig navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_normal);
        navigation = ARouter.getInstance().navigation(IRouterConfig.class);
    }

    public void jumpJavaModule2(View view) {
        ARouter.getInstance().build(navigation.getModule2Path()).navigation();
    }

    public void jumpJavaModule1(View view) {

        ARouter.getInstance().build(navigation.getModule1Path()).navigation();
    }
}
