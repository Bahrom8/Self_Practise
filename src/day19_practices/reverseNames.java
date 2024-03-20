package day19_practices;

public class reverseNames {
    public static void main(String[] args) {

        String[] classmates = new String[10];

        classmates[0] = "Madina Tadzhibaeva";
        classmates[1] = "Michelle-Inanir Sobrino";
        classmates[2] = "Rustam Royeen";
        classmates[3] = "Bizhan Qaderi";
        classmates[4] = "Assiya Tuleshova";
        classmates[5] = "Zhibek Orozbekova";
        classmates[6] = "Nazgul Sydykova";
        classmates[7] = "Farah Qaderi";
        classmates[8] = "Emanuel Ifraimov";
        classmates[9] = "Moldir Saidykarim";

        for (int i = 0; i < classmates.length; i++) {
            String backwards = classmates[i];
            String reverse = "";

            for (int j = backwards.length() - 1; j >= 0; j--) {
                reverse += backwards.charAt(j);
            }

            System.out.println(reverse);

        }

    }
}

/*
 create a string array, and store the names of your classmates (10)
            reverse each student's names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyP
        			#c
 */


