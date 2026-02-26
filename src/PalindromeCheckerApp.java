public class PalindromeCheckerApp {
    public static void main(String[] args){
       System.out.println("Welcome to the Palindrome Checker Management System");
       System.out.println("Version: 1.0");
       System.out.println("System initialised successfully.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check palindrome: ");
        String input = scanner.nextLine();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Enqueue and Push characters
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);      // LIFO
            queue.add(ch);       // FIFO
        }

        boolean isPalindrome = true;

        // Compare dequeue vs pop
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.remove())) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }

        scanner.close();


    }

}
