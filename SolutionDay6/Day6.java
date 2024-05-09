package SolutionDay6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < t; i++) {
            String s = bufferedReader.readLine();

            String par = "";
            String impar = "";

            for (int c = 0; c < s.length(); c++) {
                if (c % 2 == 0) {
                    par += s.charAt(c);
                } else {
                    impar += s.charAt(c);
                }
            } System.out.println(par + " " + impar);
        }
    }
}
