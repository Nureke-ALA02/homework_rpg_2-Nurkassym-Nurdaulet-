package com.narxoz.rpg.loot;
import java.util.ArrayList;
import java.util.List;

public class ShadowLootTable implements LootTable {
    private List<String> items;
    private int goldDrop;
    private int experienceDrop;
    public ShadowLootTable() {
        items = new ArrayList<>();
        items.add("Shadow Dagger");
        items.add("Dark Cloak");

        goldDrop = 350;
        experienceDrop = 600;
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
        ShadowLootTable copy = new ShadowLootTable();
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
        return "Shadow Loot: " + items + ", Gold: " + goldDrop + ", XP: " + experienceDrop;
    }
}
