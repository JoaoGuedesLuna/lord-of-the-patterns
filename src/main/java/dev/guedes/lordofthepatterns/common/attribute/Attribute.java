package dev.guedes.lordofthepatterns.common.attribute;

import dev.guedes.lordofthepatterns.common.attribute.enums.AttributeCategory;
import dev.guedes.lordofthepatterns.common.stats.Stats;

/**
 * @author João Guedes
 */
public class Attribute {
    private String name;
    private String description;
    private AttributeCategory category;
    private Stats statsBonus;
    private int requiredLevel;
    private int pointCost;
    private boolean unlocked;

    public Attribute() {
        this.requiredLevel = 1;
        this.pointCost = 1;
        this.statsBonus = new Stats();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public AttributeCategory getCategory() { return category; }
    public void setCategory(AttributeCategory category) { this.category = category; }

    public int getRequiredLevel() { return requiredLevel; }
    public void setRequiredLevel(int requiredLevel) { this.requiredLevel = requiredLevel; }

    public int getPointCost() { return pointCost; }
    public void setPointCost(int pointCost) { this.pointCost = pointCost; }

    public Stats getStatsBonus() { return statsBonus; }
    public void setStatsBonus(Stats statsBonus) { this.statsBonus = statsBonus; }

    public boolean isUnlocked() { return unlocked; }
    public void setUnlocked(boolean unlocked) { this.unlocked = unlocked; }

    public int getHpBonus() { return statsBonus.getHp(); }
    public int getMpBonus() { return statsBonus.getMp(); }
    public int getStrengthBonus() { return statsBonus.getStrength(); }
    public int getDexterityBonus() { return statsBonus.getDexterity(); }
    public int getDefenseBonus() { return statsBonus.getDefense(); }
}
