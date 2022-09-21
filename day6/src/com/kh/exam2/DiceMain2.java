package com.kh.exam2;

public class DiceMain2 {
    public static void main(String[] args) {
        final int COUNT = 5;
        Dice[] dices = new Dice[COUNT];

        for (int i = 0; i < dices.length; i++) {
            dices[i] = new Dice();
        }
        int sum = 0;
        for (int i = 0; i < dices.length; i++) {
            dices[i].roll();
            System.out.println((i + 1) + "번째 주사위 눈 : " + dices[i].getFaceValue());
            sum += dices[i].getFaceValue();
        }

        System.out.println(COUNT + "개주사위 눈의 합=" + sum);
    }
}
