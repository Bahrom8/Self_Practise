package day31_practices.statesTask;

public class States {

    private String name, Capital,  abbreviation, politicalParty, Governor, senator;
    private double population, stateTax;

    public States(String name, String capital, String abbreviation, String politicalParty, String governor,
                  String senator, double population, double stateTax) {
        setName(name);
        setCapital(capital);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isEmpty() || name == null){
            System.err.println("Name cannot be empty or blank");
            System.exit(1);
        }
        this.name = name;
    }

    public String getCapital() {
        return Capital;
    }

    public void setCapital(String capital) {
        if (capital.isEmpty() || capital.isEmpty() || capital == null){
            System.err.println("capital city cannot be empty or blank");
            System.exit(1);
        }
        this.Capital = capital;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation.isEmpty() || abbreviation.isEmpty() || abbreviation == null){
            System.err.println("Abbreviation cannot be empty or blank");
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty.isEmpty() || politicalParty.isEmpty() || politicalParty == null){
            System.err.println("Political Party cannot be empty or blank");
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return Governor;
    }

    public void setGovernor(String governor) {
        if (governor.isEmpty() || governor.isEmpty() || governor == null){
            System.err.println("Governor cannot be empty or blank");
            System.exit(1);
        }
        Governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if (senator.isEmpty() || senator.isEmpty() || senator == null){
            System.err.println("Senator cannot be empty or blank");
            System.exit(1);
        }
        this.senator = senator;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        if(population <= 0){
            System.err.println("Population cannot be zero or negative");
            System.exit(1);
        }
        this.population = population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        if(stateTax <= 0){
            System.err.println("State tax cannot be zero or negative");
            System.exit(1);
        }
        this.stateTax = stateTax;
    }

    public String toString() {
        return "\n\tState" +
                " Name: " + getClass().getSimpleName() +
                "\nAbbreviation: " + abbreviation +
                "\nPolitical Party: " + politicalParty +
                "\nGovernor: " + Governor +
                "\nSenators: " + senator +
                "\nPopulation is over: " + population + " million" +
                "\nStateTax: " + stateTax + "%" ;
    }
}
/*
1. Create a class named States:
            variables:
                name, abbreviation, politicalParty, Governor, senator, population, stateTax

            Encapsulate all the fields

            Add a constructor that can set all the fields

                        Conditions:
                            1. name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank
                            2. name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank
                            3. taxRate can not be negative
                            4. Population can not be zero or negative

            Methods:
                toString()

    2. Create the following subclasses of States and add any additional fields and methods if necessary:
                1. Virginia
                2. California
                3. Texas
                4. Florida


    3. Create a class named StateObjects
                    Create the objects of each sub-class

                    test all the functions of each object

                    Analyze the relationships between the classes
 */
