package day31_practices.statesTask;

public class Florida extends States {

    private String popularAnimal;

    public Florida(String capital, String abbreviation, String politicalParty, String governor,
                   String senator, double population, double stateTax, String popularAnimal) {
        super("Florida", capital, abbreviation, politicalParty, governor, senator, population, stateTax);
        this.popularAnimal = popularAnimal;
    }

    public String getPopularAnimal() {
        return popularAnimal;
    }

    public void setPopularAnimal(String popularAnimal) {
        this.popularAnimal = popularAnimal;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPopular wild animal: " + getPopularAnimal();
    }
}
