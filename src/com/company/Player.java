package com.company;

public class Player {

    private final String Name;
    public String race;
    private final int Age;
    private int Level = 0;
    private int ManaPoint;
    private int HealthPoint;
    private int pAttack;
    private int spAttack;

    public Player(String Name, int Age, String race){
        this.Name = Name;
        this.Age = Age;
        this.race = race;
        Races playerRace = new Races(race);
        HealthPoint = playerRace.HealthPoint();
        ManaPoint = playerRace.ManaPoint();
        pAttack = playerRace.pAttack();
        spAttack = playerRace.spAttack();
    }

    public void info(){
        System.out.println("Name: "+Name);
        System.out.println("Age: "+Age);
        System.out.println("Level: "+Level);
        System.out.println("Race: "+race);
        System.out.println("HealthPoints: "+HealthPoint);
        System.out.println("ManaPoints: "+ManaPoint);
    }
    public int getHealthPoint(){
        return HealthPoint;
    }
    public int getManaPoint(){
        return ManaPoint;
    }
    public int getpAttack(){
        return pAttack;
    }

    public int getSpAttack() {
        return spAttack;
    }

    public void setLevel(int level) {
        this.Level += level;
    }
}
