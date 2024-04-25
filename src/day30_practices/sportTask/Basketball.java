package day30_practices.sportTask;

public class Basketball extends Sport {

    private String whereToPlay;
    private String ballSize;

    public Basketball(String rules, int numberOfPlayers, int numberOfReferees, String whereToPlay, String ballSize) {
        super("Basketball", rules, numberOfPlayers, numberOfReferees);
        setWhereToPlay(whereToPlay);
        setBallSize(ballSize);
    }


    public String getWhereToPlay() {
        return whereToPlay;
    }

    public void setWhereToPlay(String whereToPlay) {
        this.whereToPlay = whereToPlay;
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
                "\nWhere to play: " + getWhereToPlay() +
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
