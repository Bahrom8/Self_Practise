package day07_practices;

public class CappuccinoBuyer {
    public static void main(String[] args) {

        String size = "tall"; // assuming input will always be lowercase

        String sizeInfo = "";

        if(size == "tall" || size == "grande" || size == "venti"){
            if(size == "tall"){
                sizeInfo = size + ":"+
                        "\n\tprice is $3.69"+
                        "\n\t90 calories";
            } else if (size == "grande") {
                sizeInfo = size + ":"+
                        "\n\tprice is $3.99"+
                        "\n\t120 calories";
            } else if (size == "venti") {
                sizeInfo = size + ":"+
                        "\n\tprice is $4.29"+
                        "\n\t150 calories";
            }
        } else {
            sizeInfo = "Invalid Size";
        }

        System.out.println(sizeInfo);
    }
}
