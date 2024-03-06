package day12_practices;

public class dayName {
    public static void main(String[] args) {

        dayName(4);
    }

    public static String dayName (int day){

        String d = "";
        if ( day == 1 ){
            d = "Monday";
        }else if (day == 2) {
            d = "Tuesday";
        }else if (day == 3) {
            d = "Wednesday";
        }else if (day == 4) {
            d = "Thursday";
        }else if (day == 5) {
            d = "Friday";
        }else if (day == 6) {
            d = "Saturday";
        }else if (day == 7) {
            d = "Sunday";
        }else{
            d = "Invalid Number";
        }
        System.out.println(d);

        return d;
    }
}
/*
Create a method named day that can display the name of the day based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        day(5)

        output:
            Friday
 */
