package books;

public class ReferenceBook extends Book {

    public ReferenceBook(String title, int year) {
        super(title, year);
    }

    public void displayCatalogInfo() {
        System.out.println(getTitle() + " (Reference). " + getYear());
        displayStatus();
    }

    public void checkOut() { checkedOut = true; daysTilDue = 7; }
}
