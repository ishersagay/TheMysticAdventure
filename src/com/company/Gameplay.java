package com.company;
import java.math.*;
import java.util.Scanner;

public class Gameplay{

    String name;
    String race = null;
    int age;
    int choice;
    Player player;

    //Monster classes
////    Slime slime = new Slime();
//    Monster monster = new Monster();
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
                break;
            case 2:
                race = "Elf";
                break;
            case 3:
                race = "Dwarf";
                break;
            case 4:
                race = "DarkElf";
                break;
        }
        System.out.println("You're now "+name+" The "+race);
        player = new Player(name,age,race);
    }

    public void playerInfo(){
        player.info();
    }

    public void battle(Monster monster){
        Scanner keyboard = new Scanner(System.in);
        int MonsterHP = monster.HealthPoint();
        System.out.println("You've stumbled upon a "+monster.name());
        System.out.println("\n Your current health is : "+player.getHealthPoint() +"\n The "+monster.name()+" health is : "+monster.HealthPoint());
        System.out.println("");

        System.out.println("1) Main Attack dmg: "+player.getpAttack() +"\n2) Special attack dmg: "+player.getSpAttack() +"\n3) Heal up");
        MonsterHP = MainAttack(monster,MonsterHP);
        MonsterHP = SpecialAttack(monster,MonsterHP);

        if (MonsterHP <= 0){
            System.out.println("You've now defeated the "+monster.name()+" and have leveled up well done adventure");
            player.setLevel(monster.giveLevels());
        }
    }

    public int MainAttack(Monster msn, int monsterHP){
        System.out.println(name +" has decided to use main attack "+msn.name()+" health is now "+(monsterHP - player.getpAttack()));

        return monsterHP - player.getpAttack();
    }

    public int SpecialAttack(Monster msn, int monsterHP){
        System.out.println(name+" has decided to use special attack "+msn.name()+" health is now "+(monsterHP - msn.SPAttack()));
        return monsterHP - player.getSpAttack();
    }

}
