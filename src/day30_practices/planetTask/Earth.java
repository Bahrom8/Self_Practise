package day30_practices.planetTask;

public class Earth extends Planet{

    public Earth( double mass, double radius, double surfaceGravity, double surfaceArea, double volume, double population) {
        super("Earth", mass, radius, surfaceGravity, surfaceArea, volume, population);
    }

    @Override
    public String toString() {
        return
                "\n\tPlanet" +
                " name: " + getName() +
                "\nmass: " + getMass() + " * 10^24 kg" +
                "\nradius: " + getRadius() + " mi" +
                "\nsurface Gravity: " + getSurfaceGravity() + " meters per second squared (m/s2)" +
                "\nsurface Area: " + getSurfaceArea() + " million mi square" +
                "\nvolume: " + getVolume() + " trillion cubic kilometers" +
                "\npopulation is over " + getPopulation() + " billion";
    }
}
