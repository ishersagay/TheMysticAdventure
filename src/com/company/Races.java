package com.company;

public class Races {

    private String Race;
    private int HealthPoint;
    private int ManaPoint;

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
    }

    private void Elf(){
        this.HealthPoint = 80;
        this.ManaPoint = 120;
    }

    private void Dwarf(){
        this.HealthPoint = 150;
        this.ManaPoint = 50;
    }

    public void DarkElf(){
        this.HealthPoint = 50;
        this.ManaPoint = 150;
    }

    public int HealthPoint(){
        return HealthPoint;
    }

    public int ManaPoint(){
        return ManaPoint;
    }
}
