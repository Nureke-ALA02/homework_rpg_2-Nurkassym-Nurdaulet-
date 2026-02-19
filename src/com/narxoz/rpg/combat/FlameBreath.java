package com.narxoz.rpg.combat;

public class FlameBreath implements Ability {
    @Override public String getName(){
        return "Flame Breath";
    }
    @Override public int getDamege(){
        return 50;
    }
    @Override public String getDescription(){
        return "AoE fire damage+ burn";
    }
    @Override public Ability clone(){
        return new FlameBreath();
    }
}
