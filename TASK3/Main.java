import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        // Sample Books
        library.addBook(new Book("Harry Potter", "J.K. Rowling"));
        library.addBook(new Book("The Alchemist", "Paulo Coelho"));
        library.addBook(new Book("Clean Code", "Robert C. Martin"));

        System.out.println("\nWelcome to the Library Management System");

        while (true) {
            System.out.println("\n1. Display Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Clear buffer

            switch (choice) {
                case 1:
                    library.displayBooks();
                    break;
                case 2:
                    System.out.print("Enter book title to issue: ");
                    String issueTitle = sc.nextLine();
                    library.issueBook(issueTitle);
                    break;
                case 3:
                    System.out.print("Enter book title to return: ");
                    String returnTitle = sc.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 4:
                    System.out.println("Exiting system. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
