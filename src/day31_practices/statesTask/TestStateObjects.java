package day31_practices.statesTask;

public class TestStateObjects {

    public static void main(String[] args) {

        Virginia virginia = new Virginia("Richmond", "VA", "Republican",
                "Glenn Youngkin", "Mark Warner and Tim Kaine", 8.6,
                5.3, "East Coast", "Mother of states");
        System.out.println(virginia);



        California california = new California("Sacramento", "CA","Democrat",
                "Gavin Newsom", "Alex Padilla and Laphonza Butler", 39.24, 13.3,
                "West Coast", "Always perfect", "Los Angeles, San Francisco, Sacramento, Hollywood, Beverly Hills, Malibu");
        System.out.println(california);



        Texas texas = new Texas("Austin", "TX", "Republican",
                "Greg Abbott", "John Cornyn and Ted Cruz", 29.53,
                6.25, "Central Time Zone");
        System.out.println(texas);



        Florida florida = new Florida("Tallahassee", "FL", "Democratic",
                "Ron DeSantis", "Marco Rubio and Rick Scott", 21.78,
                6, "Alligator");
        System.out.println(florida);


    }

}
