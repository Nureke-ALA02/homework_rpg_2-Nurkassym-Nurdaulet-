package com.narxoz.rpg.builder;
import com.narxoz.rpg.factory.EnemyComponentFactory;
import com.narxoz.rpg.enemy.Enemy;

public class EnemyDirector {
    public Enemy createFireDragon(EnemyBuilder builder, EnemyComponentFactory factory) {
        return builder
                .setName("Ancient Fire Dragon")
                .setHealth(50000)
                .setDamage(300)
                .setElement("FIRE")
                .setAbilities(factory.createAbilities())
                .setLootTable(factory.createLootTable())
                .setAI(factory.createAI())
                .build();
    }
    public Enemy createEarthGoblin(EnemyBuilder builder, EnemyComponentFactory factory) {
        return builder
                .setName("Forest Goblin")
                .setHealth(200)
                .setDamage(25)
                .setElement("Fire")
                .setAI(factory.createAI())
                .setAbilities(factory.createAbilities())
                .setLootTable(factory.createLootTable())
                .build();
    }

}
