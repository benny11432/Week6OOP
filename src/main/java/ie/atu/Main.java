package ie.atu;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file name (e.g., students.txt): ");
        String fileName = sc.nextLine().trim();

        System.out.print("Enter a name to save: ");
        String name = sc.nextLine().trim();

        try(PrintWriter out = new PrintWriter(new FileWriter(fileName, true)))
        {
            out.println("Saved to " + fileName);
            System.out.println("saved to " + fileName);
        }
        catch (IOException ex)
        {
            System.out.println("Could not write to file: " + ex.getMessage());
        }

    }
}