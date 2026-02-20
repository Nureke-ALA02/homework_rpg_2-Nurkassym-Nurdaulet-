package com.narxoz.rpg.prototype;

import com.narxoz.rpg.enemy.Enemy;
import java.util.HashMap;
import java.util.Map;

public class EnemyRegistry {
    private Map<String, Enemy> registry = new HashMap<>();
    public void registerTemplate(String key, Enemy enemy) {
        registry.put(key, enemy);
    }
    public Enemy createFromTemplate(String key) {
        Enemy enemy = registry.get(key);
        if (enemy != null) {
            return enemy.clone();
        }
        return null;
    }
}
