package javanine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class TryWithResourcesExample {

    public static void main(String[] args) {
        BufferedReader reader1 = new BufferedReader(new StringReader("journaldev.txt"));
        try (BufferedReader reader2 = reader1) {
            System.out.println(reader2.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void java7() {
        BufferedReader reader1 = new BufferedReader(new StringReader("journaldev.txt"));
        try (BufferedReader reader2 = reader1) {
            System.out.println(reader2.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void java9() {
        BufferedReader reader1 = new BufferedReader(new StringReader("journaldev.txt"));
        try (reader1) {
            System.out.println(reader1.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
