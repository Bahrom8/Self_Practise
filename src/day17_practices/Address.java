package day17_practices;

public class Address {

    public int buildingNumber, zipcode;
    public String street, city, state;

    public void setAddress(int buildingNumber, int zipcode, String street, String city, String state) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String toString() {
        return "Address:\n" +
                buildingNumber + " " + street +
                "\n" + city + " " + state + ", " + zipcode;
    }
}
/*
    Create a class named Address
    Attributes:
        buildingNumber, street, city, state, zipCode

    Actions
            setInfo: sets all the instances
            toString: returns the address
                        EX:
                            7925 Jones Branch Dr
                            McLean Va, 22012
 */