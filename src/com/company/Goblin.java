package com.company;

public class Goblin implements Monster{
    @Override
    public int Attack() {
        return 10;
    }

    @Override
    public int SPAttack() {
        return 20;
    }

    @Override
    public String name() {
        return "Goblin";
    }

    @Override
    public int HealthPoint() {
        return 40;
    }

    @Override
    public int giveLevels() {
        return 8;
    }
}
