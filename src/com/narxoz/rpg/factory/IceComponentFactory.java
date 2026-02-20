package com.narxoz.rpg.factory;

import com.narxoz.rpg.combat.*;
import com.narxoz.rpg.loot.*;

import java.util.ArrayList;
import java.util.List;

public class IceComponentFactory implements EnemyComponentFactory {

    @Override
    public List<Ability> createAbilities() {
        List<Ability> list = new ArrayList<>();
        list.add(new FrostBreath());
        return list;
    }
    @Override
    public String createAI() {
        return "Defensive Ice AI";
    }

    @Override
    public LootTable createLootTable() {
        return new IceLootTable();
    }
}
