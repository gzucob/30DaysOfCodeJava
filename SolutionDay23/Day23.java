//PARA QUE FUNCIONE NO HACKERRANK PRECISA JUNTAR O "public static Node" E "static void levelOrder" JUNTO A CLASS Day23

package SolutionDay23;

import java.util.Scanner;

import static SolutionDay23.LevelOrderTraversal.levelOrder;
import static SolutionDay23.Node.insert;

public class Day23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        Node root = null;

        while (t-- > 0) {
            int data = scanner.nextInt();
            root = insert(root, data);
        }

        levelOrder(root);
        scanner.close();
    }
}
