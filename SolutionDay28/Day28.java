package SolutionDay28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<String> dataPerson = new ArrayList();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine().trim();
            String[] parts = line.split(" ");
            String firstName = parts[0];
            String email = parts[1];

            if (email.endsWith("gmail.com") && !email.startsWith("gmail") && !email.startsWith("gmail.com")) {
                dataPerson.add(firstName);
            }
        }

        Collections.sort(dataPerson);

        for (String data : dataPerson) {
            System.out.println(data);
        }
        scanner.close();
    }
}
