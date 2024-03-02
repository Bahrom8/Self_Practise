package day08_practices;

public class Browser {
    public static void main(String[] args) {
        String browserName = "firefox";
        String browser = "";

        switch (browserName) {
            case "chrome":
                browser = "chrome is selected";
                break;
            case "firefox":
                browser = "firefox is selected";
                break;
            case "edge":
                browser = "edge is selected";
                break;
            case "opera":
                browser = "opera is selected";
                break;
            case "safari":
                browser = "safari is selected";
                break;
            default: browser = "Invalid";

        }

        System.out.println(browser);


    }
}
/*
 write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, the output should be: Invalid Browser

        	Do Not use if statement or ternary
 */
