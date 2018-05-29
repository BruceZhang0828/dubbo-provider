package com.sharearn.dubbo.provider.impl;

import com.sharearn.dubbo.remote.TestService;

/**
 * Created by deepbay on 2018/5/29.
 */
public class TestServiceImpl implements TestService{



    public String sayHello(String name) {
        return "Hello " + name + "!";
    }
}
