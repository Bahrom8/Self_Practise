package day19_practices;

public class GradeArrays {

    public static void main(String[] args) {

        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];

        String result = "";

        for (int i = 0; i < names.length; i++) {
            if (scores[i] >= 90) { grades[i] ='A';
            } else if (scores[i] >= 80) { grades[i]='B';
            } else if (scores[i] >= 70) { grades[i]='C';
            } else if (scores[i] >= 60) { grades[i]='D';
            }else {grades[i]='F';
            }
            for (int j = 0; j < scores.length; j++) {
                for (int k = 0; k < grades.length; k++) {

                    if(result.contains(names[i])){
                        continue;
                    }
                    if(result.contains(scores[j] + "")){
                        continue;
                    }
                    if(result.contains(grades[k] + "")){
                        continue;
                    }

                    result += (names[i] + scores[j] + grades[k]);

                    System.out.println(names[i] + " score is " + scores[j] + ", and grade is " + grades[k]);
                }
            }
        }
    }
}
/*
given the following arrays:
		     	String [] names = {"Anna", "Nancy", "Sarah"};
		        int [] scores = {90, 75, 80};
		        char [] grades = new char[names.length];

         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each student in separate lines
         		Ex:
         			Anna's score is 90, and grade is A
 */
