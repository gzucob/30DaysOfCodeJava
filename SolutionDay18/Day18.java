package SolutionDay18;

import java.util.Scanner;

public class Day18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        PalindromeChecker checker = new PalindromeChecker();

        for (char ch : s.toCharArray()) {
            checker.enqueueCharacter(ch);
            checker.pushCharacter(ch);
        }

        boolean isPalindrome = true;
        while (!checker.queue.isEmpty()) {
            char dequeued = checker.dequeueCharacter();
            char popped = checker.popCharacter();

            if (dequeued != popped) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The word, " + s + ", is a palindrome.");
        } else {
            System.out.println("The word, " + s + ", is not a palindrome.");
        }
    }
}
