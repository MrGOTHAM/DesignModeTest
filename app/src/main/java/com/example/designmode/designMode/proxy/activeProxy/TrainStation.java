package com.example.designmode.designMode.proxy.activeProxy;

/**
 * Created by anchaoguang on 2019-11-20.
 */
public class TrainStation implements Subject {
    @Override
    public void buyTicket() {
        System.out.println("成功买到一张票");
    }
}
