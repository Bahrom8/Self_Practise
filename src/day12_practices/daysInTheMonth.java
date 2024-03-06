package day12_practices;

public class daysInTheMonth {
    public static void main(String[] args) {

        monthDays(16);
    }
    public static String monthDays(int month){

        String result = "";

        switch (month){
            case 1:
                result = "January has 31 days";
                break;
            case 3:
                result = "March has 31 days";
                break;
            case 5:
                result = "May has 31 days";
                break;
            case 7:
                result = "July has 31 days";
                break;
            case 8:
                result = "August has 31 days";
                break;
            case 10:
                result = "October has 31 days";
                break;
            case 12:
                result = "December has 31 days";
                break;
            case 2:
                result = "February has 28 days";
                break;
            case 4:
                result = "April has 30 days";
                break;
            case 6:
                result = "June has 30 days";
                break;
            case 9:
                result = "September has 30 days";
                break;
            case 11:
                result = "November has 30 days";
                break;
            default:
                result = "Invalid Month";
        }
        System.out.println(result);
        return result;
    }
}
/*
Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days
 */
