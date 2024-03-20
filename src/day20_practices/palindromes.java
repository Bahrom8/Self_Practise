package day20_practices;

public class palindromes {
    public static void main(String[] args) {

        String[] arr = {"level", "level", "java", "SOS"};

        int count = 0;

        for (String each : arr) {
            String palindrome = "";
            for (int i = each.length()-1; i >= 0 ; i--){
                palindrome += each.charAt(i);
            }
            if (each.equals(palindrome)){
                count ++;
            }
        }
        System.out.println(count);

    }
}
/*
write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */
