package books;

public abstract class Book {

    private String title;
    private int year;

    protected boolean checkedOut;
    protected int daysTilDue;

    protected Book(String title, int year) {
        this.title = title;
        this.year = year;
        checkedOut = false;
    }

    public abstract void displayCatalogInfo();
    public abstract void checkOut();

    public void displayStatus() {
        if (checkedOut) System.out.println("Due back in " + daysTilDue + " day(s).");
        else System.out.println("On shelf.");
    }
    public void newDay() { if (checkedOut) daysTilDue--; }

    protected String getTitle() { return title; }
    protected int getYear() { return year; }
}
