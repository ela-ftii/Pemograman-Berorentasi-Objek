package week4;
import java.util.Scanner;

public class Mainquiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quiz quiz = new Quiz(); 

        System.out.println("Selamat datang di kuis pengetahuan umum");
        System.out.println("Jumlah semua pertanyaan: " + quiz.getQuestionCount());

        // Looping untuk setiap pertanyaan
        for (int i = 0; i < quiz.getQuestionCount(); i++) {
            quiz.displayQuestion(i);
            System.out.print("Masukkan jawaban Anda (nomor): ");
            int userAnswer = scanner.nextInt(); 
            quiz.checkAnswer(i, userAnswer); 
        }

        // Tampilkan skor akhir
        System.out.println("Skor akhir Anda: " + quiz.getScore());
    }
}