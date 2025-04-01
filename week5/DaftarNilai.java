package week5;

import java.util.Scanner;

class Mahasiswa {
    String nama;
    int nilai;

    //menginisialisasi atribut nama dan nilai menggunakan parameter yang diberikan
    Mahasiswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }
}

public class DaftarNilai {
    private static Mahasiswa[] daftarMhs;
    private static int jmlmhs;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        jmlmhs = scanner.nextInt();
        scanner.nextLine(); 

        //inisialisasi array dengan ukuran yang sesuai
        daftarMhs = new Mahasiswa[jmlmhs]; 

        // Mengisi data mahasiswa
        for (int i = 0; i < jmlmhs; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            int nilai = scanner.nextInt();
            scanner.nextLine(); 

            // membuat objek mahasiswa baru dan menyimpannya dalam array daftarmhs
            daftarMhs[i] = new Mahasiswa(nama, nilai);
        }

        // Menampilkan data mahasiswa
        daftarNilai();

        // Menutup scanner
        scanner.close();
    }

    //menampilkan semua daftar mahasiswa dari nama hingga nilai
    private static void daftarNilai() {
        System.out.println("\nDaftar Mahasiswa dan Nilai:");
        for (int i = 0; i < jmlmhs; i++) {
            System.out.println("Mahasiswa [" + i + "] - Nama: " + daftarMhs[i].nama + ", Nilai: " + daftarMhs[i].nilai);
        }
    }
}