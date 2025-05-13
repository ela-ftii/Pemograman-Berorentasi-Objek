package week8;

import java.util.Scanner;

public class Play {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Menampilkan menu
            System.out.println("Menu Hitung Luas Bangun Datar:");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("5. Exit");
            System.out.print("Pilih menu (1-5): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: // Persegi
                    System.out.print("Masukkan sisi persegi: ");
                    int sisi = scanner.nextInt();
                    BangunDatar persegi = new BangunDatar(sisi);
                    System.out.println("Luas Persegi: " + persegi.luas());
                    break;

                case 2: // Persegi Panjang
                    System.out.print("Masukkan panjang persegi panjang: ");
                    int panjang = scanner.nextInt();
                    System.out.print("Masukkan lebar persegi panjang: ");
                    int lebar = scanner.nextInt();
                    BangunDatar persegiPanjang = new BangunDatar(panjang, lebar);
                    System.out.println("Luas Persegi Panjang: " + persegiPanjang.luas());
                    break;

                case 3: // Segitiga
                    System.out.print("Masukkan alas segitiga: ");
                    double alas = scanner.nextDouble();
                    System.out.print("Masukkan tinggi segitiga: ");
                    double tinggi = scanner.nextDouble();
                    BangunDatar segitiga = new BangunDatar(alas, tinggi);
                    System.out.println("Luas Segitiga: " + segitiga.luas());
                    break;

                case 4: // Lingkaran
                    System.out.print("Masukkan radius lingkaran: ");
                    double radius = scanner.nextDouble();
                    BangunDatar lingkaran = new BangunDatar(radius);
                    System.out.println("Luas Lingkaran: " + lingkaran.luas());
                    break;

                case 5:
                    System.out.println("Keluat");
                    break;

                default: 
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (choice != 5); // Loop hingga pengguna memilih untuk keluar

        scanner.close(); // Menutup scanner
    }
}
