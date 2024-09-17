package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

public class Dice {
    static Random random = new Random();
    private static int dice1 = random.nextInt(6)+1;
    private static int dice2 = random.nextInt(6)+1;

    public static int dice() {
        return dice1 + dice2;
    }
}
