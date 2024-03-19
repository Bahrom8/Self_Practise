package day17_practices;

public class SalaryCalculator {

    public double hourlyRate,
            stateTaxRate,
            federalTaxRate,
            weeklyHours;

    public void setSalaryInfo(double hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double calculateSalary(){
        double salary = hourlyRate*weeklyHours*52;
        return salary;
    }

    public double calculateStateTax(){
        double stateTax = calculateSalary()*stateTaxRate;
        return stateTax;
    }

    public double calculateFederalTax(){
        double federalTax = calculateSalary()*federalTaxRate;
        return federalTax;
    }

    public double calculateSalaryAfterTax(){
        double salaryAfterTax = calculateSalary()-calculateStateTax()-calculateFederalTax();
        return salaryAfterTax;
    }

    public String toString() {
        return "Salary Calculator " +
                "hourlyRate = " + hourlyRate +
                ", stateTaxRate = " + stateTaxRate +
                ", federalTaxRate = " + federalTaxRate +
                ", weeklyHours = " + weeklyHours +
                ", salary = $" + calculateSalary() +
                ", stateTax = $" + calculateStateTax() +
                ", federalTax = $" + calculateFederalTax() +
                ", salaryAfterTax = $" + calculateSalaryAfterTax();
    }
}

/*
Create a custom class named SalaryCalculator
        Attributes:
            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

            (stateTaxRate and federalTaxRate will be given as percentage,
            you will be responsible for converting them to decimals)

        Actions:
            setInfo(): sets all the fields of SalaryCalculator object
            salary(): calculates the salary ( hourlyRate * weeklyHour * 52) and returns it as double
            stateTax(): calculates the total state tax, and returns it as double
            federalTax(): calculates the total federal tax, and returns it as double
            salaryAfterTax(): calculates the salary after tax, and returns it as double
            toString(): when a SalaryCalculator object is passed in a print statement,
            	it should display the salary, stateTax, federalTax, salaryAfterTax of the Object

 */