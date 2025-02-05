package Classes;

public class Mage extends Player {
    public Mage(String name, int strength, int dexterity, int intelligence, int endurance) {
        super(name, strength, dexterity, intelligence+3, endurance);
    }



}
