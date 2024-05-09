package SolutionDay16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day16 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        try {
            int number = Integer.parseInt(s);
            System.out.println(s);
        } catch (NumberFormatException ex) {
            System.out.println("Bad String");
        }
        bufferedReader.close();
    }
}
