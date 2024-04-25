package day30_practices.bookTask;

public class EBook extends Book {

    private String size;
    private int pages;

    public EBook(String title, String type, String author, double price, String size, int pages) {
        super(title, type, author, price);
        setSize(size);
        setPages(pages);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if(pages < 0){
            System.err.println("Pages cannot be negative");
            System.exit(1);
        }

        this.pages = pages;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nsize: " + getSize() +
                "\npages: " + getPages();
    }

    public void readBook(){
        System.out.println("I recommend you to read " + getTitle() + " by " + getAuthor());
    }

}
/*
Create a subclass of Book named EBook:
			Extra variables:
				size, pages

			Encapsulate all the extra fields
					Conditions:
						1. pages cannot be set to zero or negative

			Add a constructor that can set all the fields

			Extra Methods:
				readBook()
 */
