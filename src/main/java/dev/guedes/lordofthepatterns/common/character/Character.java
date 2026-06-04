package dev.guedes.lordofthepatterns.common.character;

import dev.guedes.lordofthepatterns.common.character.enums.Race;
import dev.guedes.lordofthepatterns.common.stats.Stats;

/**
 * @author João Guedes
 */
public class Character {
    private String name;
    private Race race;
    private final Stats baseStats;
    private final Stats currentStats;

    public Character(String name, Race race) {
        this.baseStats = new Stats();
        this.currentStats = new Stats();
    }

    public Character() {
        this.baseStats = new Stats();
        this.currentStats = new Stats();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Race getRace() { return race; }
    public void setRace(Race race) { this.race = race; }

    public int getHp() { return currentStats.getHp(); }
    public int getMp() { return currentStats.getMp(); }
    public int getStrength() { return currentStats.getStrength(); }
    public int getDexterity() { return currentStats.getDexterity(); }
    public int getDefense() { return currentStats.getDefense(); }

    protected Stats getBaseStats() { return baseStats; }
    protected Stats getCurrentStats() { return currentStats; }
}
