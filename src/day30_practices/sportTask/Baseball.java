package day30_practices.sportTask;

public class Baseball extends Sport {

    private String ballSize;

    public Baseball( String rules, int numberOfPlayers, int numberOfReferees, String ballSize) {
        super("Baseball", rules, numberOfPlayers, numberOfReferees);
        setBallSize(ballSize);
    }

    public String getBallSize() {
        return ballSize;
    }

    public void setBallSize(String ballSize) {
        this.ballSize = ballSize;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nBall size: " + getBallSize();
    }
}
/*
create the following sub classes of Sport:
				1. Basketball
				2. Baseball
				3. Football
				4. AmericanFootball

			Add any missing variables or methods

			Note: you can search them on google
 */