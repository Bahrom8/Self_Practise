package day30_practices.planetTask;

public class TestPlanet {
    public static void main(String[] args) {
        Earth earth = new Earth(5.972, 3958.8, 9.807, 196.9, 2.598,7.888);
        System.out.println(earth);

        Moon moon = new Moon(7.3477, 1079.6, 1.62, 14.6, 21.9, 0);
        System.out.println(moon);

        Mercury mercury = new Mercury(3.285, 1516, 3.7, 28.88, 14.6, 0);
        System.out.println(mercury);

        Venus venus = new Venus(4.867, 3760.4, 8.87, 177.7, 223, 0);
        System.out.println(venus);

    }
}

// gravity 8.87 m/s square
// radius 3760.4 mi
// area 177.7 million square mi
// volume 223 billion cubic mi
// mass 4.867 * 10^24 kg
