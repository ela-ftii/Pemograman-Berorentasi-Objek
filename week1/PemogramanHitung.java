package week1;

import java.util.Scanner;

public class PemogramanHitung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Persegi
        System.out.print("Masukkan sisi persegi: ");
        double sisiPersegi = scanner.nextDouble(); 
        double luasPersegi = sisiPersegi * sisiPersegi;
        double kelilingPersegi = 4 * sisiPersegi;
        System.out.println("Persegi:");
        System.out.println("Luas Persegi: " + luasPersegi);
        System.out.println("Keliling Persegi: " + kelilingPersegi);
        System.out.println();

        // Segitiga
        System.out.print("Masukkan alas segitiga: ");
        double alasSegitiga = scanner.nextDouble(); 
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggiSegitiga = scanner.nextDouble(); 
        double luasSegitiga = 0.5 * alasSegitiga * tinggiSegitiga;
        // Menghitung keliling segitiga (asumsi segitiga sama sisi)
        double sisiSegitiga = Math.sqrt((alasSegitiga * alasSegitiga) + (tinggiSegitiga * tinggiSegitiga));
        double kelilingSegitiga = 3 * sisiSegitiga;
        System.out.println("Segitiga:");
        System.out.println("Luas Segitiga: " + luasSegitiga);
        System.out.println("Keliling Segitiga: " + kelilingSegitiga);
        System.out.println();

        // Lingkaran
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJariLingkaran = scanner.nextDouble(); 
        double luasLingkaran = Math.PI * jariJariLingkaran * jariJariLingkaran;
        double kelilingLingkaran = 2 * Math.PI * jariJariLingkaran;
        System.out.println("Lingkaran:");
        System.out.println("Luas Lingkaran: " + luasLingkaran);
        System.out.println("Keliling Lingkaran: " + kelilingLingkaran);
        System.out.println();

        // Kubus
        System.out.print("Masukkan sisi kubus: ");
        double sisiKubus = scanner.nextDouble(); 
        double volumeKubus = sisiKubus * sisiKubus * sisiKubus;
        double luasPermukaanKubus = 6 * (sisiKubus * sisiKubus);
        System.out.println("Kubus:");
        System.out.println("Volume Kubus: " + volumeKubus);
        System.out.println("Luas Permukaan Kubus: " + luasPermukaanKubus);

        // Menutup scanner
        scanner.close();
    }
}