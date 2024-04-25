package day30_practices.planetTask;

public class Venus extends Planet {

    public Venus(double mass, double radius, double surfaceGravity, double surfaceArea, double volume, double population) {
        super("Venus", mass, radius, surfaceGravity, surfaceArea, volume, population);
    }

    @Override
    public String toString() {
        return "\n\tPlanet" +
                " name: " + getName() +
                "\nmass: " + getMass() + " * 10^24 kg" +
                "\nradius: " + getRadius() + " mi" +
                "\nsurface Gravity: " + getSurfaceGravity() + " meters per second squared (m/s2)" +
                "\nsurface Area: " + getSurfaceArea() + " million square mi" +
                "\nvolume: " + getVolume() + " billion cubic mi" +
                "\npopulation: " + getPopulation();
    }

}

// gravity 8.87 m/s square
// radius 3760.4 mi
// area 177.7 million square mi
// volume 223 billion cubic mi
// mass 4.867 * 10^24 kg
