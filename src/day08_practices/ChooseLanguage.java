package day08_practices;

public class ChooseLanguage {
    public static void main(String[] args) {
        int Language = 5;
        String chooseLanguage = (Language == 1)? "Hello, Thank you for yor call"
                :(Language == 2)? "Hola, gracias para llamar"
                :(Language == 3)? "Merhaba, aradiginiz icin tesekkurler"
                :(Language == 4)? "Privet, spasibo za vash zvonok"
                :(Language == 5)? "Merci ,pour votre appel": "Invalid Number";
        System.out.println(chooseLanguage);

    }
}
/*
Create a class called ChooseLanguage,
 		Given an integer variable named selection that has a number between 1~5.
 		Write a program that can select the language based on the number
 		that's given in the selection and print the following message:

			for 1: Hello, thank you for your call
			for 2: Hola, gracias para llamar
			for 3: Merhaba, aradiginiz icin tesekkurler
			for 4: Privet, spasibo za vash zvonok
			for 5: Merci ,pour votre appel

			for any other numbers print "Invalid Number"

		Solution 1: Must use ternary
		Solution 2: MUST use the switch statement
 */
