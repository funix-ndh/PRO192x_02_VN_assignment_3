import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * BookList
 */
class BookList {

    // initial data
    final private static List<Book> books = new ArrayList<>(Arrays.asList(
            new Book("FUNIX01", "Lab 1", "Funix 1", true),
            new Book("FUNIX02", "Phát triển game", "Funix 2", false),
            new Book("FUNIX03", "Lập trình di động", "Funix 3", false),
            new Book("FUNIX04", "Lập trình hướng đối tượng", "Funix 4", false),
            new Book("FUNIX05", "CS101 - Lab", "Funix 5", false),
            new Book("FUNIX06", "Khoa học máy tính", "Funix 6", false),
            new Book("FUNIX07", "Xây dựng Website đầu tiên", "Funix 7", false),
            new Book("FUNIX08", "Trở thành công dân số", "Funix 8", false),
            new Book("FUNIX09", "Xây dựng phần mềm đầu tiên", "Funix 9", false)));

    // add book
    static void add(final Scanner scanner) {
        System.out.println("Enter information for the new book:");

        final Book book = new Book();

        // get id
        System.out.print("ID: ");
        book.setId(scanner.nextLine().toUpperCase());

        // get title
        System.out.print("Title: ");
        book.setTitle(scanner.nextLine());

        // get author
        System.out.print("Author: ");
        book.setAuthor(scanner.nextLine());

        // get borrowed
        System.out.print("Is Borrowed (1 = yes, 0 = no): ");
        book.setBorrow(scanner.nextInt() == 1);

        // add book
        books.add(book);
        System.out.println("A new book has been added.");
    }

    // search book
    static void search(final Scanner scanner) {
        System.out.println("Enter book title to search.");

        // get search keyword
        System.out.print("Book title: ");
        final String searchTitle = scanner.nextLine();

        // find books
        final List<Book> foundBooks = new ArrayList<>();
        for (final Book book : books) {
            if (book.getTitle().contains(searchTitle)) {
                foundBooks.add(book);
            }
        }

        // print data
        if (foundBooks.isEmpty()) {
            System.out.println("No book is found");
        } else {
            printlnHeaderTable();
            for (final Book book : foundBooks) {
                System.out.println(book);
            }
        }
    }

    // display book list
    static void display() {
        printlnHeaderTable();
        for (final Book book : books) {
            System.out.println(book);
        }
    }

    static void borrow(final Scanner scanner) {
        System.out.println("Enter book ID to borrow.");

        // get id
        System.out.print("Book ID: ");
        final String searchID = scanner.nextLine();

        // find book
        for (final Book book : books) {
            if (book.getId().equalsIgnoreCase(searchID)) {
                // can not borrow if it's been already borrowed
                if (book.isBorrowed()) {
                    System.out.println("You can not borrow this book. The book have been borrowed.");
                } else {
                    // set borrowed
                    book.setBorrow(true);
                    System.out.println("You have successfully borrow the book.");
                }
                return;
            }
        }
    }

    // print helper
    static private void printlnHeaderTable() {
        System.out.println(String.format("%-10s%-40s%-20s%-20s", "ID", "Title", "Author", "Is Borrowed"));
    }
}
