package codes;

import java.io.FileReader;
import java.io.IOException;

public class Main17{
    public static void main(String[] args) {
        FileReader file = null;

        try {
            file = new FileReader("nonexistentfile.txt"); // This will throw a FileNotFoundException
            int data = file.read();
            System.out.println((char) data);
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred. File might not exist.");
        } finally {
            try {
                if (file != null) {
                    file.close(); // Ensures the file is closed even if an exception occurs
                    System.out.println("File closed.");
                }
            } catch (IOException e) {
                System.out.println("Error: Could not close the file.");
            }
        }
    }
}
