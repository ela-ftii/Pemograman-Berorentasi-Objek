package week6;

class FancyTextGame extends TextGame {
    @Override
    public boolean isPalindrome() {
        System.out.println("Memeriksa kata:");
        for (int i = 0; i < characters.size(); i++) {
            System.out.println(i + " = " + characters.get(i));
            try {
                Thread.sleep(200); // animasi sederhana
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        boolean result = super.isPalindrome();
        System.out.println(result ? "-> Ini adalah palindrome!" : "-> Ini bukan palindrome!");
        return result;
    }
}