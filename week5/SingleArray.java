package week5;

import java.util.ArrayList;
import java.util.Scanner;

public class SingleArray {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan 5 data
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan data ke-" + (i + 1) + ": ");
            String input = scanner.nextLine();
            data.add(input);
        }

        // Menampilkan data
        for (int i = 0; i < data.size(); i++) {
            System.out.println("Hasil nilai [" + i + "] = " + data.get(i));
        }

        // Menutup scanner
        scanner.close();
    }
}