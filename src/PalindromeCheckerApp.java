public class PalindromeCheckerApp {
    public static void main(String[] args){
       System.out.println("Welcome to the Palindrome Checker Management System");
       System.out.println("Version: 1.0");
       System.out.println("System initialised successfully.");

        String word = "level";
        System.out.println("Checking word: " + word);
        char[] chars = word.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;
        while (start < end)
        {
            if (chars[start] != chars[end])
            {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindrome)
        {
            System.out.println("Result: \"" + word + "\" is a palindrome.");
        }
        else
        {
            System.out.println("Result: \"" + word + "\" is NOT a palindrome.");
        }
        System.out.println("Program finished.");
    }
}



    }

}
