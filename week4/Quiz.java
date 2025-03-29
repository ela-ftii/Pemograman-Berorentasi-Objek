package week4;

public class Quiz {
    private String[] questions = {
        "Tipe data untuk menyimpan nilai pecahan adalah?",
        "Jenis enkapsulasi yang dapat diakses oleh siapa saja?",
        "Perintah untuk melakukan input bertipe data String pada Class Scanner yaitu?",
        "Suatu kelas dapat diturunkan dari kelas yang lain, dimana atribut dari kelas semula dapat diwariskan ke kelas yang baru adalah prinsip?",
        "Mengelompokkan class – class yang saling berelasi menggunakan perintah java yaitu?",
        "Modifier yang hanya dikenal oleh dirinya dan kelas turunannya adalah?",
        "Kesatuan antara data dan fungsi, disebut?",
        "Abstraksi dari sesuatu yang mewakili dunia nyata adalah pengertian?",
        "Metode dari class file yang mnegambil panjang file adalah?",
        "Wadah yang menjadi kerangka dari sebuah objek disebut?"

    };
    
    private String[][] options = {
        {"1. Double", "2. Char", "3. Integer", "4. String"},
        {"1. Protected", "2. Public", "3. Private", "4. Private Protected"},
        {"1. Next()", "2. read()", "3. NextLine()", "4. NextString()"},
        {"1. Abtraksi", "2. Enkapsulasi", "3. Inheritance", "4. Polymorphism"},
        {"1. Private", "2. Package", "3. Import", "4. Public"},
        {"1. Class", "2. Private", "3. Public", "4. Protected"},
        {"1. Class", "2. Fungsi", "3. variabel", "4. Objek"},
        {"1. Objek", "2. Class", "3. Abstraksi", "4. Attribut"},
        {"1. delete()", "2. getName()", "3. length()", "4. exist()"},
        {"1. Method", "2. Class", "3. Main", "4. Function"}
    };
    
    private int[] correctAnswers = {1, 2, 3, 3, 2, 4, 4, 1, 3, 2}; 
    private int score = 0;
    
   
    public int getQuestionCount() {
        return questions.length; 
    }
    
    public void displayQuestion(int index) {
        System.out.println("\nPertanyaan " + (index + 1) + ": " + questions[index]);
        for (int j = 0; j < options[index].length; j++) {
            System.out.println(options[index][j]);
        }
    }
    
    public void checkAnswer(int index, int userAnswer) {
        if (userAnswer == correctAnswers[index]) {
            System.out.println("Benar!");
            score += 10;
        } else {
            System.out.println("Salah! Jawaban yang benar adalah: " + 
                options[index][correctAnswers[index] - 1]);
        }
    }
    
    // Method untuk mendapatkan skor
    public int getScore() {
        return score;
    }
}