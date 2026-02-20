package com.narxoz.rpg;

import com.narxoz.rpg.builder.*;
import com.narxoz.rpg.enemy.*;
import com.narxoz.rpg.factory.*;
import com.narxoz.rpg.prototype.EnemyRegistry;

public class Main {
    public static void main(String[] args) {
        EnemyComponentFactory fireFactory = new FireComponentFactory();
        EnemyDirector director = new EnemyDirector();
        EnemyBuilder builder = new DragonBossBuilder();
        Enemy fireDragon = director.createFireDragon(builder, fireFactory);

        Goblin goblin = new Goblin("Forest Goblin");
        EnemyRegistry registry = new EnemyRegistry();
        registry.registerTemplate("fireDragon", fireDragon);

        Enemy clonedDragon = registry.createFromTemplate("fireDragon");
        goblin.displayInfo();
        System.out.println();
        fireDragon.displayInfo();
        System.out.println();
        clonedDragon.displayInfo();
    }
}
