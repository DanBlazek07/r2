package Classes;

import Race.Race;

public abstract class Player {
    private String name;
    private int lvl;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int endurance;
    private int xp;
    private Race race;

    public Player(String name, int strength, int dexterity, int intelligence, int endurance) {
        this.name = name;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.endurance = endurance;
        this.xp = 0;
        this.lvl = 1;
    }

    public Player() {

    }

    public String getStats(){
        return "strength:" + getStrength() + "\ndexterity:" + getDexterity() + "\nintelligence:" + getIntelligence() + "\nendurance" + getEndurance();
    }

    private double getEndurance() {
        return endurance * race.bonusEnd();
    }

    private double getDexterity() {
        return dexterity * race.bonusDex();
    }

    private double getIntelligence() {
        return intelligence * race.bonusInt();
    }

    private double getStrength() {
        return strength * race.bonusStr();
    }



    public static Player makePlayer(String name, int strength, int dexterity, int intelligence, int endurance, int race, int decision) {
        switch (decision) {
            case 1:
                return new Fighter(name, strength, dexterity, intelligence, endurance);
            case 2:
                return new Explorer(name, strength, dexterity, intelligence, endurance);
            case 3:
                return new Mage(name, strength, dexterity, intelligence, endurance);
            default:
                return null;
        }
    }
}
