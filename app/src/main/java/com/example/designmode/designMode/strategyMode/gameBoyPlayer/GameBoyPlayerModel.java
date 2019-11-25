package com.example.designmode.designMode.strategyMode.gameBoyPlayer;

/**
 * Created by anchaoguang on 2019-11-20.
 * 可以插卡的游戏机
 */
public abstract class GameBoyPlayerModel {

    // 游戏机上装有一个类型为GameBoyCard的插槽，只可GameBoy卡插入
    private GameBoyCard mGameBoyCard;
    // 游戏的外观，生产时决定
    public abstract void display();
    // 用于插入游戏卡
    public void setmGameBoyCard(GameBoyCard gameBoyCard){
        this.mGameBoyCard = gameBoyCard;
    }
    // 开始游戏按钮
    public void startGame(){
        mGameBoyCard.game();
    }
}
