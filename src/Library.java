public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("The Misadventures of the Angry Marbs", 554365, false);
        Book.printDetails(book1);
        Book.CheckoutBook(book1);
        Book.printDetails(book1);

    }
}
