package day18_practices;

public class Test {

    public static void main(String[] args) {

        //Task 1
        Contact contact1 = new Contact();
        contact1.setInfo("Bakhrom Izzatullaev", "bakizza97@gmail.com", 818, 5737226);

        System.out.println("\n\tTask1\n");
        contact1.Call();
        contact1.sendMessage();
        contact1.sendEmail();



        //Task 2
        Offer offer1 = new Offer();
        offer1.setInfo("Los Angeles", "Billion Inc", "Software Developer",
                125000, true, true, true, true );

        System.out.println("\n\tTask2\n");
        System.out.println(offer1);

        //Task3
        Carpet carpet1 = new Carpet();
        Carpet carpet2 = new Carpet();
        carpet1.setInfo(7.5,11,150,true);
        carpet2.setInfo(7.5,11,150, false);

        System.out.println("\n\tTask3\n");
        System.out.println(carpet1);
        System.out.println();
        System.out.println(carpet2);

    }

}
