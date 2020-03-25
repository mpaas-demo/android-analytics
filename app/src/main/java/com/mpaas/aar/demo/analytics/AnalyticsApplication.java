package com.mpaas.aar.demo.analytics;

import android.app.Application;
import android.content.Context;

import com.alipay.mobile.framework.quinoxless.IInitCallback;
import com.alipay.mobile.framework.quinoxless.QuinoxlessFramework;
import com.mpaas.diagnose.DiagnoseService;

public class AnalyticsApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        QuinoxlessFramework.setup(this, new IInitCallback() {
            @Override
            public void onPostInit() {

            }
        });
    }

    @Override
    public void onCreate() {
        super.onCreate();
        QuinoxlessFramework.init();

        // 内部测试使用，开发者无需关注
        try {
            DiagnoseService.createInstance(this);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
