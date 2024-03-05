package day11_practices;

import java.util.Scanner;

public class websiteAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a website:");

        String website = input.nextLine();
        String result = "";
        if(website.startsWith("www.") && (website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".gov"))){
           result = "Website is valid";
        }else{
            result = "Website is invalid";
        }

        System.out.println(result);
        input.close();
    }

}
/*
Create a class named WebsiteAddress, and write a program that can check
if the given website is a valid website or not
            starts with: www.
            ends with: .com, .edu, .gov
 */
