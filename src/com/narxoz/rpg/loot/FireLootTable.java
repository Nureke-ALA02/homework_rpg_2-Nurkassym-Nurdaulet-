package com.narxoz.rpg.loot;

import java.util.ArrayList;
import java.util.List;

public class FireLootTable implements LootTable {
    private List<String> items;
    private int goldDrop;
    private int experienceDrop;

    public FireLootTable() {
        items = new ArrayList<>();
        items.add("Fire Sword");
        items.add("Lava Armor");

        goldDrop = 300;
        experienceDrop = 500;
    }
    @Override
    public List<String> getItems() {
        return items;
    }
    @Override
    public int getGoldDrop() {
        return goldDrop;
    }

    @Override
    public int getExperienceDrop() {
        return experienceDrop;
    }

    @Override
    public LootTable clone() {
        FireLootTable copy = new FireLootTable();
        copy.items = new ArrayList<>(this.items);
        copy.goldDrop = this.goldDrop;
        copy.experienceDrop = this.experienceDrop;
        return copy;
    }

    @Override
    public void displayLoot() {
        System.out.println("Gold: " + goldDrop);
        System.out.println("XP: " + experienceDrop);
        System.out.println("Items: " + items);
    }

    @Override
    public String getLootInfo() {
        return "Fire Loot: " + items + ", Gold: " + goldDrop + ", XP: " + experienceDrop;
    }
}
