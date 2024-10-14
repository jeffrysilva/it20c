package topic_2_linkedlist_string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice;
        String value;

        do {
            System.out.println("\nLinked List Operations:");
            System.out.println("1. Add String");
            System.out.println("2. Display List");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // to consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter a string to add: ");
                    value = scanner.nextLine();
                    list.add(value);
                    break;
                case 2:
                    System.out.println("Linked List: ");
                    list.display();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
