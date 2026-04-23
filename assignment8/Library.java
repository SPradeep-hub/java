import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] id = new String[100];
        String[] name = new String[100];
        int[] qty = new int[100];
        int count = 0;

        while (true) {
            System.out.println("\n1. Add Book");
            System.out.println("2. Show Books");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            int ch = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            if (ch == 1) {
                System.out.print("Book ID: ");
                id[count] = sc.nextLine();

                System.out.print("Book Name: ");
                name[count] = sc.nextLine();

                System.out.print("Quantity: ");
                while (!sc.hasNextInt()) {
                    System.out.println("Please enter a valid number:");
                    sc.next();
                }
                qty[count] = sc.nextInt();
                sc.nextLine(); // consume newline

                count++;
                System.out.println("Book added successfully.");
            } else if (ch == 2) {
                if (count == 0) {
                    System.out.println("No books in library.");
                } else {
                    for (int i = 0; i < count; i++) {
                        System.out.println(id[i] + " | " + name[i] + " | " + qty[i]);
                    }
                }
            } else if (ch == 3) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}