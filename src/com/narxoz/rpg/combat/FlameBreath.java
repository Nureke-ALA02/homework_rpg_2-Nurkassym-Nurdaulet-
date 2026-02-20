package com.narxoz.rpg.combat;

public class FlameBreath implements Ability {
    @Override public String getName(){
        return "Flame Breath";
    }

    @Override
    public int getDamage() {
        return 0;
    }
    @Override public Ability clone(){
        return new FlameBreath();
    }
}
