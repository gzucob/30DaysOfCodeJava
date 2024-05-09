package SolutionDay24;

import java.util.Scanner;

public class Day24 {
    public static Node removeDuplicates(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node current = head;

        while (current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        Node head = null;
        Node tail = null;

        for (int i = 0; i < N; i++) {
            int nodeData = scanner.nextInt();
            Node newNode = new Node(nodeData);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode; // Move tail to the end of the list
            }
        }

        head = removeDuplicates(head);

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        scanner.close();
    }
}
