package day19_practices;

public class item_prices_and_ID {
    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "day27_practices.iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0,    439.50,  39.99};
        int[] itemIDs =   {12345,     12346,  12347,    12348,     12349,    12350};

        int index = 0;

        for (int i = 0; i < items.length; i++) {
            if(items[i].equals("Gloves")) {
                index = i;
            }
        }
        System.out.println("\nIndex number of the glove is: " + index);

        System.out.println();

        for (int i = 0; i < items.length; i++) {
            if(items[i].contains("iPad")){
                System.out.println(items[i] + " is in the item list");
            }
        }

        System.out.println();

        String result = "";

        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < prices.length; j++) {
                for (int k = 0; k < itemIDs.length; k++) {
                    if(result.contains(items[i])) continue;
                    if(result.contains(prices[j] + "")) continue;
                    if(result.contains(itemIDs[k] + "")) continue;

                        result += (items[i] + prices[j] + itemIDs[k]);

                        System.out.println(items[i] + " price " + prices[j] + " ID " + itemIDs[k]);

                }

            }


        }

    }
}
/*
Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "day27_practices.iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0,    439.50,  39.99};
        int[] itemIDs =   {12345,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID

 */
