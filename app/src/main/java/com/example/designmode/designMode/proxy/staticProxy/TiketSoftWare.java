package com.example.designmode.designMode.proxy.staticProxy;

/**
 * Created by anchaoguang on 2019-11-20.
 */
public class TiketSoftWare implements Subject {
    TrainStation mTrainStation;

    @Override
    public void buyTicket() {
        if (mTrainStation == null) {
            mTrainStation = new TrainStation();
        }
        mTrainStation.buyTicket();
        buyInsurance();
    }

    private void buyInsurance() {
        System.out.println("买了一份保险");
    }

    public static void main(String args[]){
        TiketSoftWare tiketSoftWare = new TiketSoftWare();
        tiketSoftWare.buyTicket();
    }
}
