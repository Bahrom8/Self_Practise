package day08_practices;


public class ChooseLanguage_2 {

    public static void main(String[] args) {

        int n = 4;

        String language;

        switch (n){
            case 1:
                language = "Hello, thank you for your call";
                break;
            case 2:
                language = "Hola, gracias para llamar";
                break;
            case 3:
                language = "Merhaba, aradiginiz icin tesekkurler";
                break;
            case 4:
                language = "Privet, spasibo za vash zvonok";
                break;
            case 5:
                language = "Merci, pour votre appel";
                break;
            default:
                language = "Invalid language";
        }

        System.out.println(language);

    }

}
/*
Given an integer variable named selection that has a number between 1~5.
         Write a program that can select the language based on the number
         that's given in the selection and print the following message:

            for 1: Hello, thank you for your call
            for 2: Hola, gracias para llamar
            for 3: Merhaba, aradiginiz icin tesekkurler
            for 4: Privet, spasibo za vash zvonok
            for 5: Merci, pour votre appel

            for any other numbers print "Invalid Number"

        Solution 1: Must use ternary
        Solution 2: MUST use the switch statement
 */
