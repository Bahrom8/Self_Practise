package day18_practices;

public class Offer {

    public String location, companyName, jobTitle;
    public int salary;
    public boolean hasBenefit, hasPTO, isWFH, isFullTime;

    public void setInfo(String location, String companyName, String jobTitle, int salary, boolean hasBenefit, boolean hasPTO, boolean isWFH, boolean isFullTime) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Offer" +
                " \n\t Location = " + location +
                " \n\t Company name = " + companyName +
                " \n\t Job title = " + jobTitle +
                " \n\t Salary = $" + salary +
                " \n\t Has Benefits = " + hasBenefit +
                " \n\t Has paid time off = " + hasPTO +
                " \n\t Is work from home = " + isWFH +
                " \n\t Is Full Time = " + isFullTime;
    }


}
/*
Create a custom class named Offer
        Attributes:
                location
                companyName
                jobTitle
                salary
                hasBenefit
                hasPTO
                isWFH
                isFullTime

        Actions:
            setInfo(): sets all the instance variables
            toString(): returns the full info of the Offer Object

 */
