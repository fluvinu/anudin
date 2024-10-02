package programing;

import java.util.ArrayList;

public class AnudinDay6_sec1_1 {
    public static void main(String[] args) {
         // Create an ArrayList to store Book objects
        ArrayList<Book> bookList = new ArrayList<>();

        // Adding book objects to the ArrayList
        bookList.add(new Book(1, "Rshmirathi", "Indian Man"));
        bookList.add(new Book(2, "DO Belo ki katha", "Munshi Prem Chand"));
        bookList.add(new Book(3, "jevan vani", "Tattu Lal Goswami"));

        // Display all book details using an enhanced for loop
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
    
}

class Book {
    private int bookId;
    private String bookName;
    private String authorName;

    // Parameterized constructor
    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    // Getters
    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Book Name: " + bookName + ", Author Name: " + authorName;
    }
}

