package com.example.designmode.designMode.factoryMode.methodFactory;

import com.example.designmode.designMode.factoryMode.simpleFactory.Cup;
import com.example.designmode.designMode.factoryMode.simpleFactory.GlassCup;

/**
 * Created by anchaoguang on 2019-11-20.
 */
public class GlassCupFactory implements Factory{
    @Override
    public Cup productCup() {
        return new GlassCup();
    }
}
