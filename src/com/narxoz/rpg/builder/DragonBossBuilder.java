package com.narxoz.rpg.builder;

import com.narxoz.rpg.enemy.DragonBoss;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;
import java.util.ArrayList;
import java.util.List;

public class DragonBossBuilder implements EnemyBuilder {

    private String name;
    private int health;
    private int damage;
    private String element;
    private String ai;

    private List<Ability> abilities = new ArrayList<>();
    private LootTable loot;

    @Override
    public EnemyBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public EnemyBuilder setHealth(int health) {
        this.health = health;
        return this;
    }

    @Override
    public EnemyBuilder setDamage(int damage) {
        this.damage = damage;
        return this;
    }

    @Override
    public EnemyBuilder setElement(String element) {
        this.element = element;
        return this;
    }

    @Override
    public EnemyBuilder setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
        return this;
    }

    @Override
    public EnemyBuilder setLootTable(LootTable loot) {
        this.loot = loot;
        return this;
    }

    @Override
    public EnemyBuilder setAI(String ai) {
        this.ai = ai;
        return this;
    }

    @Override
    public Enemy build() {

        if (name == null || health <= 0) {
            throw new IllegalStateException("Name and health required!");
        }

        DragonBoss boss = new DragonBoss(name, health);

        boss.setDamage(damage);
        boss.setElement(element);
        boss.setAI(ai);
        boss.setLootTable(loot);

        for (Ability ability : abilities) {
            boss.addAbility(ability);
        }

        return boss;
    }
}
