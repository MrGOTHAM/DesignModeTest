package com.example.designmode.designMode.factoryMode.simpleFactory;

/**
 * Created by anchaoguang on 2019-11-20.
 */
public class Client {
    public static void main(String args[]){
        // 自产自销杯子
        CeramicsCup ceramicsCup = new CeramicsCup();
        ceramicsCup.useCup();
        GlassCup glassCup = new GlassCup();
        glassCup.useCup();

//        // 使用工厂来制作杯子
//        Cup ceramicsCup = new CupFactory().productCup("ceramics");
//        ceramicsCup.useCup();
//        Cup glassCup = new CupFactory().productCup("glass");
//        glassCup.useCup();
    }
}
