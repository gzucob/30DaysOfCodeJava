package SolutionDay15;

import java.util.Scanner;

import static SolutionDay15.LinkedList.insert;

public class Day15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        Node head = null;

        while (t-- > 0) {
            int data = scanner.nextInt();
            head = insert(head, data);
        }

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}
