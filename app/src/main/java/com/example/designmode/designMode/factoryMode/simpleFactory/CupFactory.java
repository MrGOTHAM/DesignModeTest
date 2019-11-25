package com.example.designmode.designMode.factoryMode.simpleFactory;

/**
 * Created by anchaoguang on 2019-11-20.
 * 杯子工厂
 */
public class CupFactory {
    public Cup productCup(String cupType) {
        switch (cupType) {
            case "ceramics":
                return new CeramicsCup();
            case "glass":
                return new GlassCup();
            default:
                return new CeramicsCup();
        }
    }
}
