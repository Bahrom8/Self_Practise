package day30_practices.sportTask;

public class Sport {

    private String name, rules;
    private int numberOfPlayers, numberOfReferees;

    public Sport(String name, String rules, int numberOfPlayers, int numberOfReferees) {
        setName(name);
        setRules(rules);
        setNumberOfPlayers(numberOfPlayers);
        setNumberOfReferees(numberOfReferees);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        if(numberOfPlayers <= 0){
            System.err.println("Player number cannot be zero or negative: " + numberOfPlayers);
            System.exit(1);
        }
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumberOfReferees() {
        return numberOfReferees;
    }

    public void setNumberOfReferees(int numberOfReferees) {
        if (numberOfReferees <= 0) {
            System.err.println("Referees number cannot be zero or negative: " + numberOfReferees);
            System.exit(1);
            this.numberOfReferees = numberOfReferees;
        }
    }

    public void play(){
        System.out.println("You need two teams to play " + name + " and each team should be " + numberOfPlayers + " players");
    }

    public String toString() {
        return "\n\t" + getClass().getSimpleName() +
                "\nname: " + name +
                "\nrules: " + rules +
                "\nnumber Of Players: " + numberOfPlayers +
                "\nnumber Of Referees: " + numberOfReferees;
    }
}
/*
Create a class named Sport
			variables:
				name, numberOfPlayers, numberOfReferee, rules

			Encapsulate all the fields
					Conditions:
						1. numberOfPlayers cannot be set to zero or negative
						2. numberOfReferees cannot be set to zero or negative

			Add a constructor that can set all the fields

			methods:
				play()
				toString()
 */
