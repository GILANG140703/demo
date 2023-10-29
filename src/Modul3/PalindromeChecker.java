package Modul3;

public class PalindromeChecker {

    /**
     * @param input
     * @return
     */
    // Method untuk memeriksa apakah sebuah string adalah palindrome
    public static boolean isPalindrome(String input) {
        // Menghapus spasi dan mengubah huruf kecil agar perbandingan tidak case-sensitive
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

        // Membandingkan string dengan kebalikan dari string tersebut
        String reversed = new StringBuilder(cleanedInput).reverse().toString();
        return cleanedInput.equals(reversed);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        String word = "level";
        /**
         *
         */
        if (isPalindrome(word)) {
            System.out.println(word + " adalah palindrome.");
        } else {
            System.out.println(word + " bukan palindrome.");
        }


        /**
         *
         */
        String phrase = "A man a plan a canal Panama";
        if (isPalindrome(phrase)) {
            System.out.println(phrase + " adalah palindrome.");
        } else {
            System.out.println(phrase + " bukan palindrome.");
        }
    }
}

