package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        boolean GameOver = false;
        Gameplay gameplay = new Gameplay();
        gameplay.intro();
        gameplay.playerInfo();
        System.out.println("You're not ready to start you're adventure \nBeware of the monsters and defeat" +
                " the dragon to save the day");
        System.out.println("If you ever feel like leaving the game early, just type exit");

        while (!GameOver){

        }
    }

}
