package SolutionDay12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Day12 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = bufferedReader.readLine().split(" ");
        String firstName = firstLine[0];
        String lastName = firstLine[1];
        int idNumber = Integer.parseInt(firstLine[2]);

        int numScores = Integer.parseInt(bufferedReader.readLine());
        int[] testScores = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Student student = new Student(firstName, lastName, idNumber, testScores);
        System.out.println("Name: " + student.getLastName() + ", " + student.getFirstName());
        System.out.println("ID: " + student.getIdNumber());
        System.out.println("Grade: " + student.calculate());
    }
}
