package com.example.designmode.designMode.factoryMode.methodFactory;

import com.example.designmode.designMode.factoryMode.simpleFactory.Cup;

/**
 * Created by anchaoguang on 2019-11-20.
 */
public class Client {
    public static void main(String args[]){
        CeramicsCupFactory ceramicsCupFactory = new CeramicsCupFactory();
        Cup ceramicsCup = ceramicsCupFactory.productCup();
        ceramicsCup.useCup();

        GlassCupFactory glassCupFactory = new GlassCupFactory();
        Cup glassCup = glassCupFactory.productCup();
        glassCup.useCup();
    }
}
