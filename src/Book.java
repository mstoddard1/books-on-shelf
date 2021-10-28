public class Book {
    public static String bookTitle;
    public static int isbn_num;
    public static boolean isCheckedOut;

    public Book(String _bookTitle, int _isbn_num, boolean _isCheckedOut) {
        bookTitle = _bookTitle;
        isbn_num = _isbn_num;
        isCheckedOut = _isCheckedOut;
    }

    public static void printDetails(Book book) {
        System.out.println("\n---------------------------------------------");
        System.out.println("Book Name:\t"+book.bookTitle);
        System.out.println("ISBN NUM:\t" + book.isbn_num);
        if (book.isCheckedOut == true) {
            System.out.println("Status:\t\tChecked Out");
        } else {
            System.out.println("Status:\t\tNot Checked Out");
        }
        System.out.println("---------------------------------------------\n");
    }

    public static void CheckoutBook(Book book) {
        book.isCheckedOut = true;
    }

    public static void returnBook(Book book) {
        book.isCheckedOut = false;
    }


}
