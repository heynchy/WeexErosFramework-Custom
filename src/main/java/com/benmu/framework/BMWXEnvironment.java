package com.benmu.framework;

import android.content.Context;

import com.benmu.framework.model.PlatformConfigBean;
import com.tencent.mm.opensdk.openapi.IWXAPI;

/**
 * Created by Carry on 2017/8/23.
 */

public class BMWXEnvironment {
    public static PlatformConfigBean mPlatformConfig;
    public static Context mApplicationContext;
    public static IWXAPI mWXApi;
}
