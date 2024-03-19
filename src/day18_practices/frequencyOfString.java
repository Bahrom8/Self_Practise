package day18_practices;

public class frequencyOfString {

    public static void main(String[] args) {

        String str = "aaabbcccccddeeeeefffff";
        String highest = "";
        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }
            if (count > frequency) {
                frequency = count;
            }
        //this part copied from Muhtar I did not understand
        }

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                int count = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (ch == str.charAt(j)) {
                        count++;
                    }
                }

            if(frequency == count && !highest.contains(ch + "")){
                highest +=("\n" + ch);
                }


            }

        System.out.println(highest);

    }




}
/*
Write a program that can return the character that has the highest frequency from a string
	Ex:
		str = "aaabbccccddeeee"

		output:
			c
			e
 */
