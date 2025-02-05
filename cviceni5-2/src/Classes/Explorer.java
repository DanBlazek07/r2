package Classes;

public class Explorer extends Player {
    public Explorer(String name, int strength, int dexterity, int intelligence, int endurance) {
        super(name, strength, dexterity+3, intelligence, endurance);
    }
}
