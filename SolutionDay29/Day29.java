package SolutionDay29;

import java.util.Scanner;

public class Day29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            System.out.println(bitwiseAnd(N, K));
        }
        scanner.close();
    }
    static int bitwiseAnd(int N, int K) {
        int max = 0;

        for (int A = K - 1; A > 0; A--) {
            for (int B = A + 1; B <= N; B++) {
                int current = A & B;
                if (current < K && current > max) {
                    max = current;
                }
                if (max == K - 1) {
                    return max;
                }
            }
        }
        return max;
    }
}
