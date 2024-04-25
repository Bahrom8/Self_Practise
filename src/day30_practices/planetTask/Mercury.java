package day30_practices.planetTask;

public class Mercury extends Planet{

    public Mercury( double mass, double radius, double surfaceGravity, double surfaceArea, double volume, double population) {
        super("Mercury", mass, radius, surfaceGravity, surfaceArea, volume, population);
    }

    @Override
    public String toString() {
        return "\n\tPlanet" +
                " name: " + getName() +
                "\nmass: " + getMass() + " * 10^23 kg" +
                "\nradius: " + getRadius() + " mi" +
                "\nsurface Gravity: " + getSurfaceGravity() + " meters per second squared (m/s2)" +
                "\nsurface Area: " + getSurfaceArea() + " million square mi" +
                "\nvolume: " + getVolume() + " billion cubic mi" +
                "\npopulation: " + getPopulation();
    }

}
// gravity 3.7 m/s square
// radius 1516 mi
// area 28.88 million square mi
// volume 14.6 billion cubic mi
// mass 3.285 * 10^23 kg
