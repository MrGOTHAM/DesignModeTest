package com.example.designmode.designMode.strategyMode.gamePlayer;

/**
 * Created by anchaoguang on 2019-11-20.
 * 只有一个内置游戏的游戏机，不可以插卡
 */
public abstract class GamePlayModel {
    // 每个游戏机都内置一款游戏，具体游戏类型在生成具体的游戏机时装入
    abstract void game();
    // 游戏外观， 具体在生成时决定
    abstract void display();
    // 点击游戏机上的开始游戏按钮进入游戏
    public void startGame(){
        game();
    }
}