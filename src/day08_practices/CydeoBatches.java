package day08_practices;

public class CydeoBatches {
    public static void main(String[] args) {

        String batch = "EU";

        String classTimes = "Class times are ";

        if (batch == "US morning"){
            classTimes = classTimes + "10-5 EST. M, T, Th, F";
        } else if (batch == "US evening") {
            classTimes = classTimes + "7-10 EST. M, T, W, Th, S, S";
        } else if (batch == "EU") {
            classTimes = classTimes + "10-5 EST. M, T, W, Th, F";
        } else {
            classTimes = "Invalid batch";
        }

        System.out.println(classTimes);

    }
}
/*
Create a class named CydeoBatches. In Cydeo, we have three batch types:
US morning, US evening, and EU. Depending on a batch type (String)
print information about the batch.

   If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
   If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
   If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
   If the batch type is invalid, print "Invalid Batch"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use the switch statement
				Solution 2: use if & switch statements mixed

 */
