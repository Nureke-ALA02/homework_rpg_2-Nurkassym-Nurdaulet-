package com.narxoz.rpg.enemy;

public interface Enemy extends Cloneable {
    String getName();
    void displayInfo();
    Enemy clone();
}
