package SolutionDay14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        String[] elementsString = bufferedReader.readLine().split(" ");

        int[] elementsArray = new int[n];
        for (int i = 0; i < n; i++) {
            elementsArray[i] = Integer.parseInt(elementsString[i]);
        }

        Difference difference = new Difference(elementsArray);
        difference.computeDifference();
        System.out.println(difference.maximumDifference);

        bufferedReader.close();
    }
}

