package day14_practices;

public class task3_sumOfNumbers {
    public static void main(String[] args) {
        sum(50);

    }
    public static void sum(int num){

        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);

    }
}
