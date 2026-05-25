package dev.guedes.lordofthepatterns.common.stats;

/**
 * @author João Guedes
 */
public class Stats {
    private int hp;
    private int mp;
    private int strength;
    private int dexterity;
    private int defense;

    public int getHp() { return hp; }
    public void setHp(int hp) { this.hp = hp; }

    public int getMp() { return mp; }
    public void setMp(int mp) { this.mp = mp; }

    public int getStrength() { return strength; }
    public void setStrength(int strength) { this.strength = strength; }

    public int getDexterity() { return dexterity;}
    public void setDexterity(int dexterity) { this.dexterity = dexterity; }

    public int getDefense() { return defense; }
    public void setDefense(int defense) { this.defense = defense; }
}
