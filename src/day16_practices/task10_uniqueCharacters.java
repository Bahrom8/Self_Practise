package day16_practices;

public class task10_uniqueCharacters {
    public static void main(String[] args) {

        String str = "aabccdeef";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if(str.indexOf(each) == str.lastIndexOf(each)){
                unique += each;
            }
        }
        System.out.println(unique);


    }
}
/*
 Write a program that can find the unique characters from a string without using index()
 and lastIndexOf() methods

                        Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character,
            then you can repeat it for the remaining characters to find the frequency.
                        if frequency of a character == 1  =========> unique

 */
