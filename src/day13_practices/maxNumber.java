package day13_practices;

public class maxNumber {
    public static void main(String[] args) {
      maxNum(8,16);
      maxNum(52,16);


    }
    public static void maxNum (int num1, int num2) {
        if( num1 > num2 ){
            System.out.println(num1 + " is max Number");
        }else{
            System.out.println(num1 + " is not max Number");
        }

    }

}
