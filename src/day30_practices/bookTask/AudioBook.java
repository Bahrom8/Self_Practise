package day30_practices.bookTask;

public class AudioBook extends Book{

    private double length;
    private String narrator;

    public AudioBook(String title, String type, String author, double price, double length, String narrator) {
        super(title, type, author, price);
        setLength(length);
        setNarrator(narrator);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length <= 0){
            System.err.println("Length cannot be zero or negative");
            System.exit(1);
        }
        this.length = length;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nLength: " + getLength() + " hours" +
                "\nNarrator: " + getNarrator();
    }
}
/*
Create a sub-class of Book named AudioBook:
			Extra variables:
				length, narrator

			Encapsulate all the extra fields
					Conditions:
						1. length cannot be set to zero or negative

			Add a constructor that can set all the fields

			Extra Methods:
				toString()
 */
