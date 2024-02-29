package day06_practices;

public class OxygenTank {
    public static void main(String[] args) {

        int oxygen = 77;

        String oxygenLevel = " ";

        if (oxygen >= 90 && oxygen <= 100){
            oxygenLevel = "Your tank is full";
        }
        if (oxygen >= 80 && oxygen <= 89){
            oxygenLevel = "Still okay";
        }
        if (oxygen >= 70 && oxygen <= 79){
            oxygenLevel = "Don't go too far";
        }
        if (oxygen >= 60 && oxygen <=69){
            oxygenLevel = "Start to head back";
        }
        if (oxygen <= 59){
            oxygenLevel = "Boy if you don't head back right now...";
        }

        System.out.println(oxygenLevel);


    }
}
/*
Create a class named OxygenTank. You are diving in the ocean.
Your oxygen tank has a certain level (number) and you must print
    a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at 50%

                USE ONE PRINT STATEMENT ONLY
 */
