package SolutionDay1;

import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        double d = scanner.nextDouble();
        scanner.nextLine();
        String s = scanner.nextLine();

        int iRes = i + 4;
        System.out.println(iRes);

        double dRes = d + 4.0;
        System.out.println(dRes);

        System.out.println("HackerRank " + s);
        scanner.close();

        // TESTE 2
//        int i = 4;
//        double d = 4.0;
//        String s = "HackerRank ";
//
//        Scanner scanner = new Scanner(System.in);
//        int iRes = scanner.nextInt();
//        double dRes = scanner.nextDouble();
//        scanner.nextLine();
//        String sRes = scanner.nextLine();
//
//        System.out.println(iRes);
//        System.out.println(dRes);
//        System.out.println(sRes);
//
//        scanner.close();

        // TESTE 3
//        int i = 4;
//        double d = 4.0;
//
//        Scanner scanner = new Scanner(System.in);
//        int iRes = scanner.nextInt();
//        double dRes = scanner.nextDouble();
//        scanner.nextLine();
//        String sRes = scanner.nextLine();
//
//        iRes += i;
//        dRes += d;
//
//        System.out.println(iRes);
//        System.out.println(dRes);
//        System.out.println("HackerRank " + sRes);
//
//        scanner.close();
    }
}
