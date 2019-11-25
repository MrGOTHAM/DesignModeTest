package com.example.designmode.designMode.strategyMode.gamePlayer;

/**
 * Created by anchaoguang on 2019-11-20.
 */
public class RedTetrisPlayer extends GamePlayModel {
    @Override
    void game() {
        System.out.println("正在俄罗斯方块游戏中。。。");
    }

    @Override
    void display() {
        System.out.println("一台红色游戏机");
    }

    public static void main(String args[]) {
        RedTetrisPlayer red = new RedTetrisPlayer();
        red.startGame();
        red.display();
    }
}
