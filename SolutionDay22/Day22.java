package SolutionDay22;

import java.util.Scanner;

public class Day22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BinarySearchTree bst = new BinarySearchTree();
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            bst.insert(data);
        }
        System.out.println(bst.getHeight(bst.root));
        scanner.close();
    }
}
