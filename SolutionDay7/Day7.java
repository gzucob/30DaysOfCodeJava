package SolutionDay7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Day7 {
    //O output tem "[]" e "," HackerRank não aceitou
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        Collections.reverse(arr);
        System.out.println(arr);
        bufferedReader.close();

          //Código utilizado pra passar no teste
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//
//        int[] array = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            array[i] = scanner.nextInt();
//        }
//
//        for (int i = N - 1; i >= 0; i--) {
//            System.out.print(array[i]);
//            if (i != 0) {
//                System.out.print(" ");
//            }
//        } scanner.close();
    }
}
