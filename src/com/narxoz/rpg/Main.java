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

        EnemyComponentFactory iceFactory = new IceComponentFactory();
        EnemyBuilder goblinBuilder = new GoblinBuilder();
        Enemy goblin = director.createEarthGoblin(goblinBuilder, iceFactory);

        goblin.displayInfo();
        System.out.println();
        fireDragon.displayInfo();
    }
}
