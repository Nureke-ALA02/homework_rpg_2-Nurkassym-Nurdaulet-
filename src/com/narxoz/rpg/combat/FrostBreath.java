package com.narxoz.rpg.combat;

public class FrostBreath implements Ability {
    private String name = "Frost Breath";

    public String getName() {
        return name;
    }

    @Override
    public int getDamage() {
        return 0;
    }
    public Ability clone() {
        return new FrostBreath();
    }
}
