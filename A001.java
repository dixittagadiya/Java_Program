import java.util.Scanner;

public class A001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        String userInput = scanner.nextLine();

        // Check if the input is a single character
        if (userInput.length() == 1) {
            char inputChar = userInput.charAt(0);

            // Check if the input is an alphabet letter
            if ((inputChar >= 'a' && inputChar <= 'z') || (inputChar >= 'A' && inputChar <= 'Z')) {
                // Check if the input is a vowel or consonant
                if (isVowel(inputChar)) {
                    System.out.println("Vowel");
                } else {
                    System.out.println("Consonant");
                }
            } else {
                System.out.println("Error: Not a letter.");
            }
        } else {
            System.out.println("Error: Input should be a single character.");
        }

        scanner.close();
    }

    // Function to check if a character is a vowel
    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
