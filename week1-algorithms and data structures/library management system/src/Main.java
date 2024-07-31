//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Library library = new Library(10);
        library.addBook(new Book("B001", "Java Programming", "Author A"));
        library.addBook(new Book("B002", "Data Structures", "Author B"));
        library.addBook(new Book("B003", "Algorithms", "Author C"));
        library.addBook(new Book("B004", "Database Systems", "Author D"));
        System.out.println("Searching for 'Data Structures' using linear search:");
        Book book = library.linearSearchByTitle("Data Structures");
        if (book != null) {
            System.out.println("Found: Book ID: " + book.getBookId() +
                    ", Title: " + book.getTitle() +
                    ", Author: " + book.getAuthor());
        } else {
            System.out.println("Book not found.");
        }
        library.sortBooksByTitle();
        System.out.println("\nSearching for 'Algorithms' using binary search:");
        book = library.binarySearchByTitle("Algorithms");
        if (book != null) {
            System.out.println("Found: Book ID: " + book.getBookId() +
                    ", Title: " + book.getTitle() +
                    ", Author: " + book.getAuthor());
        } else {
            System.out.println("Book not found.");
        }
    }
}