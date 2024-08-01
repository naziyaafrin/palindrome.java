import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(String word) {
        // Remove spaces and punctuation from the word
        String cleanedWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
        
        // Check if the cleaned word is equal to its reverse
        return cleanedWord.equals(new StringBuilder(cleanedWord).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or phrase to check if it's a palindrome: ");
        String word = scanner.nextLine();
        scanner.close();

        if (isPalindrome(word)) {
            System.out.println("\"" + word + "\" is a palindrome!");
        } else {
            System.out.println("\"" + word + "\" is not a palindrome.");
        }
    }
}