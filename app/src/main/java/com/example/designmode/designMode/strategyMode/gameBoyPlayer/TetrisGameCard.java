package com.example.designmode.designMode.strategyMode.gameBoyPlayer;

/**
 * Created by anchaoguang on 2019-11-20.
 * 俄罗斯方块游戏
 */
public class TetrisGameCard implements GameBoyCard {

    @Override
    public void game() {
        System.out.println("正在俄罗斯方块游戏中");
    }

    public static void main(String args[]){
        // 生产游戏机
        PinkGameBoyPlayer pink = new PinkGameBoyPlayer();
        // 生产游戏卡
        TetrisGameCard teri = new TetrisGameCard();
        // 插入游戏卡
        pink.setmGameBoyCard(teri);
        // 开始游戏
        pink.startGame();
    }
}
