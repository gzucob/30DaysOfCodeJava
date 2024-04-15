package SolutionDay4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day4 {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader bufferedReader = new BufferedReader (new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < t; i++) {
            int age = Integer.parseInt(bufferedReader.readLine());
            Person person = new Person(age);
            person.amIOld();
            person.yearPasses();
            person.amIOld();
            System.out.println();
        }
    }
}
