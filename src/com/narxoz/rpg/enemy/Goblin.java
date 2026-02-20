package com.narxoz.rpg.enemy;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;

import java.util.ArrayList;
import java.util.List;

public class Goblin implements Enemy {

    private String name;
    private int health;
    private int damage;
    private String element;
    private String ai;

    private List<Ability> abilities = new ArrayList<>();
    private LootTable lootTable;

    public Goblin(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public void setAI(String ai) {
        this.ai = ai;
    }

    public void setLootTable(LootTable lootTable) {
        this.lootTable = lootTable;
    }

    public void addAbility(Ability ability) {
        this.abilities.add(ability);
    }

    public void setName(String name) {
        this.name = name;
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
        System.out.println("Element: " + element);
        System.out.println("AI: " + ai);

        System.out.println("Abilities:");
        for (Ability ability : abilities) {
            System.out.println("- " + ability.getName());
        }

        if (lootTable != null) {
            System.out.println("Gold Drop: " + lootTable.getGoldDrop());
            System.out.println("Experience Drop: " + lootTable.getExperienceDrop());
            System.out.println("Items: " + lootTable.getItems());
            lootTable.displayLoot();
            System.out.println("Loot Summary: " + lootTable.getLootInfo());
        }
    }

    @Override
    public Enemy clone() {
        Goblin copy = new Goblin(this.name, this.health);
        copy.damage = this.damage;
        copy.element = this.element;
        copy.ai = this.ai;

        for (Ability ability : abilities) {
            copy.addAbility(ability);
        }

        if (lootTable != null) {
            copy.setLootTable(lootTable.clone());
        }

        return copy;
    }
}
