package day16_practices;

public class task9_frequencyOfChar {

    public static void main(String[] args) {

        String str= "aabcccd";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {

                if(str.charAt(j) == ch){
                    count++;
                }
            }
            if(result.contains("" + ch)){
                continue;
            }
            result +=ch + "" + count;
        }

        System.out.println(result);
    }
}
/*
Write a program that can find the frequency of the characters from a string

                         Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character,
            then repeat it for all the remaining characters
 */
