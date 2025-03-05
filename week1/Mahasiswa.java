package week1;
import java.util.Scanner;

public class Mahasiswa {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("NIM       : ");
        String nim = scanner.nextLine();

        System.out.print("Nama      : ");
        String nama = scanner.nextLine();

        System.out.print("Alamat    : ");
        String alamat = scanner.nextLine();

        System.out.print("Kota      : ");
        String kota = scanner.nextLine();

        System.out.print("Telp.     : ");
        String telp = scanner.nextLine();

        System.out.print("Hp.       : ");
        String hp = scanner.nextLine();

        System.out.print("Email     : ");
        String email = scanner.nextLine();

        scanner.close();

        System.out.println("\nData Pribadi:");
        System.out.println("NIM      : " + nim);
        System.out.println("Nama     : " + nama);
        System.out.println("Alamat   : " + alamat);
        System.out.println("Kota     : " + kota);
        System.out.println("Telp.    : " + telp);
        System.out.println("Hp.      : " + hp);
        System.out.println("Email    : " + email);
    }
}