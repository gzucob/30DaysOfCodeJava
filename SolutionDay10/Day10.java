package SolutionDay10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String binaryRepresentation = Integer.toBinaryString(n);

        int maxConsecutiveOnes = 0;
        int currentCount = 0;

        for (int i = 0; i < binaryRepresentation.length(); i++) {
            if (binaryRepresentation.charAt(i) == '1') {
                currentCount++;
                if (currentCount > maxConsecutiveOnes) {
                    maxConsecutiveOnes = currentCount;
                }
            } else {
                currentCount = 0;
            }
        }
        System.out.println(maxConsecutiveOnes);

        bufferedReader.close();
    }
}
