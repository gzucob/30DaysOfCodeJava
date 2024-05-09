package SolutionDay17;

import java.util.Scanner;

public class Day17 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Calculator myCalculator = new Calculator();

        int numberTest = scanner.nextInt();
        scanner.nextLine();

        while (numberTest -- > 0) {
            String[] inputs = scanner.nextLine().split(" ");
            int n = Integer.parseInt(inputs[0]);
            int p = Integer.parseInt(inputs[1]);

            try {
                int result = myCalculator.power(n, p);
                System.out.println(result);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}
