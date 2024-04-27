package day31_practices.statesTask;

public class California extends States {

    private String Location, weather, popularCities;

    public California(String capital, String abbreviation, String politicalParty,
                      String governor, String senator, double population,
                      double stateTax, String location, String weather, String popularCities) {
        super("California", capital, abbreviation, politicalParty, governor, senator, population, stateTax);
        setLocation(location);
        setWeather(weather);
        setPopularCities(popularCities);
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getPopularCities() {
        return popularCities;
    }

    public void setPopularCities(String popularCities) {
        this.popularCities = popularCities;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nLocation: " + getLocation() +
                "\nWeather: " + getWeather() +
                "\nPopular Cities: " + getPopularCities() ;
    }
}
