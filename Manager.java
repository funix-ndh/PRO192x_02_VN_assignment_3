import java.util.Scanner;

class Manager {
    public static void main(final String[] args) {
        // welcome message
        System.out.println("Welcome to the online book library");

        // choice number
        int choice;

        // exit flag
        boolean shouldExit = false;

        // scanner
        final Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("-----------------------");
            System.out.println("1. Enter a new book");
            System.out.println("2. Search a book by book title");
            System.out.println("3. Display books");
            System.out.println("4. Borrow a book by book id");
            System.out.println("5. Exit");
            System.out.print("Your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    BookList.add();
                    break;
                case 2:
                    BookList.search();
                    break;
                case 3:
                    BookList.display();
                    break;
                case 4:
                    BookList.borrow();
                    break;
                case 5:
                    shouldExit = true;
                    break;
                default:
                    System.out.println("Please choose number [1, 2, 3, 4, 5].");
                    break;
            }
        } while (!shouldExit);
        System.out.println("Thank you!");
        System.out.println("Goodbye, see you again!");
    }
}
