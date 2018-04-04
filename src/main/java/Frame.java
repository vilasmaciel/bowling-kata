public class Frame {

    private int firstRoll;
    private int secondRoll;

    public Frame(int firstRoll, int secondRoll) {
        this.firstRoll = firstRoll;
        this.secondRoll = secondRoll;
    }

    public int getScore() {
        return this.firstRoll + this.secondRoll;
    }
}
