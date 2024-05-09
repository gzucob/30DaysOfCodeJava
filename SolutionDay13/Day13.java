package SolutionDay13;

import javax.naming.Name;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day13 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String title = bufferedReader.readLine();
        String author = bufferedReader.readLine();
        int price = Integer.parseInt(bufferedReader.readLine());

        MyBook book = new MyBook(title, author, price);
        book.display();
    }
}
