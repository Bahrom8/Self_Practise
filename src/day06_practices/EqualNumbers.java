package day06_practices;

public class EqualNumbers {
    public static void main(String[] args) {

        int n1 = 2,
                n2 = 3,
                n3 = 2;

        String isEqual = " ";

        if (n1 == n2 && n2 == n3 && n1 == n3){
            isEqual = "All numbers are equal";
        } else if (n1 == n2 && n1 != n3 && n2 != n3){
            isEqual = "N1 and N2 are equal";
        } else if (n2 == n3 && n1 != n2 && n1 != n3){
            isEqual = "N2 and N3 are equal";
        } else if (n1 == n3 && n1 != n2 && n3 != n2){
            isEqual = "N1 and N3 are equal";
        }else {
            isEqual = "No numbers are equal";
        }

        System.out.println(isEqual);
    }
}
/*
Create a class named EqualNumbers, and write a program that
    can check the equality of the three given numbers

	 			declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
	  			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	   			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	   			if only n3 and n1 are equal ==>print "n3&n1 are equal"
				if none of them are equal ==> none of them are equal
 */
