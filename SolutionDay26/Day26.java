package SolutionDay26;

import java.util.Scanner;

import static SolutionDay26.CalculateFine.calculateFine;

public class Day26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int returnedDay = scanner.nextInt();
        int returnedMonth = scanner.nextInt();
        int returnedYear = scanner.nextInt();

        int dueDay = scanner.nextInt();
        int dueMonth = scanner.nextInt();
        int dueYear = scanner.nextInt();

        scanner.close();

        int fine = calculateFine(returnedDay, returnedMonth, returnedYear, dueDay, dueMonth, dueYear);
            // Exibir a multa calculada
        System.out.println(fine);
    }
}
