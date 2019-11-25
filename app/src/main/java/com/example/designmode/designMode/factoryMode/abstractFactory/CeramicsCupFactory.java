package com.example.designmode.designMode.factoryMode.abstractFactory;

import com.example.designmode.designMode.factoryMode.simpleFactory.CeramicsCup;
import com.example.designmode.designMode.factoryMode.simpleFactory.Cup;

/**
 * Created by anchaoguang on 2019-11-20.
 */
public class CeramicsCupFactory implements Factory {
    @Override
    public Cup productCup() {
        return new CeramicsCup();
    }

    @Override
    public Cover productCover() {
        return new CeramicsCover();
    }
}
