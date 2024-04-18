package day25_practices;

public class SalaryCalculator {

    public int weeklyHours;
    public double hourlyRate, stateTaxRate, federalTaxRate;


    public SalaryCalculator(int weeklyHours, double hourlyRate, double stateTaxRate, double federalTaxRate) {
        this.weeklyHours = weeklyHours;
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate / 100;
        this.federalTaxRate = federalTaxRate / 100;
    }

    public double salary() {
        return hourlyRate * weeklyHours * 52;
    }

    public double stateTax() {
        return salary() * stateTaxRate;
    }
    public double federalTax() {
        return salary() * federalTaxRate;
    }
    public double salaryAfterTax() {
        return salary() - (stateTax() + federalTax());
    }

    public String toString() {
        return "\n\tSalary Calculator" +
                "\nweekly Hours: " + weeklyHours +
                "\nhourly Rate: $" + hourlyRate +
                "\nsalary: $" + salary() +
                "\nstateTax: $" + stateTax() +
                "\nfederalTax: $" + federalTax() +
                "\nsalaryAfterTax: $" + salaryAfterTax();
    }
}
/*
Create a custom class named SalaryCalculator:
        1.1 Create a class named SalaryCalculator:
                Attributes:
                    hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

                Add a constructor to set all the fields

            Actions:
                   salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
                  stateTax(): calculates the total state tax
                  federalTax(): calculates the total federal tax
                  salaryAfterTax(): calculates the salary after tax
                  toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */

