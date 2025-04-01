package week5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Que {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Queue Operations:");
            System.out.println("1. Insert");
            System.out.println("2. Remove");
            System.out.println("3. Peek");
            System.out.println("4. Check Empty");
            System.out.println("5. Check Full");
            System.out.println("6. Size");
            System.out.print("Your Choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (queue.size() < 5) {
                        System.out.print("Masukkan elemen: ");
                        int element = scanner.nextInt();
                        queue.add(element);
                    } else {
                        System.out.println("Queue is full. Cannot insert.");
                    }
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        System.out.println("Elemen yang dihapus: " + queue.poll());
                    } else {
                        System.out.println("Queue kosong, tidak ada elemen yang dihapus.");
                    }
                    break;
                case 3:
                    if (!queue.isEmpty()) {
                        System.out.println("Elemen di depan: " + queue.peek());
                    } else {
                        System.out.println("Queue kosong.");
                    }
                    break;
                case 4:
                    System.out.println(queue.isEmpty() ? "Queue is empty" : "Queue is not empty");
                    break;
                case 5:
                    System.out.println(queue.size() == 5 ? "Queue is full" : "Queue is not full");
                    break;
                case 6:
                    System.out.println("Size of the queue: " + queue.size());
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            System.out.print("Do you want to continue? (Type y or n): ");
            char continueChoice = scanner.next().charAt(0);
            if (continueChoice == 'n' || continueChoice == 'N') {
                break;
            }
        } while (true);

        scanner.close();
    }
}