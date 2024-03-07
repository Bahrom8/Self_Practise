package day13_practices;

public class combineWords {

    public static void main(String[] args) {

        String str3 = combine("one", "eight");

    }

    public static String combine(String str1, String str2) {

        String result = "";

        if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            result = str1 + str2.substring(1);
        } else {
            result = str1 + str2;
        }

        System.out.println(result);

        return result;
    }

}
/*
Create a method named combine that can take two string and hen add them together and returns it.
        But if the last letter of the first word and the first letter of the last letter are the same, return that character once.
    Ex:
        combine("one", "eight")  ==> oneight
 */
