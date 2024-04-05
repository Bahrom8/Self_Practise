package day21_practices;

public class Array {
    public static void main(String[] args) {
        String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};
               //   10 -1
        for (String[][][][][][][][][] array9 : array) {
            for (String[][][][][][][][] array8 : array9) {
                for (String[][][][][][][] array7 : array8) {
                    for (String[][][][][][] array6 : array7) {
                        for (String[][][][][] array5 : array6) {
                            for (String[][][][] array4 : array5) {
                                for (String[][][] array3 : array4) {
                                    for (String[][] array2 : array3) {
                                        for (String[] array1 : array2) {
                                            for (String lastOne : array1) {
                                                System.out.println(lastOne);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }


    }
}

/*
Given the following array:
		 String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};

	 Write a program that can display each element of the given array
 */
