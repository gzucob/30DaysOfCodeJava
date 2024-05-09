package SolutionDay8;

import java.util.HashMap;
import java.util.Scanner;

public class Day8 {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        HashMap<String, String> phoneBook = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] entry = scanner.nextLine().split(" ");
            String name = entry[0];
            String phoneNumber = entry[1];
            phoneBook.put(name, phoneNumber);
        }

        while (scanner.hasNextLine()) {
            String queryName = scanner.nextLine().trim();

            if (phoneBook.containsKey(queryName)) {
                System.out.println(queryName + "=" + phoneBook.get(queryName));
            } else {
                System.out.println("Not found");
            }
        }
        scanner.close();
    }
}
