package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean GameOver = false;
        String endgame = null;
        Monster slime = new Slime();
        Monster goblin = new Goblin();
        Monster[] monsterList = new Monster[3];
        monsterList[1] = slime;
        monsterList[2] = goblin;
        Gameplay gameplay = new Gameplay();



        gameplay.intro();
        gameplay.playerInfo();
        System.out.println("You're now ready to start you're adventure \nBeware of the monsters and defeat" +
                " the dragon to save the day");
        System.out.println("If you ever feel like leaving the game early, just type exit");
        System.out.println("");
        int random = (int) (Math.random() * 3) + 1;
        gameplay.battle(monsterList[random]);
        gameplay.playerInfo();


    }

}
