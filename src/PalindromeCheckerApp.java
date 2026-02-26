public class PalindromeCheckerApp {
    public static void main(String[] args){
       System.out.println("Welcome to the Palindrome Checker Management System");
       System.out.println("Version: 1.0");
       System.out.println("System initialised successfully.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check: ");
        String original = scanner.nextLine();

        String reversed = "";

        // Iterate the string in reverse order to build the reversed string
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // Compare original and reversed strings
        boolean isPalindrome = original.equals(reversed);

        // Display the result
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }

        scanner.close();
    }
}


    }

}
