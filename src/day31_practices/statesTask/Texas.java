package day31_practices.statesTask;

public class Texas extends States {

    private String TimeZone;

    public Texas( String capital, String abbreviation, String politicalParty, String governor,
                 String senator, double population, double stateTax, String timeZone) {
        super("Texas", capital, abbreviation, politicalParty, governor, senator, population, stateTax);
        TimeZone = timeZone;
    }

    public String getTimeZone() {
        return TimeZone;
    }

    public void setTimeZone(String timeZone) {
        TimeZone = timeZone;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTime Zone: " + getTimeZone();
    }
}
