package day30_practices.bookTask;

public class TestBookObjects {

    public static void main(String[] args) {

        EBook eBook = new EBook("Last dance", "True Story", "Benjamin Rich", 18, "120MB", 87);
        System.out.println(eBook);
        eBook.readBook();

        System.out.println("--------------------------------------");

        AudioBook audioBook = new AudioBook("Learn English", "Study material", "McCallin", 45, 2, "Alex Thomas");
        System.out.println(audioBook);
        


    }

}
