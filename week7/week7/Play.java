package week7;

// Mengimpor class Character dari package week2
import week2.Character; 
import java.util.Scanner;

public class Play {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner
        Character player1 = new Character();
        // player1.setData("Cloud");
        player1 = new Character();
        Enemy enemy = new Enemy("Goblin", 150); // HP musuh > HP charakter

        System.out.println("Selamat datang di Game PBO!");
        System.out.println("HP Character: " + player1.getHp() + " | HP Enemy: " + enemy.getHp());

        try {
            while (true) {
                System.out.println("Pilih aksi:");
                System.out.println("1. Serang");
                System.out.println("2. Bertahan");
                System.out.println("3. Minum Ramuan (sisa: " + player1.getRamuan() + ")");
                System.out.println("4. Keluar");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1: // Serang
                        player1.attack(enemy);
                        if (enemy.getHp() <= 0) {
                            System.out.println("Enemy kalah! Anda menang!");
                            return; // Keluar dari permainan
                        }
                        enemy.attack(player1); // Musuh menyerang balik
                        break;
                    case 2: // Bertahan
                        enemy.attack(player1); // Musuh menyerang
                        player1.defend(15); // Misalkan damage musuh itu 15
                        break;
                    case 3: // Minum Ramuan
                        player1.minumRamuan();
                        break;
                    case 4: // Keluar
                        System.out.println("Keluar dari permainan.");
                        return;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }

                // Menampilkan HP setelah setiap aksi
                System.out.println("HP Character: " + player1.getHp() + " | HP Enemy: " + enemy.getHp());

                // Periksa kondisi Game Over
                if (player1.getHp() <= 0) {
                    System.out.println("Game Over, mulai lagi? (y/n)");
                    char restart = scanner.next().charAt(0);
                    if (restart == 'y') {
                        player1 = new Character(); // Reset karakter
                        // player1.setData("Cloud");
                        player1 = new Character();
                        enemy = new Enemy("Goblin", 150); // Reset musuh
                    } else {
                        return; // Keluar dari permainan
                    }
                }
            }
        } finally {
            scanner.close(); // Menutup Scanner di akhir program
        }
    }    
}