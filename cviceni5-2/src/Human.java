public class Human implements Race{

    @Override
    public double bonusStr() {
        return 1.03;
    }

    @Override
    public double bonusInt() {
        return 1.03;
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
