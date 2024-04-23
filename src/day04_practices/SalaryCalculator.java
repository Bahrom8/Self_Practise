package day04_practices;

public class SalaryCalculator {
    public static void main(String[] args) {

        int hourlyRate = 50;
        int weeklyHours = 45;

        int grossSalary = hourlyRate * weeklyHours * 52;
        float stateTax = 0.06f * grossSalary;
        float federalTax = 0.26f * grossSalary;

        float totalTax = (stateTax) + (federalTax);
        float netSalary = grossSalary - totalTax;

        String formattedFederalTax = String.format("%.0f", federalTax);
        String formattedStateTax = String.format("%.0f", stateTax);
        String formattedTotalTax = String.format("%.0f", totalTax);
        String formattedNetSalary = String.format("%.0f", netSalary);




        System.out.println("Gross pay is: $" + grossSalary);
        System.out.println("Federal tax is: $" + formattedFederalTax );
        System.out.println("State tax is: $" + formattedStateTax);
        System.out.println("Total tax is: $" + formattedTotalTax);
        System.out.println("Net income is: $" + formattedNetSalary);


/*
        double hourlyRate = 55,
                weeklyHours = 45,
                stateTaxRate = 7.5,
                federalTaxRate = 24.5;

        double salaryBeforeTax = hourlyRate * weeklyHours * 52 ;

        double stateTax = salaryBeforeTax * stateTaxRate / 100 ;

        double federalTax = salaryBeforeTax * federalTaxRate / 100;

        double totalTax = stateTax + federalTax;

        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("\tFederal tax is: $" + federalTax);
        System.out.println("\tState tax is: $" + stateTax);
        System.out.println("\tTotal tax is: $" + totalTax);
        System.out.println("\tNet income is: $" + salaryAfterTax);

 */



    }
}

/*
7. Create a class named SalaryCalculator, and declare the following variables:
                hourlyRate
                weeklyHours
                stateTaxRate
                federalTaxRate

    7.1 Use the given info above to calculate the following:
                salaryBeforeTax
                stateTax
                federalTax
                totalTax
                salaryAfterTax

    7.2 Display each of the above in the following format:
        Ex:
              hourlyRate = $50
              weeklyHours = 45
              stateTax = 6  (given as percentage)
              federalTax = 26 (given as percentage)

        output:
               Gross pay is: $117000
                    Federal tax is: $30420
                    State tax is: $7020
                    Total tax is: $37440
                     Net income is: $79560


 */
