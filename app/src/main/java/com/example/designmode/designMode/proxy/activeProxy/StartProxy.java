package com.example.designmode.designMode.proxy.activeProxy;

import java.lang.reflect.Proxy;

/**
 * Created by anchaoguang on 2019-11-20.
 */
public class StartProxy {

    public static void main(String args[]) {
        TrainStation trainStation = new TrainStation();
        MyInvocationHandler handler = new MyInvocationHandler();
        handler.setTarget(trainStation);
        // 获取由虚拟机为我们生成的代理对象
        Subject proxy = (Subject) Proxy.newProxyInstance(trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(), handler);
        // 调用代理对象的买票方法
        proxy.buyTicket();
    }
}
