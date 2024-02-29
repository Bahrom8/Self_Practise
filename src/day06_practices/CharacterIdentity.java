package day06_practices;

public class CharacterIdentity {
    public static void main(String[] args) {
        char ch = '*';
        String identity = " ";

        if (ch >= 48 && ch <= 57){
            identity = "Digit";
        }else if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)){
            identity = "Alphabetical Character";
        }else{
            identity = "Special Character";
        }
        System.out.println(identity);

    }
}
/*
Create a class named CharacterIdentity,
and write a program that can identify if the given character is a digit or
Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'
		output:
			Special Character
			ch = '1'
	    output:
			digit
		HINT: You may wanna check out the numbers of the characters on ASCII table

 */
