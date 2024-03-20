package day20_practices;

public class reverseSecondWord {
    public static void main(String[] args) {

        String str = "I love Java";
        String[] strSplit = str.split(" ");

        char[] ch = strSplit[1].toCharArray();

        for (int i = 0; i < strSplit.length; i++) {

            if(i==0){
                System.out.print(strSplit[i] + " ");
            }else if(i==1){
                for (int j = ch.length - 1; j >= 0; j--) {
                    System.out.print(ch[j]); continue;
                }
            }else{
                System.out.print(" " +strSplit[i] + " ");
            }
        }
    }
}
/*
    Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
 */
