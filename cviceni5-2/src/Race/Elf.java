package Race;

public class Elf implements Race {
    @Override
    public double bonusStr() {
        return 1;
    }

    @Override
    public double bonusInt() {
        return 1.06;
    }

    @Override
    public double bonusDex() {
        return 1.04;
    }

    @Override
    public double bonusEnd() {
        return 1;
    }
}
