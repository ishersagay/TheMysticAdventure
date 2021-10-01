package com.company;

public class Races {

    private String Race;
    private int HealthPoint;
    private int ManaPoint;
    private int pAttack;
    private int spAttack;

    public Races(String race){
        this.Race = race;

        switch (Race){
            case "Humans":
                Humans();
            case "Elf":
                Elf();
            case "Dwarf":
                Dwarf();
            case "DarkElf":
                DarkElf();
        }
    }

    private void Humans(){
        this.HealthPoint = 100;
        this.ManaPoint = 100;
        this.spAttack = 25;
        this.pAttack = 15;
    }

    private void Elf(){
        this.HealthPoint = 80;
        this.ManaPoint = 120;
        this.pAttack = 10;
        this.spAttack = 20;
    }

    private void Dwarf(){
        this.HealthPoint = 150;
        this.ManaPoint = 50;
        this.pAttack = 40;
        this.spAttack = 60;
    }

    public void DarkElf(){
        this.HealthPoint = 50;
        this.ManaPoint = 150;
        this.pAttack = 50;
        this.spAttack = 70;
    }

    public int HealthPoint(){
        return HealthPoint;
    }

    public int ManaPoint(){
        return ManaPoint;
    }

    public int pAttack(){
        return pAttack;
    }

    public int spAttack(){
        return spAttack;
    }

}
