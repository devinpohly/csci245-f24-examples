package books;

public class RegularBook extends Book {

    private String author;

    public RegularBook(String author, String title, int year) {
        super(title, year);
        this.author = author;
    }

    public void displayCatalogInfo() {
        System.out.println(author + ". " + getTitle() + ". " + getYear());
        displayStatus();
    }

    public void checkOut() { checkedOut = true; daysTilDue = 21; }
}
