package Modul3;
import java.util.Scanner;

/**
 * kelas palindomrecheckeryang enyediakan metode untuk memeriksa apakah sebuah string adalah palindorme atau bukan
 */
public class PalindromeChecker {
    /**
     * memeriksa apakah sebuah string adalah palindrome
     * @param input string yang aakan di periksa
     * @return true jika string adalah palindrome,false jika tidak
     */

    public static boolean isPalindrome(String input) {
        // Menghapus spasi dan mengubah huruf kecil agar perbandingan tidak case-sensitive
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

        // Membandingkan string dengan kebalikan dari string tersebut
        String reversed = new StringBuilder(cleanedInput).reverse().toString();
        return cleanedInput.equals(reversed);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata atau kalimat untuk memeriksa apakah itu palindrome: ");
        String userInput = scanner.nextLine();

        if (isPalindrome(userInput)) {
            System.out.println(userInput + " adalah palindrome.");
        } else {
            System.out.println(userInput + " bukan palindrome.");
        }
    }
}