package com.narxoz.rpg.enemy;

public class Goblin implements Enemy {
    private String name;
    private int health;
    private int damage;
    public Goblin(String name) {
        this.name = name;
        this.health = 100;
        this.damage = 15;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void displayInfo() {
        System.out.println("=== Goblin ===");
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Damage: " + damage);
    }
    @Override
    public Enemy clone() {
        return new Goblin(this.name);
    }
}
