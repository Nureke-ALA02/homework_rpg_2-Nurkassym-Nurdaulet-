package com.narxoz.rpg.builder;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;
import java.util.*;

public class Enemy implements Cloneable {
    private final String name;
    private final int health, damage, defense, speed;
    private final String element, aiBehavior;
    private final List<Ability> abilities;
    private final Map<Integer, Integer> phases;
    private final LootTable lootTable;

    public Enemy(String name, int health, int damage, int defense, int speed, String element, List<Ability> abilities, Map<Integer,Integer> phases,
                 LootTable lootTable, String aiBehavior) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.defense = defense;
        this.speed = speed;
        this.element = element;
        this.abilities = abilities;
        this.phases = phases;
        this.lootTable = lootTable;
        this.aiBehavior = aiBehavior;
    }

    public String getName() { 
        return name; 
    }
    public List<Ability> getAbilities() { 
        return abilities; 
    }
    @Override
    public Enemy clone() {
        List<Ability> clonedAbilities = new ArrayList<>();
        for (Ability a : abilities) clonedAbilities.add(a.clone());
        Map<Integer,Integer> clonedPhases = new HashMap<>(phases);
        LootTable clonedLoot = lootTable.clone();
        return new Enemy(name, health, damage, defense, speed, element, clonedAbilities, clonedPhases, clonedLoot, aiBehavior);
    }
}
