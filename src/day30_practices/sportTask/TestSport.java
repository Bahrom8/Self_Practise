package day30_practices.sportTask;

public class TestSport {
    public static void main(String[] args) {

        Baseball baseball = new Baseball(
                "The game lasts for 9 innings with each team alternating between batting and fielding in each",
                9, 4, "small");
        System.out.println(baseball);
        baseball.play();

        Basketball basketball = new Basketball("throw the ball to basket",
                5, 3, "Indoor", "Large");
        System.out.println(basketball);
        basketball.play();

        Football football = new Football( "score a goal",
                11, 5, "Medium", "Shorts and jersey");
        System.out.println(football);
        football.play();

        AmericanFootball americanFootball = new AmericanFootball( "so many rules",
                11, 4,"prolate spheroid", "Super Bowl");
        System.out.println(americanFootball);
        americanFootball.play();



    }
}
