package com.company;

public class Slime implements Monster{
    @Override
    public int Attack() {
        return 5;
    }

    @Override
    public int SPAttack() {
        return 10;
    }

    @Override
    public String name() {
        return "Slime";
    }

    @Override
    public int HealthPoint() {
        return 30;
    }

    @Override
    public int giveLevels() {
        return 5;
    }

    public Slime(){

    }
}
