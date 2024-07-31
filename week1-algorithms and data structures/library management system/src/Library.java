import java.util.Arrays;
import java.util.Comparator;
public class Library {
    private Book[] books;
    private int count;
    public Library(int size) {
        books = new Book[size];
        count = 0;
    }
    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }
    public Book linearSearchByTitle(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null; // Book not found
    }
    public void sortBooksByTitle() {
        Arrays.sort(books, 0, count, Comparator.comparing(Book::getTitle));
    }
    public Book binarySearchByTitle(String title) {
        int low = 0;
        int high = count - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = books[mid].getTitle().compareToIgnoreCase(title);
            if (comparison < 0) {
                low = mid + 1;
            } else if (comparison > 0) {
                high = mid - 1;
            } else {
                return books[mid];
            }
        }
        return null; // Book not found
    }
}
