package com.example.designmode.designMode.factoryMode.methodFactory;

import com.example.designmode.designMode.factoryMode.simpleFactory.CeramicsCup;
import com.example.designmode.designMode.factoryMode.simpleFactory.Cup;

/**
 * Created by anchaoguang on 2019-11-20.
 */
public class CeramicsCupFactory implements Factory{
    @Override
    public Cup productCup() {
        return new CeramicsCup();
    }
}
