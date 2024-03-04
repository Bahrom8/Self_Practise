package day09_practices;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your hourly rate");
        double rate = input.nextDouble();
        System.out.println("Enter how many hours you work in a week?");
        double hours = input.nextDouble();
        System.out.println("Enter state tax");
        double stateTax = input.nextDouble();
        System.out.println("Enter federal Tax");
        double federalTax = input.nextDouble();

        double salary = rate * hours*52;
        double totalTax = (federalTax) + (stateTax);
        double netIncome = salary - (totalTax);


        System.out.println(salary);
        System.out.println(totalTax);
        System.out.println(netIncome);




    }
}
/*
Create a class named SalaryCalculator:
		- Ask the user to enter his/her hourly rate
		- Ask the user how many hours he/she works in a week
		- Ask the user to enter state tax (in percentage)
		- Ask the user to enter federal tax (in percentage)

         -Calculate the:
                   salary
                   State tax
                   federalTax
                   Total tax
                   Net income
 */
