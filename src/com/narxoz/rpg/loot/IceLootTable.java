package com.narxoz.rpg.loot;
import java.util.ArrayList;
import java.util.List;

public class IceLootTable implements LootTable {
    private List<String> items;
    private int goldDrop;
    private int experienceDrop;
    public IceLootTable() {
        items = new ArrayList<>();
        items.add("Ice Blade");
        items.add("Frozen Shield");

        goldDrop = 250;
        experienceDrop = 450;
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
        IceLootTable copy = new IceLootTable();
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
        return "Ice Loot: " + items + ", Gold: " + goldDrop + ", XP: " + experienceDrop;
    }
}
