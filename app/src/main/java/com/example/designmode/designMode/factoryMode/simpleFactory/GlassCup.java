package com.example.designmode.designMode.factoryMode.simpleFactory;

/**
 * Created by anchaoguang on 2019-11-20.
 */
public class GlassCup implements Cup {
    @Override
    public void useCup() {
        System.out.println("我正在使用玻璃杯。。。。");
    }
}
