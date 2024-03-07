package day13_practices;

public class frequencyOfWords {

    public static void main(String[] args) {
        int variable = frequency_of_word("java java JAVA JaVA, Java jaava", "java");
        System.out.println(variable);

    }
    public static int frequency_of_word(String sentence, String word){
        String temporary = sentence.toLowerCase().replace(word.toLowerCase(),word.substring(1));// converts entire sentence to lowercase for readability
        int frequency = sentence.length()-temporary.length(); // analyzes frequency of word in sentence

        return frequency;

    }

}
/*
Create a method named frequencyOfWord that takes two arguments:
            1. sentence (String)
            2. word (String)

    The method should return the frequency of the word from the sentence

        Ex:
            frequencyOfWord("Java java jAvA", "java")  ==> 4
 */
