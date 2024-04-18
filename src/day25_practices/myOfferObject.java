package day25_practices;

import java.util.ArrayList;
import java.util.Arrays;

public class myOfferObject {

    public static void main(String[] args) {

        Offer offer1 = new Offer("CA","Apple Inc", "Java Developer",
                180000,true,true, true, true);

        Offer offer2 = new Offer("NY","Tesla", "Data Analyst",
                170000,false,false, false, false);

        Offer offer3 = new Offer("CA","Facebook", "SDET",
                110000,true,false, false, true);

        Offer offer4 = new Offer("NV","AAA insurance", "Java Developer",
                140000,false,true, true, true);

        Offer offer5 = new Offer("VA","Lexus Motors", "Cyber security",
                950000,false,true, false, true);

        Offer offer6 = new Offer("FL","Microsoft Inc", "Java Developer",
                150000,true,false, true, false);

        Offer offer7 = new Offer("CA","Google Inc", "SDET",
                120000,false,true, true, false);


        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);
        System.out.println(offer6);
        System.out.println(offer7);

        System.out.println("-------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------");

        Offer[] myOffers = {offer1, offer2, offer3, offer4, offer5, offer6, offer7};

        ArrayList<Offer> fullTime = new ArrayList<>(Arrays.asList(myOffers));
        fullTime.removeIf(p-> !p.isFullTime);

        System.out.println(fullTime);

        System.out.println("-------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------");

        ArrayList<Offer> localOffer = new ArrayList<>(Arrays.asList(myOffers));
        localOffer.removeIf(p-> !p.location.equals("CA"));

        System.out.println(localOffer);

        System.out.println("-------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------");

        ArrayList<Offer> withBenefits = new ArrayList<>(Arrays.asList(myOffers));
        withBenefits.removeIf(p-> !p.hasBenefit == true);

        System.out.println(offer1.hasBenefit);

        System.out.println("-------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------");

        ArrayList<Offer> hasPTO = new ArrayList<>(Arrays.asList(myOffers));
        hasPTO.removeIf(p-> !p.hasPTO == true);

        System.out.println(hasPTO);

        System.out.println("-------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------");
        ArrayList<Offer> devOffers = new ArrayList<>(Arrays.asList(myOffers));
        devOffers.removeIf(p-> !p.jobTitle.toLowerCase().equals("developer"));

        System.out.println(devOffers);

        System.out.println("-------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------");

        ArrayList<Offer> with100K = new ArrayList<>(Arrays.asList(myOffers));
        with100K.removeIf(p-> (p.salary < 100000));

        System.out.println(with100K);









    }

}
