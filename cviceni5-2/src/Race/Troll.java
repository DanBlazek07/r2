package Race;

public class Troll implements Race {
    @Override
    public double bonusStr() {
        return 1.1;
    }

    @Override
    public double bonusInt() {
        return 1;
    }

    @Override
    public double bonusDex() {
        return 1;
    }

    @Override
    public double bonusEnd() {
        return 1;
    }
}
