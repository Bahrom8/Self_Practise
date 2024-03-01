package day07_practices;

public class FINRA {

        public static void main(String[] args) {

            int number = 10;

            String willItFINRA;

            if (number %3 == 0 && number %5 == 0){
                willItFINRA = "FINRA";
            }else if (number %3 == 0) {
                willItFINRA = "FIN";
            }else if (number %5 == 0){
                willItFINRA = "RA";
            }else {
                willItFINRA = "Nope";
            }

            System.out.println(willItFINRA);

        }

    }
/*
write a function that prints out the number. but for a number which is a multiple of 3,
print "FIN" instead of the number,
and for a number which is a multiple of 5,
print "RA" instead of the number.
and for a number that is a multiple of both 3 and 5,
print "FINRA" instead of the number.
            ex:
                number = 3

                output:
                      FIN


                number = 10

                output:
                    RA


                number = 15

                output:
                    FINRA
 */

