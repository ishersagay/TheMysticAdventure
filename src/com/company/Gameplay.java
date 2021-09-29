package com.company;
import java.math.*;
import java.util.Scanner;

public class Gameplay {

    String name;
    String race = null;
    int age;
    int choice;

    public Gameplay(){

    }

    public void intro(){
        Scanner szKeyboard = new Scanner(System.in);
        System.out.println("Welcome to \nThe Mystic Adventures");

        System.out.print("What is your name Adventurer: ");
        name = szKeyboard.next();

        System.out.print(name+" How old is ye?: ");
        age = szKeyboard.nextInt();

        System.out.println("Before you set out onto your adventure you must select your race: ");
        System.out.println("1: Human \n2: Elf \n3: Dwarf \n4: Dark Elf");
        choice = szKeyboard.nextInt();

        switch (choice){
            case 1:
                race = "Humans";
            case 2:
                race = "Elf";
            case 3:
                race = "Dwarf";
            case 4:
                race = "DarkElf";
        }

        System.out.println("You're now "+name+" The "+race);
    }

    public void playerInfo(){
        Player newPlayer = new Player(name,age,race);
        newPlayer.info();
    }

    public void battle(){

    }

}
