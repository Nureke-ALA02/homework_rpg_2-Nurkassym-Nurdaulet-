package com.narxoz.rpg.combat;

public class ShadowStrike implements Ability {
    @Override
    public String getName() {
        return "Shadow Strike";
    }

    @Override
    public int getDamage() {
        return 0;
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public Ability clone() {
        return null;
    }
}
