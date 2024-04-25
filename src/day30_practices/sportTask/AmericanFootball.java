package day30_practices.sportTask;

public class AmericanFootball extends Sport {

    private String ballSize;
    private String cupName;

    public AmericanFootball(String rules, int numberOfPlayers, int numberOfReferees, String ballSize, String cupName) {
        super("American Football", rules, numberOfPlayers, numberOfReferees);
        setBallSize(ballSize);
        setCupName(cupName);
    }

    public String getBallSize() {
        return ballSize;
    }

    public void setBallSize(String ballSize) {
        this.ballSize = ballSize;
    }

    public String getCupName() {
        return cupName;
    }

    public void setCupName(String cupName) {
        this.cupName = cupName;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nBall size: " + getBallSize() +
                "\nCup name: " + getCupName();
    }
}
