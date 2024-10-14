package topic_2_linkedlist_int;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\nLinked List Operations:");
            System.out.println("1. Add Element");
            System.out.println("2. Display List");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to add: ");
                    value = scanner.nextInt();
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
