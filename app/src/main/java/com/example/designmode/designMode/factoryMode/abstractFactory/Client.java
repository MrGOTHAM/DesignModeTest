package com.example.designmode.designMode.factoryMode.abstractFactory;

import com.example.designmode.designMode.factoryMode.simpleFactory.Cup;

/**
 * Created by anchaoguang on 2019-11-20.
 */
public class Client {
    public static void main(String args[]){
        CeramicsCupFactory ceramicsCupFactory = new CeramicsCupFactory();
        Cup ceramicsCup = ceramicsCupFactory.productCup();
        ceramicsCup.useCup();

        Cover ceramicsCover = ceramicsCupFactory.productCover();
        ceramicsCover.clean();

        GlassCupFactory glassCupFactory = new GlassCupFactory();
        Cup glassCup = glassCupFactory.productCup();
        glassCup.useCup();

        Cover glassCover = glassCupFactory.productCover();
        glassCover.clean();
    }
}
