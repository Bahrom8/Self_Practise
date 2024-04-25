package day30_practices.planetTask;

public class Moon extends Planet{

    public Moon( double mass, double radius, double surfaceGravity, double surfaceArea, double volume, double population) {
        super("Moon", mass, radius, surfaceGravity, surfaceArea, volume, population);
    }

    @Override
    public String toString() {
        return "\n\tPlanet" +
                " name: " + getName() +
                "\nmass: " + getMass() + " * 10^22 kg" +
                "\nradius: " + getRadius() + " mi" +
                "\nsurface Gravity: " + getSurfaceGravity() + " meters per second squared (m/s2)" +
                "\nsurface Area: " + getSurfaceArea() + " million square mi" +
                "\nvolume: " + getVolume() + " billion cubic kilometers" +
                "\npopulation: " + getPopulation();
    }

}

// gravity 1.62 m/s square
// radius 1079.6 mi
// area 14.6 million square mi
// volume 21.9 billion cubic km
// mass 7.3477 * 10^22 kg



