package com.example.designmode.designMode.proxy.staticProxy;

/**
 * Created by anchaoguang on 2019-11-20.
 */
public class TrainStation implements Subject {
    @Override
    public void buyTicket() {
        System.out.println("成功买到了一张火车票");
    }
}
