package day08_practices;

public class Loans {
    public static void main(String[] args) {

        int salary = 60_000;
        int creditScore = 650;
        String isApprovedForLoan = (salary >= 60_000 && creditScore >= 650) ? "Loan Approved" : "Loan Denied";
        System.out.println(isApprovedForLoan);
    }

}
