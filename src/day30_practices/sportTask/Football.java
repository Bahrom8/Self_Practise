package day30_practices.sportTask;

public class Football extends Sport{

    private String ballSize;
    private String uniformType;

    public Football(String rules, int numberOfPlayers, int numberOfReferees, String ballSize, String uniformType) {
        super("Football", rules, numberOfPlayers, numberOfReferees);
        setBallSize(ballSize);
        setUniformType(uniformType);
    }

    public String getBallSize() {
        return ballSize;
    }

    public void setBallSize(String ballSize) {
        this.ballSize = ballSize;
    }

    public String getUniformType() {
        return uniformType;
    }

    public void setUniformType(String uniformType) {
        this.uniformType = uniformType;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nBall size: " + getBallSize() +
                "\nUniform type: " + getUniformType();
    }
}
