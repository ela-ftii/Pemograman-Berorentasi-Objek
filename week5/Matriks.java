package week5;

import java.util.ArrayList;
import java.util.Scanner;

public class Matriks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input ukuran matriks
        System.out.print("Masukkan jumlah baris matriks: ");
        int rows = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        int cols = scanner.nextInt();
        
        ArrayList<ArrayList<Integer>> matriksA = new ArrayList<>();
        ArrayList<ArrayList<Integer>> matriksB = new ArrayList<>();
        
        // Input matriks A
        System.out.println("Input elemen matriks A:");
        for (int i = 0; i < rows; i++) {
            matriksA.add(new ArrayList<>());
            for (int j = 0; j < cols; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                matriksA.get(i).add(scanner.nextInt());
            }
        }
        
        // Input matriks B
        System.out.println("Input elemen matriks B:");
        for (int i = 0; i < rows; i++) {
            matriksB.add(new ArrayList<>());
            for (int j = 0; j < cols; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                matriksB.get(i).add(scanner.nextInt());
            }
        }
        
        // Menu pilihan
        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan Matriks");
        System.out.println("2. Perkalian Matriks");
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            ArrayList<ArrayList<Integer>> hasilPenjumlahan = new ArrayList<>();
            for (int i = 0; i < rows; i++) {
                hasilPenjumlahan.add(new ArrayList<>());
                for (int j = 0; j < cols; j++) {
                    int sum = matriksA.get(i).get(j) + matriksB.get(i).get(j);
                    hasilPenjumlahan.get(i).add(sum);
                }
            }
            System.out.println("Hasil penjumlahan matriks A dan B:");
            for (ArrayList<Integer> row : hasilPenjumlahan) {
                System.out.println(row);
            }
        } else if (choice == 2) {
            ArrayList<ArrayList<Integer>> hasilPerkalian = new ArrayList<>();
            for (int i = 0; i < rows; i++) {
                hasilPerkalian.add(new ArrayList<>());
                for (int j = 0; j < cols; j++) {
                    int product = 0;
                    for (int k = 0; k < cols; k++) {
                        product += matriksA.get(i).get(k) * matriksB.get(k).get(j);
                    }
                    hasilPerkalian.get(i).add(product);
                }
            }
            System.out.println("Hasil perkalian matriks A dan B:");
            for (ArrayList<Integer> row : hasilPerkalian) {
                System.out.println(row);
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }
        
        scanner.close();
    }
}