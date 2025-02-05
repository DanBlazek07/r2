package Classes;

public class Fighter extends Player {
    public Fighter(String name, int strength, int dexterity, int intelligence, int endurance) {
        super(name, strength+3, dexterity, intelligence, endurance);
    }
}
