package com.example.designmode.designMode.factoryMode.abstractFactory;

import com.example.designmode.designMode.factoryMode.simpleFactory.Cup;

/**
 * Created by anchaoguang on 2019-11-20.
 */
public interface Factory {
    Cup productCup();
    Cover productCover();
}
