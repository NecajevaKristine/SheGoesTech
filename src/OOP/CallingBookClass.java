package OOP;

public class CallingBookClass {
    public static void main(String[] args) {

        //creating new book class object
        Book book1 = new Book ();

        //set public field values
        book1.title = "Test title";
        book1.author = "Test Author";

        //set private field using setter method
        book1.setNumberOfPages(100);
        book1.printBookInfo();

        Book book2 = new Book();
        book2.title = "This is second book";
        book2.author = "Second Author";

        book2.setNumberOfPages(-50);
        book2.printBookInfo();

    }
}
