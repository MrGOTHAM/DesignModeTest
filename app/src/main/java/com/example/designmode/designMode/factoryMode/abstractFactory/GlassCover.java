package com.example.designmode.designMode.factoryMode.abstractFactory;

/**
 * Created by anchaoguang on 2019-11-20.
 */
public class GlassCover implements Cover {
    @Override
    public void clean() {
        System.out.println("我是玻璃杯的盖子");
    }
}
