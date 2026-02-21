package com.narxoz.rpg;

import com.narxoz.rpg.builder.*;
import com.narxoz.rpg.enemy.*;
import com.narxoz.rpg.factory.*;
import com.narxoz.rpg.prototype.EnemyRegistry;
public class Main {
    public static void main(String[] args) {
        EnemyDirector director = new EnemyDirector();
        EnemyComponentFactory fireFactory = new FireComponentFactory();
        EnemyBuilder dragonBuilder = new DragonBossBuilder();
        Enemy fireDragon = director.createFireDragon(dragonBuilder, fireFactory);

        EnemyComponentFactory earthFactory = new FireComponentFactory();
        EnemyBuilder goblinBuilder = new GoblinBuilder();
        Enemy goblin = director.createEarthGoblin(goblinBuilder, earthFactory);

        EnemyRegistry registry = new EnemyRegistry();
        registry.registerTemplate("dragon", fireDragon);
        registry.registerTemplate("goblin", goblin);

        Enemy clonedDragon = registry.createFromTemplate("dragon");
        Enemy clonedGoblin = registry.createFromTemplate("goblin");

        System.out.println("ORIGINAL DRAGON:");
        fireDragon.displayInfo();
        System.out.println("\nCLONED DRAGON:");
        clonedDragon.displayInfo();
        System.out.println("\nORIGINAL GOBLIN: ");
        goblin.displayInfo();
        System.out.println("\nCLONED GOBLIN:");
        clonedGoblin.displayInfo();
    }
}
