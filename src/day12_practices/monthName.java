package day12_practices;

public class monthName {
    public static void main(String[] args) {
        month_Name(1);


    }
    public static String month_Name (int monthName){

        String Month = "";

        if(monthName == 1){
            Month = "January";
        } else if(monthName == 2){
            Month = "February";
        } else if(monthName == 3){
            Month = "March";
        } else if(monthName == 4){
            Month = "April";
        } else if(monthName == 5){
            Month = "May";
        } else if(monthName == 6){
            Month = "June";
        } else if(monthName == 7){
            Month = "July";
        } else if(monthName == 8){
            Month = "August";
        } else if(monthName == 9){
            Month = "September";
        } else if(monthName == 10){
            Month = "October";
        } else if(monthName == 11){
            Month = "November";
        } else if(monthName == 12){
            Month = "December";
        }else{
            Month = "Invalid Number";
        }
        System.out.println(Month);

        return Month;
    }
}
/*
Create a method named monthName that can display the name of
the month based on the given number to the method, if the number is invalid,
then the method should print the error message "Invalid Number"
    Ex:
        monthName(6)

        output:
            June
 */
