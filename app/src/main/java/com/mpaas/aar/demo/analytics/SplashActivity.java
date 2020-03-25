package com.mpaas.aar.demo.analytics;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.mpaas.mas.adapter.api.MPLogger;
import com.ta.utdid2.device.UTDevice;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                Intent intent = new Intent(SplashActivity.this, AnalyticsActivity.class);
                startActivity(intent);
                finish();
            }
        }, 200);

        String deviceId = UTDevice.getUtdid(this);
        MPLogger.reportClientLaunch(deviceId);
    }

}
