package week6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dari pengguna
        System.out.print("Masukkan kata untuk dicek: ");
        String userInput = scanner.nextLine();

        TextGame game1 = new TextGame();
        game1.displayResult(userInput);

        System.out.println();

        TextGame game2 = new FancyTextGame();
        game2.displayResult(userInput);

        scanner.close();
    }
}