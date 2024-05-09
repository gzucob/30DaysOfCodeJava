package SolutionDay19;

import java.util.Scanner;

public class Day19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator myCalculator = new Calculator();
        int n = scanner.nextInt();

        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(myCalculator.divisorSum(n));
    }
}